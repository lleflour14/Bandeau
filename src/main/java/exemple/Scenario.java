package exemple;

import bandeau.Bandeau;

import java.util.HashMap;
import java.util.Map;

public class Scenario {
    private Bandeau b;
    private HashMap<Effet,Integer> listEffets;

    public Scenario(Bandeau b) {
        this.b = b;
        this.listEffets = new HashMap<Effet,Integer>();
    }

    public void addEffet(Effet e, int repetition){
        listEffets.put(e,repetition);
    }

    public void start(){
        for(Map.Entry<Effet,Integer> map : listEffets.entrySet()){

            for(int i=0;i<map.getValue();i++){
                map.getKey().effet(b);
            }
        }

        b.close();
    }
}
