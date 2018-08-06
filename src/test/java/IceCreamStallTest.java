import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Iceland", "Zenon Mazurek", 3);
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
}
