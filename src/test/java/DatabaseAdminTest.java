import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin db;

    @Before
    public void before() {
        db = new DatabaseAdmin("Keith", "er456736f", 35000);
    }

    @Test
    public void basicChecks() {
        assertEquals("Keith", db.getName());
        assertEquals("er456736f", db.getNiNumber());
        assertEquals(35000, db.getSalery(), 0.01);
    }

    @Test
    public void raiseSalery() {
        db.raiseSalery(5000);
        assertEquals(40000, db.getSalery(), 0.01);
    }

    @Test
    public void getbonus() {
        assertEquals(350, db.payBonous(), 0.01);
    }
}

