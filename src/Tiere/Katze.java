package Tiere;

public class Katze extends Tier implements Geraeuschfaehigkeit{
    private String name;

    public Katze(int gewicht) {
        super(gewicht);
    }

    public Katze(double groesse, int gewicht, String name) {
        super(groesse, 4, gewicht);
        this.name = name;
    }

    public void macheGeraeusch() {
        System.out.println(name + " sagt Miau!.");
    }
}
