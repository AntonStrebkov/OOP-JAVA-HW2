package Animals;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    public Cat(){
        this("Безымянный котик");
    }

    @Override
    void toSay() {
        System.out.println("Котик " + name + " мяукает!");
    }

    @Override
    public void goToOwner(String command) {
        if (command.equals("кис-кис")) {
            System.out.println("Котик " + name + " идет к хозяину");
        } else {
            System.out.println("Котик " + name + "  не идет к хозяину");
        }

    }

    private void accept() {
        System.out.println("Котик " + name + " подходит");
    }

    private void reject() {
        System.out.println("Котик " + name + " игнорирует");
    }

    @Override
    public void hearName(String voice) {
        if (voice.contains(this.name)) {
            accept();
            toSay();
        } else {
            reject();
        }
    }
}
