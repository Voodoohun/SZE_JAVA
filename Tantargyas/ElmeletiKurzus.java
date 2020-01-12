/**
 *
 * @author Dave
 */
public class ElmeletiKurzus extends Kurzus {
    
    private String tanterem;

    public ElmeletiKurzus(String kurzusNev, String kurzusKod, SzamonKeres status, String tanterem) {
        super(kurzusNev, kurzusKod, status);
        this.tanterem = tanterem;
    }

    public String getTanterem() {
        return tanterem;
    }

    public void setTanterem(String tanterem) {
        this.tanterem = tanterem;
    }

    
    
    
}
