import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSizeTests {
    @Test
    public void getSizeOfList1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
    }
    @Test
    public void getSizeOfList2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(0);
        list.add(2);
        list.remove(0);
        list.remove(0);
        list.add(1);
        assertEquals(1, list.size());
    }
    @Test
    public void getSizeOfList3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(1);
        list.add(2);
        list.remove(0);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(2, list.size());
    }
}

