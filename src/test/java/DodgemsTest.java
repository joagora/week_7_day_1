import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    @Before
    public void before(){
        dodgems = new Dodgems("Crash Course");
    }

    @Test
    public void hasName(){
        assertEquals("Crash Course", dodgems.getName());
    }
}
