/**
 *
 * @author Dave
 */

import java.util.*;

public class Parkolohely {
    
    enum allapot{URES, FOGLALT, TILTOTT};
    String pHelyNev;
    List epuletek = new ArrayList<>();
    List epuletEmeletek = new ArrayList<>();
    List pHelyNevek = new ArrayList<>();
    List pHelyAllapotok = new ArrayList<>();

    public Parkolohely() {
        
    }
    
    public void addEpulet(String nev, int emeletek){      
       epuletek.add(nev);       
       epuletEmeletek.add(emeletek);
    }
    
    public String addParkolok(String epuletNev, int emelet, int pHelyDarab){
        int i;
        i = epuletek.indexOf(epuletNev);
        if (emelet <= (int)epuletEmeletek.get(i)){
                for(int k = 1; k<=pHelyDarab; k++){
                    pHelyNevek.add(epuletNev + emelet + "-" + k);
                    pHelyAllapotok.add(allapot.URES);
                }
        }
        else{
            System.out.println("anyád");
        }
        
        return pHelyNevek.toString();
    }
    
    public void beParkol(Parkolas parkolas){
        int index = pHelyNevek.indexOf(parkolas.pHely);
        if(index != -1){
           pHelyAllapotok.set(index, allapot.FOGLALT);
        }
    }
    
    public void kiParkol(Parkolas parkolas){
        int index = pHelyNevek.indexOf(parkolas.pHely);
        if(index != -1){
           pHelyAllapotok.set(index, allapot.URES);
        }
    }
    
    public String kiir(){
        return pHelyAllapotok.toString();
    }
    

    
}
