
import java.util.ArrayList;

public class Box implements Packable {

    private double maximumCapacity;
    private ArrayList<Packable> items;

    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight = weight + item.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() + this.weight() <= this.maximumCapacity) {
            this.items.add(packable);
        }
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
