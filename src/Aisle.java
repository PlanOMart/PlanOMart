import java.util.ArrayList;

public class Aisle {

    private String aisleName;
    private ArrayList<Rack> racks;

    public Aisle(String n) {
        aisleName = n;
        racks = new ArrayList<Rack>();
    }

    public String getAisleName() {
        return aisleName;
    }

    public boolean hasRacks() {
        if (racks.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean addSection(Rack r) {
        racks.add(r);
        return true;
    }

    public Rack[] getRack() {
        Rack[] rackArray = new Rack[racks.size()];
        rackArray = racks.toArray(rackArray);
        return rackArray;
    }
}