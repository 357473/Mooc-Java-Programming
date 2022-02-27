
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        while (true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                i++;
                sum = sum + number;
            } else if (number < 0) {
                continue;
            } else {
                if (i == 0) {
                    System.out.print("Cannot calculate the average");
                }
                break;
            }
        }
        if (i > 0) {
            System.out.println((double) sum / i);
        }
    }
}
