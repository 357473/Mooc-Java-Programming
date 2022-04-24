
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();

        double positive = numbers.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        double negative = numbers.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        if (answer.equals("p")) {
            System.out.println("Average of the positive numbers: " + positive);
        } else {
            System.out.println("Average of the negative numbers: " + negative);
        }
    }
}
