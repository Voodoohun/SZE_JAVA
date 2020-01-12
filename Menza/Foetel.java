/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class Foetel extends Etel {
    
    private String koretNev;
    
    public Foetel(int etelAr, String etelNev, String koretNev) {
        super(etelAr, etelNev);
        this.koretNev = koretNev;
    }

    public String getKoretNev() {
        return koretNev;
    }

    public void setKoretNev(String koretNev) {
        this.koretNev = koretNev;
    }
    
}
