
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(2);
        System.out.println("");
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
