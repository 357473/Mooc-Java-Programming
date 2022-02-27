
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "";
        String database = "";
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        for (String line : this.elements) {
            database = database + "\n" + line;
        }
        if (this.elements.size() == 1) {
            output = "The collection " + this.name + " has " + this.elements.size() + " element:";
        } else {
            output = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        }
        return output + database;
    }
}
