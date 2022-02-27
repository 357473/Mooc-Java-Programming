
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String array[] = input.split(",");
            age = Integer.valueOf(array[1]);
            if (age > oldest) {
                oldest = age;
                name = array[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
