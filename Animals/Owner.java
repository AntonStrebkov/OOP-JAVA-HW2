package Animals;

import java.util.Scanner;

public class Owner{
    private String name;
    private int year;

    public String setCommand() {
        Scanner in = new Scanner(System.in);
        String command = in.next();
        return command;
    }

    public void callable(Animals[] animals, String phrase) {
        if (animals.length > 0) {
            for (Animals pet : animals) {
                pet.hearName(phrase);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void allPetsCall(Animals[] pets, String voice) {
        System.out.println("Реакция всех животных на фразу: " + voice);
        callable(pets, voice);
        System.out.println("");
    }
}
