
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] divider = input.split(" ");
            String function = divider[0];
            int number = Integer.valueOf(divider[1]);

            if (function.equals("add")) {
                firstContainer.add(number);
            }
            if (function.equals("move")) {
                int first = firstContainer.contains();
                if (first <= number) {
                    firstContainer.remove(number);
                    secondContainer.add(first);
                } else {
                    firstContainer.remove(number);
                    secondContainer.add(number);
                }
            }
            if (function.equals("remove")) {
                secondContainer.remove(number);
            }
        }
    }
}
