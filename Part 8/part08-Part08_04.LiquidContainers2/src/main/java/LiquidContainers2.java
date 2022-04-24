
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String array[] = input.split(" ");
            String command = array[0];
            String amount = array[1];
            int value = Integer.valueOf(amount);
            if (command.equals("add")) {
                if (value > 0) {
                    first.add(value);
                }
            }
            if (command.equals("move")) {
                if (first.contains() >= value) {
                    first.remove(value);
                    second.add(value);
                } else {
                    second.add(first.contains());
                    first.remove(first.contains());
                }
            }
            if (command.equals("remove")) {
                second.remove(value);
            }
        }
    }
}
