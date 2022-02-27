
import java.util.ArrayList;

public class Recipes {
    
    private String name;
    private String cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipes(String name, String cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCookingTime() {
        return cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        for (String line : this.ingredients) {
            ingredients.add(line);
        }
        return ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
