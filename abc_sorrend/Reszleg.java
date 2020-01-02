import java.util.*;

public class Reszleg {
    
    private String rName;
    private String boss;
    private List<Dolgozo> dolgozokList;

    public Reszleg(String rName, String boss) {
        this.rName = rName;
        this.boss = boss;
        dolgozokList = new ArrayList<>();

    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public List<Dolgozo> getDolgozok() {
        return dolgozokList;
    }

    public void setDolgozok(List<Dolgozo> dolgozok) {
        this.dolgozokList = dolgozok;
    }
    
    public void dolgozoFelvesz(Dolgozo dolgozo){
       boolean isExist = false;
       
       for (int i=0; i<dolgozokList.size(); i++){
            if (dolgozokList.get(i).getName().equals(dolgozo.getName()) || dolgozokList.contains(dolgozo)){
               isExist = true;
            }
            else
                isExist = false;    
       }
       
       if (isExist == true)
           System.out.println("A(z) " + dolgozo.getName() + " nevu dolgozo mar szerepel ezen a reszlegen!");
       else
           dolgozokList.add(dolgozo);
       
       Collections.sort(dolgozokList);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        Iterator it=dolgozokList.iterator();
        System.out.println("Reszleg neve: " + rName + "\t Vezeto: " + boss );
        //System.out.println("Dolgozok:");
        while(it.hasNext()){
            sb.append((Dolgozo)it.next());
        }
        return sb.toString();  
        
    }


}
