
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            String arrayX[] = input.split(",");
            if (input.equals("")) {
                break;
            }
            age = Integer.valueOf(arrayX[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
