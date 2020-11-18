import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClearListTests {
    @Test
    public void clearList1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
    }
    @Test
    public void clearList2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        list.add(1);
        assertEquals(1, list.size());
    }
    @Test
    public void clearList3(){
        List<Integer> list = new ArrayList<>();
        list.clear();
        list.add(1);
        list.add(2);
        list.clear();
        list.add(1);
        list.clear();
        assertEquals(0, list.size());
    }
}
