/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decvizsga;



/**
 *
 * @author Dave
 */
public class Auto extends Mososor{
    
    private String rendszam;
    private String tipus;
    private String mosasTipus;
    
    

    public Auto(String rendszam, String tipus, String mosasTipus) {
        this.rendszam = rendszam;
        this.tipus = tipus;
        this.mosasTipus = mosasTipus;
    }
    
    
    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getMosasTipus() {
        return mosasTipus;
    }

    public void setMosasTipus(String mosasTipus) {
        this.mosasTipus = mosasTipus;
    }

    @Override
    public String toString() {
        //return "auto{" + "rendszam=" + rendszam + ", tipus=" + tipus + ", mosasTipus=" + mosasTipus + '}';
        return "Auto tipusa: " + tipus + " - " + "Rendszam: " + rendszam + " - " + "Mosas tipusa: " + mosasTipus ;
    }
        
}
