
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.herds) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable line : this.herds) {
            output = output + line.toString() + "\n";
        }
        return output;
    }
}
