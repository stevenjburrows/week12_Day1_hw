import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void before() {
        dev = new Developer("Keith", "er456736f", 35000);
    }

    @Test
    public void basicChecks() {
        assertEquals("Keith", dev.getName());
        assertEquals("er456736f", dev.getNiNumber());
        assertEquals(35000, dev.getSalery(), 0.01);
    }

    @Test
    public void raiseSalery() {
        dev.raiseSalery(5000);
        assertEquals(40000, dev.getSalery(), 0.01);
    }

    @Test
    public void getbonus() {
        assertEquals(350, dev.payBonous(), 0.01);
    }
}
