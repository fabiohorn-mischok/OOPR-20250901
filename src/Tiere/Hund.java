package Tiere;

public class Hund extends Tier implements Geraeuschfaehigkeit {
    private String name;

    public Hund(double groesse, int gewicht, String name) {
        super(groesse, 4, gewicht);
        this.name = name;
    }

    public Hund(int gewicht) {
        super(gewicht);
    }

    @Override
    public void setGewicht(int gewicht) {
        if (gewicht > 10) {
            super.setGewicht(gewicht);
        } else {
            System.out.println("Fehler.");
        }
    }

    @Override
    public void fortbewegen() {
        System.out.println(name + " bewegt sich einen Meter.");
    }

    public void macheGeraeusch() {
        System.out.println(name + " sagt Wuff!");
    }
}
