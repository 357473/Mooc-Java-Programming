
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> numberz = new ArrayList<>();

        numberz.add(3);
        numberz.add(2);
        numberz.add(6);
        numberz.add(-1);

        System.out.println(sum(numberz));
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
