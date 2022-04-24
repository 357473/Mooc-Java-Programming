
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private ArrayList<Birds> birds;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.birds = new ArrayList<>();
    }

    public void start() {
        menu();
        String command = "";
        while (true) {
            System.out.print("> ");
            command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            command(command);
        }
    }

    public void menu() {
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - print all birds");
        System.out.println("One - print one bird");
        System.out.println("Quit - ends the program");
    }

    public void command(String command) {
        if (command.equals("Add")) {
            add();
        }
        if (command.equals("Observation")) {
            observation();
        }
        if (command.equals("All")) {
            all();
        }
        if (command.equals("One")) {
            one();
        }
    }

    public void add() {
        System.out.print("Name: ");
        String nameEnglish = scan.nextLine();
        System.out.print("Name in Latin: ");
        String nameLatin = scan.nextLine();
        this.birds.add(new Birds(nameEnglish, nameLatin));
    }

    public void observation() {
        System.out.print("Bird? ");
        String input = scan.nextLine();
        for (Birds bird : this.birds) {
            if (bird.getNameEnglish().equals(input)) {
                bird.getCount();
            }
        }
    }

    public void all() {
        for (Birds bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void one() {
        if (this.birds.size() > 0) {
            Random random = new Random();
            int randomNumber = random.nextInt(this.birds.size());
            System.out.println(this.birds.get(randomNumber));
        } else {
            System.out.println("Database is empty");
        }
    }
}
