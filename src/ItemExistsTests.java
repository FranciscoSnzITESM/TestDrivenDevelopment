import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemExistsTests {
    @Test
    public void itemExists1() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertTrue(list.contains(5));
    }
    @Test
    public void itemExists2() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(45);
        list.add(-42);
        list.add(45);
        list.add(47);
        assertTrue(list.contains(45));
    }
    @Test
    public void itemExists3() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(-42);
        list.add(47);
        assertFalse(list.contains(42));
    }
}
