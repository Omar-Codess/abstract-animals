package org.lessons.java.animals;

public class Passerotto extends Animale implements IVolante{

    public Passerotto(String name, String type) {
        super(name, type);
    }

    public void verso() {
        System.out.println("Prrrr!");
    }

    public void mangia() {
        System.out.println("Cerali/semi");
    }

    public void vola(){
        System.out.println("Sto volando!!!");
    }



}
