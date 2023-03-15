package org.lessons.java.animals;

public abstract class Animale {
    private String name;
    private String type;


    public Animale(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void dormi(){
        System.out.println("Zzzzzzz");
    };

    public abstract void verso();
    public abstract void mangia();
}
