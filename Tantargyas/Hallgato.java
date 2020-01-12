/**
 *
 * @author Dave
 */
public class Hallgato implements Comparable{
    
    private String nev, neptun;
    private int felevek;

    public Hallgato(String nev, String neptun, int felevek) {
        this.nev = nev;
        this.neptun = neptun;
        this.felevek = felevek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public int getFelevek() {
        return felevek;
    }

    public void setFelevek(int felevek) {
        this.felevek = felevek;
    }
    
    @Override
    public int compareTo(Object o){
        return nev.compareTo(((Hallgato)o).nev);
    }

    @Override
    public String toString() {
        return "Hallgato{" + "nev=" + nev + ", neptun=" + neptun + ", felevek=" + felevek + '}';
    }
    
    
    
    
}
