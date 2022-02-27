
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = {3, 1, 5, 99, 3, 12};
        String[] arrayString = {"On", "Ob", "Tg", "Th", "Ai", "Ae"};
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(51);
        listInt.add(43);
        listInt.add(35);
        listInt.add(12);
        ArrayList<String> listString = new ArrayList<>();
        listString.add("wte");
        listString.add("fts");
        listString.add("abe");
        listString.add("abo");

        System.out.println(Arrays.toString(arrayInt));
        sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("");
        System.out.println(Arrays.toString(arrayString));
        sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
        System.out.println("");
        System.out.println(listInt);
        sortIntegers(listInt);
        System.out.println(listInt);
        System.out.println("");
        System.out.println(listString);
        sortStrings(listString);
        System.out.println(listString);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
