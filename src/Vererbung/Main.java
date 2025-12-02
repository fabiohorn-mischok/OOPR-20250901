package Vererbung;

public class Main {
    public static void main(String[] args) {
//        Automat automat1 = new Automat("automat1", "Snackladen", 5);
//        automat1.verkaufen(5);

        Bierautomat bierautomat1 = new Bierautomat("bierautomat1", "Bierbrunnen", 5);
        bierautomat1.verkaufen(3);
        System.out.println("Ich bin der Uwe, und bin auch mit dabei");
    }


}
