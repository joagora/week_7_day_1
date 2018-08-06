import Stalls.IceCreamStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor;
    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Iceland", "Zenon Mazurek", 3);
        visitor = new Visitor("Mike", 13, 145, 14.00);
    }

    @Test
    public void hasName(){
        assertEquals("Iceland", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Zenon Mazurek", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(0, iceCreamStall.getRating());
    }


    @Test
    public void hasDefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(2.80, iceCreamStall.priceFor(visitor));
    }
}
