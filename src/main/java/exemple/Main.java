package exemple;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scenario s = new Scenario(b);

        TourComplet tc = new TourComplet("J'adore avoir le tourni");


        s.addEffet(tc,3);
        s.start();
    }
    }
