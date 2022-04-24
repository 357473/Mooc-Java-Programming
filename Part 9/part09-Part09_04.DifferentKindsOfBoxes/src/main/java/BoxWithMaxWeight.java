
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public int capacitySUM() {
        int sum = 0;
        for (Item item : this.items) {
            sum = sum + item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + capacitySUM() <= capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
}
