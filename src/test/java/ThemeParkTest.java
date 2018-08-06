import Attractions.Attraction;
import Attractions.Dodgems;
import ThemeParks.ThemePark;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {


    ThemePark themePark;
    Visitor visitor;
    Attraction attraction;
    @Before
    public void before(){
        themePark = new ThemePark("The Quest");
        visitor = new Visitor("Mike", 12, 145, 15.00);
        attraction = new Dodgems(("Crash Course"));
    }

    @Test
    public void visitorCanVisitAttraction(){
        assertEquals("Mike visited Crash Course.", themePark.visit(visitor, attraction));
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(attraction);
        assertEquals(1, themePark.getAttractionList().size());
    }

    @Test

    public void canReturnAllRatedAttractions(){
        themePark.addAttraction(attraction);
        assertEquals(1, themePark.getAllRated().size());

    }
}
