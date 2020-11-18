import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddItemsTests {
    @Test
    public void addItems1() {
        List<Integer> list = new ArrayList<>();
        assertTrue(list.add(4));
    }
    @Test
    public void addItems2() {
        List<Integer> list = new ArrayList<>();
        assertTrue(list.add(401239210));
    }
    @Test
    public void addItems3() {
        List<Integer> list = new ArrayList<>();
        assertTrue(list.add(45 - 332));
    }
}
