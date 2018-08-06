import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Pipes", "John Smoke", 5);
        visitor = new Visitor("Mike", 12, 134, 12.00);
    }

    @Test
    public void hasName(){
        assertEquals("Pipes", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("John Smoke", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(5, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(6.60, tobaccoStall.defaultPrice());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(6.60, tobaccoStall.priceFor(visitor));
    }
}
