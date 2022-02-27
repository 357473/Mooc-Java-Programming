
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Integer> grades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            if (input > -1 && input < 101) {
                this.grades.add(input);
            }
        }
        average();
        passingAverage();
        passingPercentage();
        print();
    }

    public void average() {
        double sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum = sum + this.grades.get(i);
        }
        System.out.println(this.grades);
        System.out.println("Point average (all): " + sum / this.grades.size());
    }

    public void passingAverage() {
        double sum = 0;
        int iterator = 0;
        if (this.grades.size() > 0) {
            for (int i = 0; i < this.grades.size(); i++) {
                if (this.grades.get(i) > 49) {
                    sum = sum + this.grades.get(i);
                    iterator++;
                }
            }
        }
        if (sum > 0) {
            System.out.println("Point average (passing): " + sum / iterator);
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void passingPercentage() {
        int passing = 0;
        if (this.grades.size() > 0) {
            for (int i = 0; i < this.grades.size(); i++) {
                if (this.grades.get(i) > 49) {
                    passing++;
                }
            }
        }
        System.out.println("Pass percentage: " + (double) 100 * passing / this.grades.size());
    }

    public int gradeDistribution(int grade) {
        if (grade > 89) {
            return 5;
        }
        if (grade > 79) {
            return 4;
        }
        if (grade > 69) {
            return 3;
        }
        if (grade > 59) {
            return 2;
        }
        if (grade > 49) {
            return 1;
        }
        return 0;
    }

    public void print() {
        System.out.println("Grade distribution:");
        for (int i = 5; i > -1; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < this.grades.size(); j++) {
                if (gradeDistribution(this.grades.get(j)) == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
