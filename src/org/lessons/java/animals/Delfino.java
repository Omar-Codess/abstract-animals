package org.lessons.java.animals;

public class Delfino extends Animale implements INuotante{
    public Delfino(String name, String type) {
        super(name, type);
    }

    public void verso() {
        System.out.println("Fsssssss");
    }

    public void mangia() {
        System.out.println("Pesci");
    }

    public void nuota(){
        System.out.println("Sto nuotando!!!");
    }

}
