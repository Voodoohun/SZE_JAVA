/**
 *
 * @author Dave
 */



public class GyakorlatiKurzus extends Kurzus{
    
    private String labor;

    public GyakorlatiKurzus(String kurzusNev, String kurzusKod, SzamonKeres status, String labor) {
        super(kurzusNev, kurzusKod, status);
        this.labor = labor;

    }


    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

   
    
    
    
}
