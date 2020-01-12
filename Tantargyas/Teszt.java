/**
 *
 * @author Dave
 */



public class Teszt {
    public static void main(String[] args) {
       

        GyakorlatiKurzus gyak1 = new GyakorlatiKurzus("Algo", "GKNB_0047", SzamonKeres.FOLYAMATOS_SZAMONKERES, "A202");
        GyakorlatiKurzus gyak2 = new GyakorlatiKurzus("Matek 3", "GKNB_002", SzamonKeres.IRASBELI, "A5");
        
        ElmeletiKurzus elm1 = new ElmeletiKurzus("Háló", "GKNB_2024", SzamonKeres.SZOBELI_ES_IRASBELI, "E");
        ElmeletiKurzus elm2 = new ElmeletiKurzus("Modell", "GKNB_2000", SzamonKeres.IRASBELI, "VIP");
        
        Hallgato h1 = new Hallgato("Pista", "abcd123", 4);
        Hallgato h2 = new Hallgato("Jóska", "bcda654", 6);
        Hallgato h3 = new Hallgato("Erika", "u87h76", 3);
        Hallgato h4 = new Hallgato("Sanyi", "jiuki9", 7);
        Hallgato h5 = new Hallgato("Béla", "665s7z", 4);
        Hallgato h6 = new Hallgato("Juli", "o9o98i", 5);
        
        Nyilvantartas ny = new Nyilvantartas("2019/2020 ősz");
        
        ny.kurzusHozzaad(gyak1);
        ny.kurzusHozzaad(gyak2);
        ny.kurzusHozzaad(elm1);
        ny.kurzusHozzaad(elm2);
        
       // ny.hallgatoFelvesz(gyak1, h1);
        //ny.hallgatoFelvesz(gyak2, h2);
        
        System.out.println(ny);
        
       System.out.println(ny.kiir());
        
        
    }
}
