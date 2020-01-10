import java.time.*;

public class Konyv {
    
    private String cim, szerzo, kiado, kiadasEve;
    boolean kolcsonozve;
    LocalDateTime kolcsonzesNapja;

    public Konyv(String cim, String szerzo, String kiado, String kiadasEve) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiado = kiado;
        this.kiadasEve = kiadasEve;
        kolcsonozve = false;
        kolcsonzesNapja = null;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public String getKiadasEve() {
        return kiadasEve;
    }

    public void setKiadasEve(String kiadasEve) {
        this.kiadasEve = kiadasEve;
    }

    public boolean isKolcsonozve() {
        return kolcsonozve;
    }

    public void setKolcsonozve(boolean kolcsonozve) {
        this.kolcsonozve = kolcsonozve;
    }

    public LocalDateTime getKolcsonzesNapja() {
        return kolcsonzesNapja;
    }

    public void setKolcsonzesNapja(LocalDateTime kolcsonzesNapja) {
        this.kolcsonzesNapja = kolcsonzesNapja;
    }

    @Override
    public String toString() {
        if (kolcsonzesNapja!= null )
            return szerzo + " - " + cim + " | " + kiado + " " + kiadasEve + " " +kolcsonzesNapja + "\n"; 
        else
            return szerzo + " - " + cim + " | " + kiado + " " + kiadasEve + "\n";
    }
    
}
