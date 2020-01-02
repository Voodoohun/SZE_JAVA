import java.util.*;

public class Ceg {
    
    private String cAddress;
    private List<Reszleg> reszlegek;

    public Ceg(String cAddress) {
        this.cAddress = cAddress;
        reszlegek = new ArrayList<>();
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public List<Reszleg> getReszlegek() {
        return reszlegek;
    }

    public void setReszlegek(List<Reszleg> reszlegek) {
        this.reszlegek = reszlegek;
    }
    
    public void addReszleg(Reszleg resz){
        reszlegek.add(resz);
    }

    @Override
    public String toString() {        
        StringBuilder sb=new StringBuilder();
        Iterator it=reszlegek.iterator();
        System.out.println("A ceg reszlegei: " );
         while(it.hasNext()){
            sb.append((Reszleg)it.next());
            
        }
        return sb.toString();  
    }
    
    
}
