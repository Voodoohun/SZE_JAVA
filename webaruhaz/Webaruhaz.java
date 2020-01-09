/**
 *
 * @author Dave
 */

import java.util.*;

public class Webaruhaz {
    
    private String aruhazNev, tulajdonos, adoSzam;
    private Set<Termek> termekek;

    public Webaruhaz(String aruhazNev, String tulajdonos, String adoSzam) {
        this.aruhazNev = aruhazNev;
        this.tulajdonos = tulajdonos;
        this.adoSzam = adoSzam;
        
        termekek = new TreeSet<>();
    }

    public String getAruhazNev() {
        return aruhazNev;
    }

    public void setAruhazNev(String aruhazNev) {
        this.aruhazNev = aruhazNev;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(String tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public String getAdoSzam() {
        return adoSzam;
    }

    public void setAdoSzam(String adoSzam) {
        this.adoSzam = adoSzam;
    }

    public void addTermekToAruhaz(Termek t){
        termekek.add(t);
    }
    
    public void deleteTermekFromAruhaz(Termek t){
        termekek.remove(t);
    }
    
    /*public String kiir(){
        return termekek.toString();
    }*/
        
    @Override
    public String toString() {
        return "Webáruhaz neve: " + aruhazNev + "\t" + " Tulajdonos: " + tulajdonos + "\t" + " Adószám: " + adoSzam + "\t" + 
                " Netto termek ar: " + getNettoOsszesen() + "\t" + " Brutto termek ar: " + getBruttoOsszesen() + "\t" + 
                "Termekek osszesen: " + termekek.size();
    }
        
    public int getNettoOsszesen(){
        List<Termek> termekList = new ArrayList<>(termekek);
        int osszNetto = 0;
        
        for(int i=0; i<termekList.size(); i++){
            osszNetto = osszNetto + termekList.get(i).getNettoAr();
        }
        
        termekList.clear();
        
        return osszNetto;
    }
    
    public double getBruttoOsszesen(){
        List<Termek> termekList = new ArrayList<>(termekek);
        double osszBrutto = 0;
        
        for(int i=0; i<termekList.size(); i++){
            osszBrutto = osszBrutto + termekList.get(i).getBruttoAr();
        }
        
        termekList.clear();
        
        return osszBrutto;
    }
}
