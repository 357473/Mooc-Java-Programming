
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterator = 0;
        while (true) {
            String someText = scanner.nextLine();
            if (someText.endsWith("end")) {
                break;
            }
            iterator++;
        }
        System.out.println(iterator);
    }
}
