
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipes> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        addRecipe(fileName);
        String command = "";
        menu();
        while (true) {
            command(command);
            System.out.println("");
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
        }
    }

    public void addRecipe(String fileName) {
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                ArrayList<String> ingredients = new ArrayList<>();
                String name = file.nextLine();
                String cookingTime = file.nextLine();
                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    ingredients.add(line);
                    if (line.isEmpty()) {
                        break;
                    }
                }
                this.recipes.add(new Recipes(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " does not exist!");
        }
    }

    public void menu() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public void command(String command) {
        if (command.equals("list")) {
            listRecipes(command);
        }
        if (command.equals("find name")) {
            findName(command);
        }
        if (command.equals("find cooking time")) {
            findCookingTime(command);
        }
        if (command.equals("find ingredient")) {
            findIngredient(command);
        }
    }

    public void listRecipes(String command) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipes line : this.recipes) {
            System.out.println(line);
        }
    }

    public void findName(String command) {
        System.out.println("");
        System.out.print("Searched word: ");
        String searched = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipes recipe : this.recipes) {
            if (recipe.getName().contains(searched)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(String command) {
        System.out.println("");
        System.out.print("Max cooking time: ");
        String input = scanner.nextLine();
        int cookingTime = Integer.valueOf(input);
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipes recipe : this.recipes) {
            int timeConverted = Integer.valueOf(recipe.getCookingTime());
            if (timeConverted <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String command) {
        System.out.println("");
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipes recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
