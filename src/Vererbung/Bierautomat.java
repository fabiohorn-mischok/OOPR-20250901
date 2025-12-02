package Vererbung;

import java.util.Scanner;

public class Bierautomat extends Automat{

    public Bierautomat(String name, String hersteller, int bestand) {
        super(name, hersteller, bestand);
    }

    @Override
    public void verkaufen(int angeforderteProdukte) {

        if (alterscheck()) {
            super.verkaufen(angeforderteProdukte);
        } else {
            System.out.println("Schade.");
        }
    }

    private boolean alterscheck() {
        System.out.println("Sind Sie über 16? (j/n)");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input.equals("j");
    }
}
