import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfItemTests {
    @Test
    public void getIndexOfItem1() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(0, list.indexOf(5));
    }
    @Test
    public void getIndexOfItem2() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        assertEquals(-1, list.indexOf(45));
    }
    @Test
    public void getIndexOfItem3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-9);
        list.add(2);
        list.add(5);
        list.add(5);
        assertEquals(3, list.indexOf(5));
    }
}
