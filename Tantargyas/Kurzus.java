/**
 *
 * @author Dave
 */


public abstract class Kurzus implements Comparable {
    
    private String kurzusNev, kurzusKod;
    private SzamonKeres status;


    public Kurzus(String kurzusNev, String kurzusKod, SzamonKeres status) {
        this.kurzusNev = kurzusNev;
        this.kurzusKod = kurzusKod;
        this.status = status;
    }

    public String getKurzusNev() {
        return kurzusNev;
    }

    public void setKurzusNev(String kurzusNev) {
        this.kurzusNev = kurzusNev;
    }

    public String getKurzusKod() {
        return kurzusKod;
    }

    public void setKurzusKod(String kurzusKod) {
        this.kurzusKod = kurzusKod;
    }
    
     public SzamonKeres getSzamonkeres() {
        return status;
    }

    public void setSzamonkeres(SzamonKeres status) {
        this.status = status;
    }
    
    @Override
    public int compareTo(Object o){
        return kurzusNev.compareTo(((Kurzus)o).kurzusNev);
    }
    
    
  
}
