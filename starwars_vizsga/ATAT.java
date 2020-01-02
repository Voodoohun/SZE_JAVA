/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizsgagyak;

/**
 *
 * @author ut220-15
 */
public class ATAT extends HarciGep implements Fegyver, Jarmu {

    int sebesseg;
    int tavolsag;
    
    public ATAT(int energiaSzint, int tuzEro, int sebesseg, int tavolsag) {
        super(energiaSzint, tuzEro);
        this.sebesseg = sebesseg;
        this.tavolsag = tavolsag;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }

    public int getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }
    

    @Override
    public void tuzel(HarciGep gep) {
       gep.setEnergiaSzint(gep.getEnergiaSzint() - getTuzEro());
    }

    @Override
    public void mozog() {
        /*if (getTavolsag() - getSebesseg() < 0)
               setTavolsag(0);
        else
            setTavolsag(getTavolsag() - getSebesseg()); */
        
        setTavolsag(Math.max(0, getTavolsag()-getSebesseg()));
    }

    @Override
    public String toString() {
        return "ATAT" + " - " +getEnergiaSzint()+ " - " + getTuzEro();
    }
    
    
    
    
    
}
