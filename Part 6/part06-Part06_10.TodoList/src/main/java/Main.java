
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TodoList toDo = new TodoList();
        UserInterface ui = new UserInterface(toDo, scanner);
        ui.start();
    }
}
