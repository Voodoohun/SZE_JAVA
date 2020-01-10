/**
 *
 * @author Dave
 */
public class Teszt {
    public static void main(String[] args) {
        
        Konyvtar tar1 = new Konyvtar("Országos Könyvtár", "Budapest Hős utca 1.");

        Alkalmazott alk1 = new Alkalmazott("Horváth Pitykó", "könyvtáros");
        Alkalmazott alk2 = new Alkalmazott("Lakatos László", "wcbácsi");

        Konyv k1 = new Konyv ("HP 1", "Rowling", "Magyar Kiadó", "1996");
        Konyv k2 = new Konyv ("HP 2", "Rowling", "Magyar Kiadó", "1998");
        Konyv k3 = new Konyv ("HP 3", "Rowling", "Magyar Kiadó", "2003");
        Konyv k4 = new Konyv ("HP 4", "Rowling", "Magyar Kiadó", "2005");
        Konyv k5 = new Konyv ("HP 5", "Rowling", "Magyar Kiadó", "2007");
        Konyv k6 = new Konyv ("HP 6", "Rowling", "Magyar Kiadó", "2012");

        tar1.dolgozoHozzaad(alk1);
        tar1.dolgozoHozzaad(alk2);

        tar1.konyvHozzaad(k1);
        tar1.konyvHozzaad(k2);
        tar1.konyvHozzaad(k3);
        tar1.konyvHozzaad(k4);
        tar1.konyvHozzaad(k5);
        tar1.konyvHozzaad(k6);

        System.out.println(tar1);

        tar1.dolgozoTorol(alk2);
        System.out.println(tar1);

        tar1.konyvTorol(k1);
        System.out.println(tar1);

        tar1.kikolcsonoz(k3);
        System.out.println(tar1);

        tar1.kikolcsonoz(k4);
        System.out.println(tar1);

        tar1.kikolcsonoz(k3);
        System.out.println(tar1);

        System.out.println("");
        System.out.println("A konyvtarban levo konyvek szama: " + tar1.konytariKonyvekSzama(tar1));
        System.out.println("A kikolcsonzott konyvek szama: " + tar1.kolcsonzottKonyvekSzama(tar1));
        
        tar1.lejartKonyvek(tar1);
    
    }
}
