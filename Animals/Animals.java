package Animals;

public abstract class Animals implements InteractionForOwner, HearName{

    protected String name;


    public Animals(String name) {

        this.name = name;
    }

    public Animals(){
        this("Безымянный питомец");
    }
    abstract void toSay();

    public String getName() {
        return name;
    }

}
