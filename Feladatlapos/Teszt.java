/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class Teszt {
    public static void main(String[] args) {
        
        Feladat fel1 = new Feladat("Szöveg1", 22);
        Feladat fel2 = new Feladat("Szöveg2", 12);
        Feladat fel3 = new Feladat("Szöveg3", 5);
        Feladatlap fellap1 = new Feladatlap("Matek", "10-12");
        Diak d1 = new Diak("Kiss Pista", "10-12");
        Eredmeny e = new Eredmeny(fellap1, d1, 38);
                
              
        fellap1.feladatFelvesz(fel1);
        fellap1.feladatFelvesz(fel2);
        fellap1.feladatFelvesz(fel3);
        System.out.println(e.ertekel());

        
    }
}
