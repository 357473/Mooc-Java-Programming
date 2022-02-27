
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> temp;

    public Stack() {
        this.temp = new ArrayList<>();
    }

    public void add(String value) {
        temp.add(value);
    }

    public ArrayList<String> values() {
        return temp;
    }

    public String take() {
        String topValue = temp.get(temp.size() - 1);
        temp.remove(topValue);
        return topValue;
    }

    public boolean isEmpty() {
        return temp.isEmpty();
    }
}
