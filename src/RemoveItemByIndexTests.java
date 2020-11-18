import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveItemByIndexTests {
    @Test
    public void removeItemByIndex1() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(5, list.remove(0));
    }
    @Test
    public void removeItemByIndex2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        assertEquals(3, list.remove(1));
    }@Test
    public void removeItemByIndex3() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(4);
        assertEquals(4, list.remove(2));
    }
}
