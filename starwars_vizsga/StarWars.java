package vizsgagyak;


import java.util.*;

public class StarWars {
 
    private final List<ATAT> birodalom;
    private final List<PTower> lazadok;
    
    public StarWars(){
        birodalom = new ArrayList();
        lazadok = new ArrayList();
    }
       
    public void addBirodalom(ATAT gep){
        birodalom.add(gep);
    }
    
    public void addLazadok(PTower gep){
        lazadok.add(gep);
    }
    
    public void osszecsapas(){
        
        Random rnd = new Random();
        int atat_db = 0;
        
        while( !(birodalom.isEmpty() || lazadok.isEmpty()) ){
           ATAT birodalmi = birodalom.get(rnd.nextInt(birodalom.size()));
           PTower lazado = lazadok.get(rnd.nextInt(lazadok.size()));
           
           birodalmi.mozog();
           birodalmi.tuzel(lazado);
           lazado.tuzel(birodalmi);
           
           if(birodalmi.getEnergiaSzint() <= 0)
               birodalom.remove(birodalmi);
           if (lazado.getEnergiaSzint() <= 0)
                lazadok.remove(lazado);
           
           if(birodalom.contains(birodalmi) && birodalmi.getTavolsag() == 0){
               atat_db++;
           }
           
           if (atat_db == 2)
               break;
        }
        
        if (atat_db == 2){
                System.out.println("A birodalmiak gyoztek!");
        }
        else if (birodalom.isEmpty() && lazadok.isEmpty()){
            System.out.println("Dontetlen!");
        }
        else if (birodalom.isEmpty()){
            System.out.println("Gyoztek a lazadok!");
        }
        else
            System.out.println("Gyoztek a birodalmiak!");
    }
}
