import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Chris", "er763023w", 50000, "Training", 30000);
    }

    @Test
    public void testBasics() {
        assertEquals("Chris", director.getName());
        assertEquals("er763023w", director.getNiNumber());
        assertEquals(50000, director.getSalery(), 0.01);
        assertEquals(30000, director.getBudget(), 0.01);
    }

    @Test
    public void payRise() {
        director.raiseSalery(10000);
        assertEquals(60000, director.getSalery(), 0.01);
    }

    @Test
    public void PayBonous() {
        assertEquals(1000, director.payBonous(), 0.01);
    }
}
