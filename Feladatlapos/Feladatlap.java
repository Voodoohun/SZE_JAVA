
/**
 *
 * @author Dave
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Feladatlap {
    private String temakor, korcsoport;
    private List<Feladat> feladatok;

    public Feladatlap(String temakor, String korcsoport) {
        this.temakor = temakor;
        this.korcsoport = korcsoport;
        
        feladatok = new ArrayList<>();
    }

    public String getTemakor() {
        return temakor;
    }

    public void setTemakor(String temakor) {
        this.temakor = temakor;
    }

    public String getKorcsoport() {
        return korcsoport;
    }

    public void setKorcsoport(String korcsoport) {
        this.korcsoport = korcsoport;
    }
    
    public void feladatFelvesz(Feladat fel){
        feladatok.add(fel);
        Collections.sort(feladatok);
    }
    
    public double osszpontszam(){
        double ossz = 0.0;
        for(int i=0; i<feladatok.size(); i++){
            ossz = ossz + feladatok.get(i).getPontszam();
        }
        
        return ossz;
    }

    @Override
    public String toString() {
        return  "Temakor: " + temakor + ", Korcsoport: " + korcsoport + ", Feladatok:\n" + feladatok;
    }
    
  
    
}
