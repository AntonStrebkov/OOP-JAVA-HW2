public class Main {
    public static void main(String[] args) {
        Person irina = new PersonWoman("Ирина", 35);
        Person vasya = new PersonMan("Вася", 36);
        Person masha = new PersonWoman("Маша", 24);
        Person jane = new PersonWoman("Женя", 13);
        Person ivan = new PersonMan("Ваня", 11);
        Person petr = new PersonMan("Петя", 4);
        Person viktorFedorovich = new PersonMan("Виктор Федорович", 64);
        Person lybovMikhailovna = new PersonWoman("Любовь Михайловна", 60);
        Person kirillMaximovich = new PersonMan("Кирилл Максимович", 56);
        GeoTree gt = new GeoTree();
        gt.append(irina, jane);
        gt.append(irina, ivan);
        gt.append(vasya, petr);
        gt.append(vasya, masha);
        gt.addendBS(ivan, jane);
        gt.addendBS(petr, masha);
        gt.appendG(viktorFedorovich, irina);
        gt.appendG(lybovMikhailovna, vasya);
        gt.appendG(kirillMaximovich,vasya);


        System.out.println(new Reserch(gt).spend(irina, Relationship.parent) + " - дети Ирины");
        System.out.println(new Reserch(gt).spend(vasya, Relationship.grandchildren) + " - дедушки Васи");
        System.out.println(new Reserch(gt).spendGrand(Relationship.grandparents) + " - дедушки и бабушки");
        System.out.println(new Reserch(gt).spendOlder(25) + " - старше 25 лет");
        System.out.println(new Reserch(gt).spendOlderPerson(vasya));

        Writer writeF = new Writer(gt);
        System.out.println();
        System.out.println(writeF.spend());

        System.out.println(((Person) irina).getGender());







    }

}
