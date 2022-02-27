
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("")) {

            String array[] = input.split(" ");
            System.out.println(array[0]);
            input = "";
            input = scanner.nextLine();
        }
    }
}
