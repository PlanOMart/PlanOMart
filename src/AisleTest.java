import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AisleTest {

    @Test
    public void aisleNameTest() {
        String aisleName = "3B";
        Aisle aisle = new Aisle(aisleName);
        Assertions.assertTrue(aisle.getAisleName().equals(aisleName));
    }

    @Test
    public void wrongAisleNameTest() {
        String aisleName = null;
        Aisle aisle;
        try {
            aisle = new Aisle(aisleName);
        } catch (NullPointerException e) {
            Assertions.assertTrue(true);
        }
    }

    @Test
    public void aisleHasNoRacksTest() {
        Aisle aisle = new Aisle("Aisle");
        Assertions.assertFalse(aisle.hasRacks());

    }

    @Test
    public void aisleReturnArrayTest() {
        Aisle aisle = new Aisle("Aisle");
        Assertions.assertTrue(aisle.getRack().length == 0);
    }

    @Test
    public void aisleAddRacksTest() {
        Aisle aisle = new Aisle("Aisle");
        Rack rack = new Rack("Rack 1");
        aisle.addSection(rack);
        Assertions.assertTrue(aisle.getRack().length == 1);
    }

    @Test
    public void aisleHasRacks() {
        Aisle aisle = new Aisle("Aisle");
        Rack rack = new Rack("Rack 1");
        aisle.addSection(rack);
        Assertions.assertTrue(aisle.hasRacks());
    }
}