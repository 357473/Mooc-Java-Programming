
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
            this.maxWeight = this.maxWeight - suitcase.totalWeight();
        }
    }

    public String toString() {
        int sum = 0;
        for (Suitcase suitcase : this.suitcases) {
            sum = sum + suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + sum + " kg)";
    }

    public void printItems() {
        for (int i = 0; i < this.suitcases.size(); i++) {
            this.suitcases.get(i).printItems();
        }
    }
}
