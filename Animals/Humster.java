package Animals;

public class Humster extends Animals {

    public Humster(String name) {
        super(name);
    }

    public Humster(){
        this("Безымянный хомяк");
    }

    @Override
    void toSay() {
        System.out.println("Хомячок " + name + " пищит");
    }

    @Override
    public void goToOwner(String command) {

    }

    @Override
    public void hearName(String voice) {
        System.out.printf("%s Не реагирует ", this.name);
    }
}
