import Attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;
    @Before
    public void before(){
        rollercoster = new Rollercoster("Snake");
    }

    @Test
    public void hasName(){
        assertEquals("Snake", rollercoster.getName());
    }
}
