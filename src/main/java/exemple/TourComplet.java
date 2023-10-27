package exemple;

import bandeau.Bandeau;

public class TourComplet implements Effet{
    private String text;

    public TourComplet(String text){
        this.text=text;
    }
    public TourComplet(){
    }

    @Override
    public void effet(Bandeau b) {
        b.setMessage(text);
        b.sleep(1000);
        for (double i=0;i<2*Math.PI;i=i+(Math.PI/48.0f)){
            b.setRotation(i);
            b.sleep(10);
        }
        b.setRotation(0.0f);
        b.sleep(100);
    }

}
