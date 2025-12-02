package NichtObjektorientiert;

import java.util.Scanner;

public class Bierautomat {
    public static int anzahlBier = 3;

    public static void main(String[] args) {
        System.out.println("Automat eingeschaltet.");

        Scanner scan = new Scanner(System.in);

        String benutzereingabe = "";

        do {
            System.out.println("Eingeworfene Euros angeben oder mit STOP beenden: ");
            benutzereingabe = scan.next();
            System.out.println(geldEinwerfen(benutzereingabe));
        } while (!benutzereingabe.equals("STOP"));
    }

    public static String geldEinwerfen(String geld) {
        if (anzahlBier > 0) {
            if (geld.equals("1")) {
                anzahlBier--;
                return "1 Bier wird ausgegeben.";
            }
        }
        return "Fehler: Kein 1€ eingeworfen oder Vorrat leer.";
    }
}