package Animals;

public class Main {
    public static void main(String[] args) {
        Owner vasya = new Owner();
        Animals[] houseAnimals = {new Cat("Барсик"), new Dog("Бобик"), new Humster("Хома")};
        vasya.allPetsCall(houseAnimals, "Барсик иди ко мне");
        vasya.allPetsCall(houseAnimals,"Бобик идем гулять!");
        vasya.allPetsCall(houseAnimals, "Хома ты где?");
        }
    }

