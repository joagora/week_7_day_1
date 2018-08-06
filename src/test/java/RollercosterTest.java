import Attractions.Rollercoster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;
    Visitor visitorRaphael;
    Visitor visitorMike;
    Visitor visitorJoanna;

    @Before
    public void before(){
        rollercoster = new Rollercoster("Snake");
        visitorRaphael = new Visitor("Raphael", 28, 180, 3.00);
        visitorMike = new Visitor("Mike", 30, 200, 40.00);
        visitorJoanna = new Visitor("Joanna", 27, 201, 5.00);
    }

    @Test
    public void hasName(){
        assertEquals("Snake", rollercoster.getName());
    }

    @Test
    public void hasPriceForVisitorHeight200(){
        assertEquals(8.40, rollercoster.priceFor(visitorMike));
    }

    @Test
    public void hasPriceForVisitorUnder200(){
        assertEquals(8.40, rollercoster.priceFor(visitorRaphael));
    }

    @Test
    public void hasPriceForVisitorOver200(){
        assertEquals(16.80, rollercoster.priceFor(visitorJoanna));
    }


}
