/**
 *
 * @author Dave
 */

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;



public class Nyilvantartas {
    
    private String felev;
    private Set<Kurzus> kurzusok;
    private List<Set<Kurzus>> hallgatok;
    
    public Nyilvantartas(String felev) {
        this.felev = felev;
        kurzusok = new TreeSet<>();
        hallgatok = new ArrayList<Set<Kurzus>>();
    }

    public String getFelev() {
        return felev;
    }

    public void setFelev(String felev) {
        this.felev = felev;
    }

    public Set<Kurzus> getKurzusok() {
        return kurzusok;
    }

    public void setKurzusok(Set<Kurzus> kurzusok) {
        this.kurzusok = kurzusok;
    }
    
    public void kurzusHozzaad(Kurzus k){
        kurzusok.add(k);
    }
    
    public void hallgatoFelvesz(Kurzus k, Hallgato h){
        if (kurzusok.contains(k)){
           hallgatok.add(kurzusok);

        }
    }
    
    public String kiir(){
        return kurzusok.toString();
    }
    
    public void szures(int limit){
        
    }

    @Override
    public String toString() {
        return "Nyilvantartas{" + "felev=" + felev + ", kurzusok=" + kurzusok + hallgatok + '}';
    }
    
    /*public String kiir(){
        return hallgatokLista.toString();
    }*/
    
    
}
