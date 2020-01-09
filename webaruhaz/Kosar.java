/**
 *
 * @author Dave
 */

import java.util.List;
import java.util.ArrayList;

public class Kosar{

   List<Termek> kosar = new ArrayList<>();
   
   public void addToKosar(Termek t){
       kosar.add(t);
   }
   
   public void removeFromKosar(Termek t){
       kosar.remove(t);
   }
   
   public int getNettoKosar(){
       int ossz = 0;
       for (int i=0; i<kosar.size(); i++){
           ossz = ossz + kosar.get(i).getNettoAr();
       }
       
       return ossz;
   }
   
   public double getBruttoKosar(){
       double ossz = 0;
       for (int i=0; i<kosar.size(); i++){
           ossz = ossz + kosar.get(i).getBruttoAr();
       }
       
       return ossz;
   }
   
   public String fizet(){
       return "A kosár tartalma:\n" + kosar.toString() + "\nFizetendő: " + getBruttoKosar(); 
   }

   
}
