
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String nextLine = scannerFile.nextLine();
                listOfNames.add(nextLine);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        System.out.println("Search for:");

        String searchedFor = scanner.nextLine();
        if (listOfNames.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
    }
}
