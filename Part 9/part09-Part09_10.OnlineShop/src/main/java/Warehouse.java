
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productPrice.get(product) == null) {
            return -99;
        }
        return this.productPrice.get(product);
    }

    public int stock(String product) {
        if (this.productStock.get(product) == null) {
            return 0;
        }
        return this.productStock.get(product);
    }

    public boolean take(String product) {
        if (this.productStock.get(product) != null) {
            if (this.productStock.get(product) > 0) {
                this.productStock.put(product, this.productStock.get(product) - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String product : this.productPrice.keySet()) {
            set.add(product);
        }
        return set;
    }
}
