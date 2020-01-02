/**
 *
 * @author Dave
 */

public class Teszt {
    
    public static void main(String[] args) {
        
        /*
        HIBAK:
         --egy dolgozot tobb KULONBOZO reszleghez fel lehet venni
         --rossz a kiiras sorrendje;
         --nincs megszamolva a dolgozok szama / reszleg
        */
        
        Ceg c1 = new Ceg("Lenin utca 32.");
        Ceg c2 = new Ceg("Apple Blvrd 5.");
        
        Dolgozo d1 = new Dolgozo("Kiss Pista", "valami", 30, 3, "egyetem");
        Dolgozo d2 = new Dolgozo("TUNYACSAP", "valami", 30, 3, "egyetem");
        Dolgozo d3 = new Dolgozo("TUNYACSAP", "valami", 30, 3, "egyetem");
        Dolgozo d4 = new Dolgozo("BLABLA", "valami", 30, 3, "egyetem");
        Dolgozo d5 = new Dolgozo("Al Bundi", "valami", 30, 3, "egyetem");
        Dolgozo d6 = new Dolgozo("Nagy Janos", "lskjdf", 55, 2, "altalanos");
       
        Reszleg r1 = new Reszleg("HR", "Fonok Jozsef");
        Reszleg r3 = new Reszleg("Management", "Asus Vivobook");
        Reszleg r2 = new Reszleg ("VALAMI", "Almas Korte");
        
        r1.dolgozoFelvesz(d1);
        r1.dolgozoFelvesz(d2);
        r1.dolgozoFelvesz(d6);
        r2.dolgozoFelvesz(d1);
        r1.dolgozoFelvesz(d1);
        r1.dolgozoFelvesz(d3);
        r1.dolgozoFelvesz(d4);
        r2.dolgozoFelvesz(d5);
        r3.dolgozoFelvesz(d3);
        
        c1.addReszleg(r1);
        c2.addReszleg(r2);
        c1.addReszleg(r3);
        
        System.out.println("Az elso ceg adatai: \n");
        System.out.println(c1);
        
        System.out.println("A masodik ceg adatai: \n");
        System.out.println(c2);
        
    }
}
