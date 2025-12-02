package Tiere;

public abstract class Tier {
    private double groesse;
    private int anzahlBeine;
    protected int gewicht;

    private static int gesamtgewicht = 0;

    public Tier(double groesse, int anzahlBeine, int gewicht) {
        this.groesse = groesse;
        this.anzahlBeine = anzahlBeine;
        this.gewicht = gewicht;
        gesamtgewicht += gewicht;
    }

    public Tier(int gewicht) {
        this.gewicht = gewicht;
        gesamtgewicht += gewicht;
    }

    public void fortbewegen() {
        System.out.println("Ich bewege mich einen Meter.");
    }

    public void fortbewegen(double entfernung) {
        System.out.println("Ich bewege mich " + entfernung + " Meter.");
    }

    public void fortbewegen(int entfernung) {
        System.out.println("Ich bewege mich " + entfernung + " Meter.");
    }

    public void setGewicht(int gewicht) {
        gesamtgewicht -= this.gewicht;
        this.gewicht = gewicht;
        gesamtgewicht += this.gewicht;
    }

    public int getGewicht() {
        return this.gewicht;
    }

    //public abstract void macheGeraeusch();

    public static int getGesamtgewicht() {
        return gesamtgewicht;
    }
}
