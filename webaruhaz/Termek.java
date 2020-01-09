/**
 *
 * @author Dave
 */

public class Termek implements Afa, Comparable {
    
    private String termekNev, gyartoNev, gyartasDatum;
    private int nettoAr;

    public Termek(String termekNev, String gyartoNev, String gyartasDatum, int nettoAr) {
        this.termekNev = termekNev;
        this.gyartoNev = gyartoNev;
        this.gyartasDatum = gyartasDatum;
        this.nettoAr = nettoAr;
    }
    
    @Override
    public int compareTo(Object o){
        return termekNev.compareTo(((Termek)o).termekNev);
    }

    public String getTermekNev() {
        return termekNev;
    }

    public void setTermekNev(String termekNev) {
        this.termekNev = termekNev;
    }

    public String getGyartoNev() {
        return gyartoNev;
    }

    public void setGyartoNev(String gyartoNev) {
        this.gyartoNev = gyartoNev;
    }

    public String getGyartasDatum() {
        return gyartasDatum;
    }

    public void setGyartasDatum(String gyartasDatum) {
        this.gyartasDatum = gyartasDatum;
    }

    public int getNettoAr() {
        return nettoAr;
    }

    public void setNettoAr(int nettoAr) {
        this.nettoAr = nettoAr;
    }
    
    @Override
    public String toString() {
        //return "Termek{" + "termekNev=" + termekNev + ", gyartoNev=" + gyartoNev + ", gyartasDatum=" + gyartasDatum + ", nettoAr=" + nettoAr + '}';
        return "Terméknév: " + termekNev + ", Gyártó: " + gyartoNev + ", Gyártási dátum: " + gyartasDatum 
                + ", Nettó ár: " + nettoAr + ", Bruttó ár: " + getBruttoAr();
    }

    @Override
    public double getBruttoAr() {
        return nettoAr + (nettoAr * AFA_ERTEK);
    }
    
    
    
}
