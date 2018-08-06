import Stalls.CandyFlossStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFLossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;
    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Crash", "Lolla Pop", 2);
        visitor = new Visitor("Raphael", 15, 156, 12.00);
    }

    @Test
    public void hasName(){
        assertEquals("Candy Crash", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Lolla Pop", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice());
    }

    @Test
    public void hasPriceForVisitor(){
        assertEquals(4.20, candyFlossStall.priceFor(visitor));
    }
}
