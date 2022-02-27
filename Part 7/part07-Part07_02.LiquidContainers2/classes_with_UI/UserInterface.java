
import java.util.Scanner;

public class UserInterface {

    private Container container;
    private Scanner scanner;

    public UserInterface(Container container) {
        this.container = container;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println(container);
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            commands(input);
        }
    }

    public void commands(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);
        if (command.equals("add")) {
            this.container.add(amount);
        }
        if (command.equals("move")) {
            this.container.move(amount);
        }
        if (command.equals("remove")) {
            this.container.remove(amount);
        }
    }
}
