
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String one = scan.nextLine();
        System.out.println("Give an integer: ");
        int two = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double three = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean four = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + one);
        System.out.println("You gave the integer " + two);
        System.out.println("You gave the double " + three);
        System.out.println("You gave the boolean " + four);
    }
}
