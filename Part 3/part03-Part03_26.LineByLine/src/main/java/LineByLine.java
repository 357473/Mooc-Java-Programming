
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("")) {
            String array[] = input.split(" ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            input = scanner.nextLine();
        }
    }
}
