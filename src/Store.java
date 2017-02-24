import java.util.ArrayList;

public class Store {
    private String storeName;
    private ArrayList<Section> sections;


    Store(String n) {
        storeName = n;
        sections = new ArrayList<Section>();
    }

    public String getStoreName() {
        return storeName;
    }

    public boolean hasSections() {
        if (sections.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean addSection(Section s) {
        sections.add(s);
        return true;
    }

    public Section[] getSections() {
        Section[] sectionArray = new Section[sections.size()];
        sectionArray = sections.toArray(sectionArray);
        return sectionArray;
    }
}