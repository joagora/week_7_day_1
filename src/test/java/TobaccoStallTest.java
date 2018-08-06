import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Pipes", "John Smoke", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Pipes", tobaccoStall.getName());
    }
}
