/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizsgagyak;


/**
 *
 * @author ut220-15
 */
public class Vizsgagyak {

 public static void main(String[] args) {
     ATAT at1 = new ATAT(100,35,2,30);
     ATAT at2 = new ATAT(50,135,2,30);
     PTower tow1 = new PTower(200, 10);
     
     StarWars war1 = new StarWars();  
     war1.addBirodalom(at1);
     war1.addBirodalom(at2);
     war1.addLazadok(tow1);
     
     war1.osszecsapas();
       
 }
}
