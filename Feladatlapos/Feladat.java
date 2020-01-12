/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class Feladat implements Comparable {
    private String szoveg;
    private Integer pontszam;

    public Feladat(String szoveg, int pontszam) {
        this.szoveg = szoveg;
        this.pontszam = pontszam;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "\nFeladat szovege: " + szoveg + ", Pontszam: " + pontszam ;
    }
    
    @Override
    public int compareTo(Object o){
        return pontszam.compareTo(((Feladat)o).pontszam);
    }
    
    
}
