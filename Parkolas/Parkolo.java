/**
 *
 * @author Dave
 */
public class Parkolo {
    
    String nev, cim, telszam;
    Parkolohely pHely;
    Parkolas parkolas;

    public Parkolo(String nev, String cim, String telszam, Parkolohely pHely, Parkolas parkolas) {
        this.nev = nev;
        this.cim = cim;
        this.telszam = telszam;
        this.pHely = pHely;
        this.parkolas = parkolas;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getTelszam() {
        return telszam;
    }

    public void setTelszam(String telszam) {
        this.telszam = telszam;
    }

    public Parkolohely getpHely() {
        return pHely;
    }

    public void setpHely(Parkolohely pHely) {
        this.pHely = pHely;
    }

    public Parkolas getParkolas() {
        return parkolas;
    }

    public void setParkolas(Parkolas parkolas) {
        this.parkolas = parkolas;
    }
    
    
}
