
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double highestValue = 0.0;
        if (this.history.size() == 0) {
            return 0.0;
        }
        for (double value : this.history) {
            if (value >= highestValue) {
                highestValue = value;
            }
        }
        return highestValue;
    }

    public double minValue() {
        if (this.history.size() == 0) {
            return 0.0;
        }
        double lowestValue = this.history.get(0);
        for (double value : this.history) {
            if (value <= lowestValue) {
                lowestValue = value;
            }
        }
        return lowestValue;
    }

    public double average() {
        double sum = 0.0;
        if (this.history.size() == 0) {
            return 0.0;
        }
        for (double value : this.history) {
            sum = sum + value;
        }
        return sum / this.history.size();
    }
}
