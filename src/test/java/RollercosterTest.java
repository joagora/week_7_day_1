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
    Visitor visitorRicardo;
    Visitor visitorMark;

    @Before
    public void before(){
        rollercoster = new Rollercoster("Snake");
        visitorRaphael = new Visitor("Raphael", 28, 145, 3.00);
        visitorMike = new Visitor("Mike", 30, 120, 40.00);
        visitorJoanna = new Visitor("Joanna", 27, 201, 5.00);
        visitorRicardo = new Visitor("Ricardo", 27, 130, 5.00);
        visitorMark = new Visitor("Mark", 11, 180, 5.00);
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

    @Test
    public void canCheckIfAllowedOver12And145CM(){
        assertEquals(true, rollercoster.isAllowedTo(visitorJoanna));
    }

    @Test
    public void canCheckIfAllowedOver12Under145CM(){
        assertEquals(false, rollercoster.isAllowedTo(visitorRicardo));
    }

    @Test
    public void canCheckIfAllowedUnder12Over145CM(){
        assertEquals(false, rollercoster.isAllowedTo(visitorRicardo));
    }



}
