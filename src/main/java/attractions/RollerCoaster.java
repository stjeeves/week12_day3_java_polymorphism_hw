package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() > 1.45){
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.4;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() > 2){
                return (this.defaultPrice() * 2);}
               return this.defaultPrice();
    }
}
