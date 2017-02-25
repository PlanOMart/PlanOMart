import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    @Test
    public void storeNameTest() {
        String name = "store";
        Store store = new Store(name);
        Assertions.assertTrue(store.getStoreName().equals(name));
    }

    @Test
    public void storeInvalidNameTest() {
        String name = "";
        Store store;
        try {
            store = new Store(name);
            store.getStoreName();
            Assertions.assertFalse(!store.getStoreName().equals(""));

        } catch (NullPointerException e) {
            Assertions.assertTrue(true);
        }

    }

    @Test
    public void storeHasNoSectionsTest() {
        Store store = new Store("Store");
        Assertions.assertFalse(store.hasSections());

    }

    @Test
    public void storeReturnArrayTest() {
        Store store = new Store("Store");
        Assertions.assertTrue(store.getSections().length == 0);
    }

    @Test
    public void storeAddSectionsTest() {
        Store store = new Store("Store");
        Section section = new Section("Section 1");
        store.addSection(section);
        Assertions.assertTrue(store.getSections().length == 1);
    }

    @Test
    public void storeHasSections() {
        Store store = new Store("Store");
        Section section = new Section("Section 1");
        store.addSection(section);
        Assertions.assertTrue(store.hasSections());
    }
}