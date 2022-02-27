
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            menu();
            String command = scanner.nextLine();
            commands(command);
            if (command.equals("X")) {
                break;
            }
        }
    }

    public void commands(String command) {
        if (command.equals("1")) {
            add();
        }
        if (command.equals("2")) {
            draw();
        }
        if (command.equals("3")) {
            list();
        }
    }

    public void menu() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.manager.addJoke(joke);
    }

    public void draw() {
        this.manager.drawJoke();
    }

    public void list() {
        System.out.println("Printing jokes:");
        this.manager.printJokes();
    }
}
