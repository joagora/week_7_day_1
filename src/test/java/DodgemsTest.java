import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;
    @Before
    public void before(){
        dodgems = new Dodgems("Crash Course");
        visitor = new Visitor("Mike", 12, 145, 15.00);
        visitor2 = new Visitor("Andrzej", 13, 150, 15.00);
        visitor3 = new Visitor("Maciej", 9, 100, 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Crash Course", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice());
    }

    @Test
    public void hasPriceForVisitorAgeOver12(){
        assertEquals(4.50, dodgems.priceFor(visitor2));
    }

    @Test
    public void hasPriceForVisitorAge12(){
        assertEquals(4.50, dodgems.priceFor(visitor));
    }

    @Test
    public void hasPriceForVisitorAgeUnder12(){
        assertEquals(2.25, dodgems.priceFor(visitor3));
    }
}
