package Animals;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }
    public Dog(){
        this("Безымянная собака");
    }

    @Override
    void toSay() {
        System.out.println("Собачка " + name + " гавкает!");
    }

    @Override
    public void goToOwner(String command) {

    }

    @Override
    public void hearName(String voice) {
        if (voice.contains(this.name)) {
            toSay();
        }
    }
}
