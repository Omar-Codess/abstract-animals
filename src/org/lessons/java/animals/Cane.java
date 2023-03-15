package org.lessons.java.animals;

public class Cane extends Animale{


    public Cane(String name, String type) {
        super(name, type);
    }


    public void verso() {
        System.out.println("Bau bau!");
    }

    public void mangia() {
        System.out.println("Croccantini");
    }
}
