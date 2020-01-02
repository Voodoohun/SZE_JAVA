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
public abstract class HarciGep {  //nem lehet objektumokat letrehozni! => absztrakt
    
    private int energiaSzint;
    private int tuzEro;

    public HarciGep(int energiaSzint, int tuzEro) {
        this.energiaSzint = energiaSzint;
        this.tuzEro = tuzEro;
    }

    public int getEnergiaSzint() {
        return energiaSzint;
    }
    
    
    public void setEnergiaSzint(int energiaSzint) {
        this.energiaSzint = energiaSzint;
    }

    public int getTuzEro() {
        return tuzEro;
    }

    public void setTuzEro(int tuzEro) {
        this.tuzEro = tuzEro;
    }
    
    
    
    
}
