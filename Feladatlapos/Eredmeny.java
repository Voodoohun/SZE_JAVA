
import static java.lang.Math.round;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class Eredmeny {
    private Feladatlap felLap;
    private Diak diak;
    private int elertPont;
    
    public Eredmeny(Feladatlap felLap, Diak diak, int elertPont) {
        this.felLap = felLap;
        this.diak = diak;
        this.elertPont = elertPont;
        
        
    }
    
    public double getSzazalek(){
        return round((elertPont/felLap.osszpontszam())*100.0);
    }
    
    public String ertekel(){
        try{
            if (elertPont <= felLap.osszpontszam()){
                return diak.getNev() + " " + elertPont + " pontot ért el osszesen. Ez " + getSzazalek() + "%"+ "     "
                        + "A feladatlap " + felLap.osszpontszam() + " pontos:\n"+ felLap.toString();
            }
            else
                 throw new NagyobbPontException();
        }
        catch(NagyobbPontException n){
            System.err.println("Jaj, " + n);
            System.exit(-1);
        }
        return diak.getNev() + " " + elertPont + " pontot ért el osszesen. Ez " + getSzazalek() + "%"+ "     A feladatlap:\n"+ felLap.toString();
    }
}
