
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int iterator = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum = sum + number;
                iterator++;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / iterator);
        }
    }
}
