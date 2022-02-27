
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> dataBase = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (!dataBase.contains(new Items(identifier, name))) {
                dataBase.add(new Items(identifier, name));
            }
        }
        System.out.println("==Items==");
        for (Items oneLine : dataBase) {
            System.out.println(oneLine);
        }
    }
}
