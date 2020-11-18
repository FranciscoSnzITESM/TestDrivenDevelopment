import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ListSizeTests.class,
        ClearListTests.class,
        AddItemsTests.class,
        ItemExistsTests.class,
        GetItemByIndexTests.class,
        IndexOfItemTests.class,
        RemoveItemByIndexTests.class
})
public class TestSuite { }
