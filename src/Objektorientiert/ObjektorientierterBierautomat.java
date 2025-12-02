package Objektorientiert;

import java.util.Scanner;

public class ObjektorientierterBierautomat {
    private int anzahlBier = 3;
    public String name;

    private static int verkaufteBier = 0;

    public ObjektorientierterBierautomat() {

    }

    public ObjektorientierterBierautomat(String uebergebenerName) {
        this.name = uebergebenerName;
    }

    public ObjektorientierterBierautomat(String name, int anzahlBier) {
        this.name = name;
        setAnzahlBier(anzahlBier);
    }

    public int getAnzahlBier() {
        return this.anzahlBier;
    }

    public void setAnzahlBier(int anzahlBier) {
        if (anzahlBier <= 10 && anzahlBier >= 0) {
            this.anzahlBier = anzahlBier;
        } else {
            System.out.println("Es müssen zwischen 0 und 10 Biere sein.");
        }
    }

    public void einschalten() {
        System.out.println("Automat " + name + " eingeschaltet.");
        System.out.println("Anzahl Bier: " + anzahlBier);

        Scanner scan = new Scanner(System.in);

        String benutzereingabe = "";

        do {
            System.out.println("Eingeworfene Euros angeben oder mit STOP beenden: ");
            benutzereingabe = scan.next();
            System.out.println(geldEinwerfen(benutzereingabe));
        } while (!benutzereingabe.equals("STOP"));
    }

    public String geldEinwerfen(String geld) {
        if (anzahlBier > 0) {
            if (geld.equals("1")) {
                anzahlBier--;
                verkaufteBier++;
                System.out.println("Wir haben " + verkaufteBier + " verkauft.");
                return "1 Bier wird ausgegeben.";
            }
        }
        return "Fehler: Kein 1€ eingeworfen oder Vorrat leer.";
    }

    public static int getVerkaufteBier() {
        return verkaufteBier;
    }
}
