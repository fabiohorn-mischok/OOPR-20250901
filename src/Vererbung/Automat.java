package Vererbung;

public class Automat {
    private String name;
    private String hersteller;

    private int bestand;
    private int verkaufteWare = 0;

    public Automat (String name, String hersteller, int bestand) {
        this.name = name;
        this.hersteller = hersteller;
        this.bestand = bestand;
    }

    public void verkaufen(int angeforderteProdukte) {
        bestand -= angeforderteProdukte;
        verkaufteWare += angeforderteProdukte;
        System.out.println(angeforderteProdukte + " Produkt(e) verkauft.");
        System.out.println("Es sind noch " + bestand + " Produkte verfügbar.");
    }
}
