
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String name = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(name))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                list.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (String oneLine : list) {
            String split[] = oneLine.split(",");
            int converter = Integer.valueOf(split[1]);
            if (converter == 1) {
                System.out.println(split[0] + ",age: " + split[1] + " year");
            } else {
                System.out.println(split[0] + ",age: " + split[1] + " years");
            }
        }
    }
}
