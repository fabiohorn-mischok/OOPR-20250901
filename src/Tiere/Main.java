package Tiere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hund hund1 = new Hund(5, 2, "Bello");

        hund1.macheGeraeusch();
        hund1.fortbewegen();
        hund1.setGewicht(1000000);

        Katze katze1 = new Katze(3, 1, "Telefonmann");
        katze1.macheGeraeusch();

        LeichterHund leichterHund1 = new LeichterHund(1, 1, "Fliege");
        leichterHund1.setGewicht(2);
        System.out.println("Leicher Hund Gewicht: " + leichterHund1.getGewicht());


        Flugfaehigkeit vogel1 = new Vogel(1, 1);
        vogel1.fliegen();

        System.out.println("Alle Tiere haben ein Gewicht von " + Tier.getGesamtgewicht());
    }
}
