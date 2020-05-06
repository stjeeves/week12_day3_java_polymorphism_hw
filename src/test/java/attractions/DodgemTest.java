package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1  = new Visitor(18, 1.5, 40);
        visitor2 = new Visitor(10, 1.1, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void checkPriceForVisitorNormal(){
        assertEquals(4.5, dodgems.priceForVisitor(visitor1), 1.0);
    }

    @Test
    public void checkPriceForVisitorDiscount(){
        assertEquals(2.25, dodgems.priceForVisitor(visitor2), 1.0);
    }
}
