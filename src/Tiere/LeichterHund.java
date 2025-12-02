package Tiere;

public class LeichterHund extends Hund{
    public LeichterHund(int gewicht) {
        super(gewicht);
    }

    public LeichterHund(double groesse, int gewicht, String name) {
        super(groesse, gewicht, name);
    }

    @Override
    public void setGewicht(int gewicht) {
        if (gewicht <= 10) {
            this.gewicht = gewicht;
        }
    }
}
