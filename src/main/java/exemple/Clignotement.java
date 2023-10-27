package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotement implements Effet{
    private String text;

    public Clignotement(String text){
        this.text=text;
    }
    public Clignotement(){
    }

    @Override
    public void effet(Bandeau b) {
        b.setMessage(text);
        b.sleep(1000);
           for(int i =0;i<20;i++) {
               b.setForeground(Color.white);
               b.sleep(10);
               b.setForeground(Color.BLACK);
               b.sleep(10);
           }
        }
    }
