package Tiere;

public class Vogel extends Tier implements Geraeuschfaehigkeit, Flugfaehigkeit{
    public Vogel(double groesse, int gewicht) {
        super(groesse, 2, gewicht);
    }

    @Override
    public void fliegen() {
        System.out.println("Vogel fliegt einen Meter.");
    }

    @Override
    public void fliegen(double entfernung) {
        System.out.println("Vogel fliegt " + entfernung + " Meter.");
    }

    @Override
    public void macheGeraeusch() {
        System.out.println("Vogel zwitschert.");
    }
}
