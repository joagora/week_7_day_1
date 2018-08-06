import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitorRaphael;
    Visitor visitorJoanna;
    Visitor visitorMike;
    @Before
    public void before(){
        playground = new Playground("Funtasy");
        visitorRaphael = new Visitor("Raphael", 4, 120, 12.00);
        visitorJoanna = new Visitor("Joanna", 25, 170, 16.00);
        visitorMike = new Visitor("Mike", 15, 170, 16.00);
    }

    @Test
    public void hasName(){
        assertEquals("Funtasy", playground.getName());
    }

    @Test
    public void canCheckIfAllowedLessThan15(){
        assertEquals(true, playground.isAllowedTo(visitorRaphael));
    }

    @Test
    public void canCheckIfAllowedMoreThan15(){
        assertEquals(false, playground.isAllowedTo(visitorJoanna));
    }

    @Test
    public void canCheckIfAllowed15(){
        assertEquals(true, playground.isAllowedTo(visitorMike));
    }
}
