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
public class Decvizsga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int osszeg;
        int osszDb;
        int teljesDb;
        int kulsoDb;
        int alvazDb;
        
        Auto a1 = new Auto("abc123", "Mercedes", "teljes mosás");
        Auto a2 = new Auto("hfc153", "Peugeot", "külső mosás");
        Auto a3 = new Auto("iii876", "Mercedes", "teljes mosás");
        Auto a4 = new Auto("vbv432", "Trabant", "alváz mosás");
        Auto a5 = new Auto("kio999", "Hyundai", "alváz mosás");

        
        Mososor moso1 = new Mososor();
        Mososor moso2 = new Mososor();
        
        moso2.mosas(a1);
        moso1.mosas(a2);
        moso2.mosas(a3);
        moso1.mosas(a4);
        moso1.mosas(a5);
        
        System.out.println("Az elso " + moso1.toString());
        System.out.println("A masodik " + moso2.toString());
        
        System.out.println("------------------------------------------------");
        
        osszDb = moso1.getOsszDarab() + moso2.getOsszDarab();
        System.out.println("Az osszes lemosott autok szama: " + osszDb);
        
        teljesDb = moso1.getTeljesDb() + moso2.getTeljesDb();
        System.out.println("\tA teljes mosast hasznalo autok szama: " + teljesDb);
        
        kulsoDb = moso1.getKulsoDb() + moso2.getKulsoDb();
        System.out.println("\tA kulso mosast hasznalo autok szama: " + kulsoDb);
        
        alvazDb = moso1.getAlvazDb() + moso2.getAlvazDb();
        System.out.println("\tAz alvaz mosast hasznalo autok szama: " + alvazDb);
        
        osszeg = moso1.getOsszBevetel() + moso2.getOsszBevetel();
        System.out.println("A moso osszes bevetele: " + osszeg + " Ft");
        
        System.out.println("------------------------------------------------");
        

    }
            
}
    
       
    
    

