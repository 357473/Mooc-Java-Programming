
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.maxWeight >= item.getWeight()) {
            this.items.add(item);
            this.maxWeight = this.maxWeight - item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : this.items) {
            sum = sum + item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item itemX = this.items.get(0);
        for (Item heaviest : this.items) {
            if (heaviest.getWeight() >= itemX.getWeight()) {
                itemX = heaviest;
            }
        }
        return itemX;
    }

    public String toString() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum = sum + items.get(i).getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (" + sum + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + sum + " kg)";
        }
        return this.items.size() + " items (" + sum + " kg)";
    }

}
