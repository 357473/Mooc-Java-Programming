
public class Container {

    private int container;

    public Container() {

    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.container = this.container + amount;
        }
        if (this.container > 100) {
            this.container = 100;
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            this.container = this.container - amount;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount >= this.container) {
                this.container = 0;
            } else {
                this.container = this.container - amount;
            }
        }
    }

    @Override
    public String toString() {
        return this.container + "/100";
    }
}
