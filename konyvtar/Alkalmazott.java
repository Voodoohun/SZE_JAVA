public class Alkalmazott {
    
    private String alkNev, beosztas;

    public Alkalmazott(String alkNev, String beosztas) {
        this.alkNev = alkNev;
        this.beosztas = beosztas;
    }

    public String getAlkNev() {
        return alkNev;
    }

    public void setAlkNev(String alkNev) {
        this.alkNev = alkNev;
    }

    public String getBeosztas() {
        return beosztas;
    }

    public void setBeosztas(String beosztas) {
        this.beosztas = beosztas;
    }

    @Override
    public String toString() {
        return alkNev + ", " + beosztas + "\n";
    }
       
}
