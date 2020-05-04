import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Juan", "ab786534d", 30000, "Training");
    }

    @Test
    public void canGetName() {
        assertEquals("Juan", manager.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("ab786534d", manager.getNiNumber());
    }

    @Test
    public void getDept() {
        assertEquals("Training", manager.getDeptName());
    }

    @Test
    public void saleryIncrease() {
        manager.raiseSalery(5000);
        assertEquals(35000, manager.getSalery(), 0.01 );
    }

    @Test
    public void cantLowerSalery() {
        manager.raiseSalery(-100);
        assertEquals(30000, manager.getSalery(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(300, manager.payBonous(), 0.01);
    }

    @Test
    public void changeName() {
        manager.setName("Michael");
        assertEquals("Michael", manager.getName());
    }

    @Test
    public void cantChangeName() {
        manager.setName("");
        assertEquals("Juan", manager.getName());
    }
}
