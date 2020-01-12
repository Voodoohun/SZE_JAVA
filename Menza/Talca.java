/**
 *
 * @author Dave
 */

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class Talca {
    
    private String anyag, szin;
    private Set<Foetel> foEtelek;
    private Set<Leves> levesek;

    public Talca(String anyag, String szin) {
        this.anyag = anyag;
        this.szin = szin;
        
        foEtelek = new TreeSet<>();
        levesek = new TreeSet<>();
    }
    
    public void talcaraTesz(Foetel fo, Leves lev){
       foEtelek.add(fo);
       levesek.add(lev);
    }
    
    public void talcarolLevesz(Leves lev){
       levesek.remove(lev);
    }
    
    public void talcarolLevesz(Foetel fo){
       foEtelek.remove(fo);
    }
    
    public int getOsszAr(){
        List<Foetel> foetelList = new ArrayList<>(foEtelek);
        List<Leves> levesList = new ArrayList<>(levesek);
        int osszeg1 = 0;
        int osszeg2 = 0;

        for (int i=0; i<foEtelek.size(); i++){
            osszeg1 = osszeg1 + foetelList.get(i).getEtelAr();
        }
        for (int i = 0; i < levesek.size(); i++) {
            osszeg2 = osszeg2 + levesList.get(i).getEtelAr();
        }
        foetelList.clear();
        levesList.clear();
        return osszeg1+osszeg2;
    }

    @Override
    public String toString() {
        return "A talca adatai:\n" + "Anyaga: " + anyag + ", Szine: " + szin + ", Ételek: " + foEtelek + ", " + levesek + ", Ara: " + getOsszAr();
    }
    
    
    
}
