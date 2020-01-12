
/**
 *
 * @author Dave
 */
public class Leves extends Etel{
    
    private boolean allergen;

    public Leves(int etelAr, String etelNev, boolean allergen) {
        super(etelAr, etelNev);
        this.allergen = allergen;
    }

    public boolean isAllergen() {
        return allergen;
    }

    public void setAllergen(boolean allergen) {
        this.allergen = allergen;
    }


}
