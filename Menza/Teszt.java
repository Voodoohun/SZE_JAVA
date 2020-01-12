/**
 *
 * @author Dave
 */
public class Teszt {
    public static void main(String[] args) {
        
        Foetel fo1 = new Foetel(1500, "Rántott csirke", "Rizs");
        Foetel fo2 = new Foetel(1250, "Rántott karaj", "Rizs");
        Foetel fo3 = new Foetel(1300, "Rántott sajt", "Hasábkrumpli");
        Foetel fo4 = new Foetel(2000, "Tenger gyümölcse", "Nemtom");
        
        Leves l1 = new Leves(600, "Erőleves", false);
        Leves l2 = new Leves(850, "Húsleves", true);
        Leves l3 = new Leves(630, "Leves3", false);
        Leves l4 = new Leves(750, "Leves4", true);
        
        Talca t1 = new Talca("Műanyag", "fehér");
        Talca t2 = new Talca("Fém", "fekete");
        
        t1.talcaraTesz(fo1, l4);
        System.out.println(t1.toString());
        
        t2.talcaraTesz(fo4, l1);
        System.out.println(t2.toString());
        t2.talcarolLevesz(fo4);
        System.out.println(t2.toString());
        
    }
}
