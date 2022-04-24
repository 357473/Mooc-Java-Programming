
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    private static List<Integer> database = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        database.add(10);
        database.add(-22);
        database.add(43);
        database.add(-11);
        database.add(68);

        print();
        System.out.println("");
        positive(database);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> list = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

    public static void print() {
        for (Integer number : database) {
            System.out.println(number);
        }
    }
}
