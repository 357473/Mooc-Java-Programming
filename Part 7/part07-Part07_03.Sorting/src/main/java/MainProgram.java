
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if ((MainProgram.smallest(array)) == array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestID = 0;
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                smallestID = i;
            }
        }
        return smallestID;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapper = 0;
        swapper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapper;
    }

    public static void sort(int[] array) {
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int smallestID = indexOfSmallestFrom(array, startIndex);
            swap(array, startIndex, smallestID);
            startIndex++;
            System.out.println(Arrays.toString(array));
        }
    }
}
