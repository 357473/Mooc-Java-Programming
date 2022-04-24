
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> directory;

    public StorageFacility() {
        this.directory = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.directory.putIfAbsent(unit, new ArrayList<>());
        this.directory.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> list = new ArrayList<>();
        if (this.directory.containsKey(storageUnit)) {
            return this.directory.get(storageUnit);
        }
        return list;
    }

    public void remove(String storageUnit, String item) {

        this.directory.get(storageUnit).remove(item);
        if (this.directory.get(storageUnit).size() == 0) {
            this.directory.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String unit : this.directory.keySet()) {
            list.add(unit);
        }
        return list;
    }
}
