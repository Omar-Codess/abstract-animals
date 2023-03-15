package org.lessons.java.animals;

public class Passerotto extends Animale{

    public Passerotto(String name, String type) {
        super(name, type);
    }

    public void verso() {
        System.out.println("Prrrr!");
    }

    public void mangia() {
        System.out.println("Cerali/semi");
    }
}
