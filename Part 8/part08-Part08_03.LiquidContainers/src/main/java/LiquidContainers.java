
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
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
                    first = first + value;
                }
                if (first > 100) {
                    first = 100;
                }
            }
            if (command.equals("move")) {
                if (value > 0) {

                    if (first >= value) {
                        first = first - value;
                        second = second + value;
                        if (second > 100) {
                            second = 100;
                        }
                    } else {
                        second = second + first;
                        first = 0;
                        if (second > 100) {
                            second = 100;
                        }
                    }
                }
            }
            if (command.equals("remove")) {
                if (value > 0) {
                    second = second - value;
                }
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}
