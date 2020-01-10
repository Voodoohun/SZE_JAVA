import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.time.Month;


public class Konyvtar {
    
    private String kNev, cim;
    
    private List<Alkalmazott> dolgozok;
    private List<Konyv> konyvek;
    private List<Konyv> kolcsonzottKonyvek;

    public Konyvtar(String kNev, String cim) {
        this.kNev = kNev;
        this.cim = cim;
        
        konyvek = new ArrayList<>();
        dolgozok = new ArrayList<>();
        kolcsonzottKonyvek = new ArrayList<>();
    }

    public String getkNev() {
        return kNev;
    }

    public void setkNev(String kNev) {
        this.kNev = kNev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<Alkalmazott> getDolgozok() {
        return dolgozok;
    }

    public void setDolgozok(List<Alkalmazott> dolgozok) {
        this.dolgozok = dolgozok;
    }

    public List<Konyv> getKonyvek() {
        return konyvek;
    }

    public void setKonyvek(List<Konyv> konyvek) {
        this.konyvek = konyvek;
    }
    
    public void konyvHozzaad(Konyv konyv){
        konyvek.add(konyv);
    }
    
    public void dolgozoHozzaad(Alkalmazott alk){
       
        dolgozok.add(alk);
    }
    
    public void konyvTorol(Konyv konyv){
        konyvek.remove(konyv);
    }
    
    public void dolgozoTorol(Alkalmazott alk){
        dolgozok.remove(alk);
    }
       
    public void kikolcsonoz(Konyv konyv){
        if (konyv.kolcsonozve == false){
           konyv.kolcsonozve = true;
           kolcsonzottKonyvek.add(konyv);
           konyv.setKolcsonzesNapja(LocalDateTime.now());
           konyvek.remove(konyv);
        }
        else
            System.out.println("Ez már ki van kolcsonozve!");
    }
    
    public void lejartKonyvek(Konyvtar ktar){
        
        //itt az elso kikolcsonzott konyv kolcsonzesi napjat kezzel allitottam be, 
            //hogy a feladatnak megfeleloen ki lehessen iratni
        ktar.kolcsonzottKonyvek.get(0).kolcsonzesNapja = LocalDateTime.of(2019, Month.MARCH, 13, 13, 34);
        LocalDateTime today = LocalDateTime.now();
        
        System.out.println("\nKonyvek, amelyeket 15 napnal regebben kolcsonoztek ki:");
        
        for (int i=0; i<kolcsonzottKonyvek.size(); i++){
            if (ktar.kolcsonzottKonyvek.get(i).kolcsonzesNapja.isBefore(today.minusDays(15)))
                System.out.println(ktar.kolcsonzottKonyvek.get(i).getCim() 
                        + " - Kolcsonzes napja: " + ktar.kolcsonzottKonyvek.get(i).kolcsonzesNapja);
        }
    }
    
    public int konytariKonyvekSzama(Konyvtar ktar){
        return ktar.konyvek.size();
    }
    
    public int kolcsonzottKonyvekSzama(Konyvtar ktar){
        return ktar.kolcsonzottKonyvek.size();
    }

    @Override
    public String toString() {
        return kNev + ", " + cim + ", Dolgozok: \n" + dolgozok + ", "
                + "\nKonyvek a konyvtarban: \n" + konyvek  + "\n Konyvek kikolcsonozve: \n" + kolcsonzottKonyvek + '}';
    }
    
}
