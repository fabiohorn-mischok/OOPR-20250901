package Objektorientiert;

public class Main {
    public static void main(String[] args) {
        ObjektorientierterBierautomat automat1 = new ObjektorientierterBierautomat("automat1");
        automat1.einschalten();

        ObjektorientierterBierautomat automat2 = new ObjektorientierterBierautomat("automat2");
        //automat2.anzahlBier = 5;
        automat2.setAnzahlBier(-50);
        int anzahlBierAutomat2 = automat2.getAnzahlBier();
         System.out.println("automat2 hat " + anzahlBierAutomat2 + " Biere.");
        automat2.einschalten();

        ObjektorientierterBierautomat automat3 = new ObjektorientierterBierautomat("automat3", 7);
        System.out.println(automat3.getAnzahlBier());
        System.out.println(automat3.name);

        System.out.println("Verkaufte Biere: " + ObjektorientierterBierautomat.getVerkaufteBier());
        double i = Math.sqrt(2);
    }
}
