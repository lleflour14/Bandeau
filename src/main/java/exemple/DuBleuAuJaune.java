package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class DuBleuAuJaune implements Effet{
    private String text;

    public DuBleuAuJaune(String text){
        this.text=text;
    }
    public DuBleuAuJaune(){
    }

    @Override
    public void effet(Bandeau b) {
        b.setMessage(text);
        b.sleep(1000);

        int bleu=255;
        for(int i=0;i<255;i+=5){
            b.setForeground(new Color(i,i,bleu));
            b.sleep(100);

            bleu-=5;

        }
    }
}
