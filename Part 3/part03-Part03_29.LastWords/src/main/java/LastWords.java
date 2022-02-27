
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("")) {
            String array[] = input.split(" ");
            System.out.println(array[array.length - 1]);
            input = "";
            input = scanner.nextLine();
        }
    }
}
