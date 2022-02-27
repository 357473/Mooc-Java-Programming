
public class Container {

    private int container;
    private int first;
    private int second;

    public Container() {

    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.first = this.first + amount;
        }
        if (amount > 100) {
            this.first = 100;
        }
        if (this.first >= 100) {
            this.first = 100;
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (this.first - amount >= 0) {
                this.second = this.second + amount;
                this.first = this.first - amount;
            } else if (amount > this.first) {
                this.second = this.second + this.first;
                this.first = 0;
            }
        }
        if (this.second > 100) {
            this.second = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.second = this.second - amount;
        }
        if (this.second < 0) {
            this.second = 0;
        }
    }

    public String toString() {
        return "First: " + this.first + "/100\nSecond: " + this.second + "/100";
    }
}
