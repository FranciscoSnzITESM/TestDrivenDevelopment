import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetItemByIndexTests {
    @Test
    public void getItemByIndex1() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(5, list.get(0));
    }
    @Test
    public void getItemByIndex2() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.remove(0);
        list.add(12);
        list.add(15);
        assertEquals(12, list.get(1));
    }
    @Test
    public void getItemByIndex3() {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(14);
        list.clear();
        list.add(15);
        list.add(7);
        list.add(1);
        assertEquals(1, list.get(2));
    }
}
