package org.lessons.java.animals;

public class Aquila extends Animale implements IVolante{

    public Aquila(String name, String type) {
        super(name, type);
    }

    public void verso() {
        System.out.println("Aaaaa");
    }

    public void mangia() {
        System.out.println("Lepri/conigli");
    }

    public void vola(){
        System.out.println("Sto volando!!!");
    }

}
