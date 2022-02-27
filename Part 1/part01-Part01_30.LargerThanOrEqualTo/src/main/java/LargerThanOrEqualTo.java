
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give first number:");
        int numberOne = Integer.valueOf(scan.nextLine());
        System.out.println("Give first number:");
        int numberTwo = Integer.valueOf(scan.nextLine());

        if (numberOne > numberTwo) {
            System.out.println("Greater number is: " + numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Greater number is: " + numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
