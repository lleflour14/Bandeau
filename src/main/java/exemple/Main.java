package exemple;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scenario s = new Scenario(b);

        TourComplet tc = new TourComplet("J'adore avoir le tourni");
        DuBleuAuJaune mc = new DuBleuAuJaune("C'est bleu ! Ah non c'est jaune");
        Clignotement c = new Clignotement("Tout clignoteeee");
        AuFurEtAMesure AfAm = new AuFurEtAMesure("Le texte disparait");


        s.addEffet(tc,3);
        s.addEffet(mc,2);
        s.addEffet(c,4);
        s.addEffet(AfAm,2);
        s.start();
    }
    }
