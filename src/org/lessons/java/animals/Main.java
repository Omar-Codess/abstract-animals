package org.lessons.java.animals;

public class Main {
    public static void main (String[] args) {
        Animale cane = new Cane("Tommy", "Mammifero");
        Animale passerotto = new Passerotto("Charlie", "Uccello");
        Animale aquila = new Aquila("Boh", "Uccello");
        Animale delfino = new Delfino("Tommy", "Mammifero");

        //CANE
        cane.verso();
        cane.mangia();
        cane.dormi();

        //PASSEROTTO
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        //AQUILA
        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        //DELFINO
        delfino.verso();
        delfino.mangia();
        delfino.dormi();

        faiVolare((IVolante) aquila);

        faiNuotare((INuotante) delfino);
    }

    public static void faiVolare(IVolante animale){
        animale.vola();
    }

    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }

}
