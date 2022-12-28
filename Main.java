import java.util.ArrayList;

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
        gt.append(irina, jane, Relationship.parent, Relationship.children);
        gt.append(irina, ivan, Relationship.parent, Relationship.children);
        gt.append(vasya, petr, Relationship.parent, Relationship.children);
        gt.append(vasya, masha, Relationship.parent, Relationship.children);
        gt.append(ivan, jane, Relationship.brother, Relationship.sister);
        gt.append(petr, masha, Relationship.brother, Relationship.sister);
        gt.append(viktorFedorovich, irina, Relationship.grandparents, Relationship.grandchildren);
        gt.append(lybovMikhailovna, vasya, Relationship.grandparents, Relationship.grandchildren);
        gt.append(kirillMaximovich,vasya, Relationship.grandparents, Relationship.grandchildren);


        System.out.println(new Reserch(gt).spend(irina, Relationship.parent) + " - дети Ирины");
        System.out.println(new Reserch(gt).spend(vasya, Relationship.grandchildren) + " - дедушки Васи");
        System.out.println(new Reserch(gt).spendGrand(Relationship.grandparents) + " - дедушки и бабушки");
        System.out.println(new Reserch(gt).spendOlder(25) + " - старше 25 лет");
        System.out.println(new Reserch(gt).spendOlderPerson(vasya));

        Writer writeF = new Writer(gt);
        System.out.println();
        System.out.println(writeF.spend());

        System.out.println(((Person) irina).getGender());

        if(irina.compareTo(vasya) < 0)
        System.out.printf("%s Моложе Ваня \n", irina.getFullName());

        ArrayList<Person> family = new ArrayList<>();
        family.add(irina); family.add(vasya); family.add(masha); family.add(jane);
        family.add(ivan); family.add(petr);
        family.add(viktorFedorovich);
        family.add(lybovMikhailovna);
        family.add(kirillMaximovich);
        System.out.println(family);
        family.sort(new PersonAgeComparator());
        System.out.println(family);








    }

}
