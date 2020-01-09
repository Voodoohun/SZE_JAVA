/**
 *
 * @author Dave
 */

public class Teszt {
    public static void main(String[] args) {
        
        Webaruhaz web = new Webaruhaz("Alza", "Mr. Cartman", "17672-12-2");
        
        Kosar kosar = new Kosar();
        
        Termek t1 = new Termek("Porszívó", "Philips", "2019.01.07.", 20000);
        Termek t2 = new Termek("Porszívó", "Philips", "2019.01.07.", 20000);
        Termek t3 = new Termek("Ricsárd", "LOL", "1998.10.10.", 5);
        Termek t4 = new Termek("Alma", "Almafa", "2019.01.09.", 120);
        Termek t5 = new Termek("Laptop", "Samsung", "2018.12.12.", 320000);
        Termek t6 = new Termek("Monitor", "Asus", "2018.12.10.", 75600);
        
        web.addTermekToAruhaz(t3);
        web.addTermekToAruhaz(t4);
        web.addTermekToAruhaz(t2);
        web.addTermekToAruhaz(t1); //nem adja hozza
        web.addTermekToAruhaz(t1); //nem adja hozza
        web.addTermekToAruhaz(t5);
        web.addTermekToAruhaz(t6);
        
        //System.out.println(web.kiir());
        System.out.println("Törlés előtt:");
        System.out.println(web);
        System.out.println("");
        web.deleteTermekFromAruhaz(t2);
        
        //System.out.println(web.kiir());
        System.out.println("Törlés után:");
        System.out.println(web);
        
        System.out.println("");
        kosar.addToKosar(t6);
        kosar.addToKosar(t5);
        
        kosar.addToKosar(t3);
        kosar.removeFromKosar(t3);
        
        System.out.println(kosar.fizet()); 
       

    }
}
