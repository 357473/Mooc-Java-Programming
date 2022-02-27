
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> numbersX = new ArrayList<>();

        numbersX.add(3);
        numbersX.add(2);
        numbersX.add(6);
        numbersX.add(-1);
        numbersX.add(5);
        numbersX.add(1);

        System.out.println("The numbers in range < 0 - 5 >");
        printNumbersInRange(numbersX, 0, 5);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
