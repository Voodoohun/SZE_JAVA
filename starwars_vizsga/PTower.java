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
public class PTower extends HarciGep implements Fegyver{
    
    public PTower(int energiaSzint, int tuzEro) {
        super(energiaSzint, tuzEro);
    }

    @Override
    public void tuzel(HarciGep gep) {
       gep.setEnergiaSzint(gep.getEnergiaSzint() - gep.getTuzEro());
    }

    @Override
    public String toString() {
        return "Gep tipusa: PTower" + " - " + getEnergiaSzint() + getTuzEro();
    }

   
    
    
    
}
