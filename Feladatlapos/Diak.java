/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class Diak {
    private String nev, korcsoport;

    public Diak(String nev, String korcsoport) {
        this.nev = nev;
        this.korcsoport = korcsoport;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKorcsoport() {
        return korcsoport;
    }

    public void setKorcsoport(String korcsoport) {
        this.korcsoport = korcsoport;
    }

    @Override
    public String toString() {
        return "Diak{" + "nev=" + nev + ", korcsoport=" + korcsoport + '}';
    }
    
    
    
    
}
