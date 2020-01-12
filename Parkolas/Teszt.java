/**
 *
 * @author Dave
 */

import java.time.*;

public class Teszt {
    public static void main(String[] args) {
        

        Parkolohely phely = new Parkolohely();
        Parkolas p1 = new Parkolas("ABC-123", "C3-1", LocalDateTime.of(2020, Month.JANUARY, 2, 12, 12));
        Parkolo parkolo = new Parkolo("A", "B", "c", phely, p1);
        
        phely.addEpulet("A", 3);
        phely.addEpulet("B", 6);
        phely.addEpulet("C", 8);
        System.out.println(phely.addParkolok("C", 1, 5));
        System.out.println(phely.addParkolok("C", 2, 7));
        System.out.println(phely.addParkolok("C", 3, 15));
        
        phely.beParkol(p1);
        System.out.println(phely.kiir());
        phely.kiParkol(p1);
        System.out.println(phely.kiir());
        
    }
}
