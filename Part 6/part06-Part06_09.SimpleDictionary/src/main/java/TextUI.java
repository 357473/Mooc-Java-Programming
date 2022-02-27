
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                if (this.dictionary.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                    continue;
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(toTranslate));
                    continue;
                }
            }
            System.out.println("Unknown command");
        }
    }
}
