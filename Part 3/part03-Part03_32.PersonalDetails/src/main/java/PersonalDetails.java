
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int sum = 0;
        int iterator = 0;
        int longest = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String array[] = input.split(",");
            age = Integer.valueOf(array[1]);
            sum = sum + age;
            if (array[0].length() > longest) {
                longest = array[0].length();
                longestName = array[0];
            }
            iterator++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / iterator);
    }
}
