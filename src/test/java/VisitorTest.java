import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor;
    @Before
    public void before(){
        visitor = new Visitor(12, 145, 15.00);
    }

    @Test
    public void hasAge(){
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(145, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(15.00, visitor.getMoney(), 2);
    }
}
