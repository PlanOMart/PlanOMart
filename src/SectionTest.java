import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {
    @Test
    public void sectionNameTest(){
        String name = "store";
        Store store = new Store(name);
        Assertions.assertTrue(store.getStoreName().equals(name));
    }
}