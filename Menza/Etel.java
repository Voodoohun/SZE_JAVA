/**
 *
 * @author Dave
 */
public abstract class Etel implements Comparable {
    
    private int etelAr;
    private String etelNev;
    enum dieta{NORMÁL, VEGA, PALEO, FITNESS};

    
    public Etel(int etelAr, String etelNev) {
        this.etelAr = etelAr;
        this.etelNev = etelNev;
  
    }

    @Override
    public String toString() {
        return etelNev + " - " + etelAr + " Ft";
    }

    public int getEtelAr() {
        return etelAr;
    }

    public void setEtelAr(int etelAr) {
        this.etelAr = etelAr;
    }

    public String getEtelNev() {
        return etelNev;
    }

    public void setEtelNev(String etelNev) {
        this.etelNev = etelNev;
    }
    
    @Override
    public int compareTo(Object o){
        return etelNev.compareTo(((Etel)o).etelNev);
    }
}
