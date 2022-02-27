
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<String> theList = new ArrayList<>();

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {

            while (scannerFile.hasNextLine()) {
                String nextLine = scannerFile.nextLine();
                theList.add(nextLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int iteratorLimit = 0;
        for (String nextLine : theList) {
            int nextNumber = Integer.valueOf(nextLine);
            if (nextNumber >= lowerBound && nextNumber <= upperBound) {
                iteratorLimit++;
            }
        }
        System.out.println("Numbers: " + iteratorLimit);
    }
}
