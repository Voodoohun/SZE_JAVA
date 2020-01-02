/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decvizsga;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Dave
 */
public class Mososor {
    
    private int osszDarab = 0;
    private int teljesDb = 0;
    private int alvazDb = 0;
    private int kulsoDb = 0;
    private int osszBevetel = 0;
    private int teljesBevetel = 0;
    private int kulsoBevetel = 0;
    private int alvazBevetel = 0;
    
    //private List<Auto> autok;
    
    public int getOsszDarab() {
        return osszDarab;
    }

    public void setOsszDarab(int osszDarab) {
        this.osszDarab = osszDarab;
    }

    public void mosas(Auto auto){
        switch (auto.getMosasTipus()) {
            case "teljes mosás":
                teljesDb++;
                teljesBevetel = teljesBevetel + 1700;
                break;
            case "külső mosás":
                kulsoDb++;
                kulsoBevetel = kulsoBevetel + 1000;
                break;
            default:
                alvazDb++;
                alvazBevetel = alvazBevetel + 800;
                break;
        }
        osszDarab = teljesDb + kulsoDb + alvazDb;
        osszBevetel = teljesBevetel + kulsoBevetel + alvazBevetel;
        
        //autok = new ArrayList<>();
        //autok.add(auto);
    }
    
   // public String tombkiir(){
    //    return autok.toString();
   // }

    public int getTeljesDb() {
        return teljesDb;
    }

    public int getAlvazDb() {
        return alvazDb;
    }

    public int getKulsoDb() {
        return kulsoDb;
    }

    public int getOsszBevetel() {
        return osszBevetel;
    }
    
    @Override
    public String toString() {
        return "soron osszesen " + osszDarab + " db autot mostak, ebbol: \n " + " Alvaz mosas: " + alvazDb + "\n " +
                " Teljes mosas: " + teljesDb + "\n " + " Kulso mosas: " + kulsoDb + "\n " + 
                " A sor teljes bevetele: " + osszBevetel + " Ft";
    }

}
    
