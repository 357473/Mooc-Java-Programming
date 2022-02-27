
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            sum = sum + number;
            i++;
        }
        System.out.println("Number of numbers: " + i);
        System.out.println("Sum of the numbers: " + sum);
    }
}
