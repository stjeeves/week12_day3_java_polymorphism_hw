package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11,1.1, 15);
        visitor2 = new Visitor(29, 2.1, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkIsNotAllowedTo(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void checkIsAlowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void checkPriceForVisitorNormal(){
        assertEquals(8.4, rollerCoaster.priceForVisitor(visitor1), 1.0);
    }

    @Test
    public void checkPriceForVisitorTooTall(){
        assertEquals(16.8, rollerCoaster.priceForVisitor(visitor2), 1.0);
    }
}
