package exemple;

import bandeau.Bandeau;

public class AuFurEtAMesure implements Effet{
    private String text;

    public AuFurEtAMesure(String text){
        this.text=text;
    }
    public AuFurEtAMesure(){
    }

    @Override
    public void effet(Bandeau b) {
        for(int i=0;i<text.length();i++){
            b.setMessage(text.substring(i));
            b.sleep(100);
        }


    }
}
