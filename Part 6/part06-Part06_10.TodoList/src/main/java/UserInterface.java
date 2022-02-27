
import java.util.Scanner;

public class UserInterface {

    private TodoList toDo;
    private Scanner scanner;

    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String reply = scanner.nextLine();
            if (reply.equals("stop")) {
                break;
            }
            command(reply);
        }
    }

    public void command(String command) {
        if (command.equals("add")) {
            add(command);
        }
        if (command.equals("list")) {
            list(command);
        }
        if (command.equals("remove")) {
            remove(command);
        }
    }

    public void list(String command) {
        this.toDo.print();
    }

    public void add(String command) {
        System.out.print("To add: ");
        String add = scanner.nextLine();
        this.toDo.add(add);
    }

    public void remove(String command) {
        System.out.print("Which one is removed? ");
        int remove = scanner.nextInt();
        this.toDo.remove(remove);
    }
}
