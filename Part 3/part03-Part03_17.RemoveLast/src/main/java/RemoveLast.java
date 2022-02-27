
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        System.out.println(list);
        removeLast(list);
        System.out.println(list);
    }

    public static void removeLast(ArrayList<String> theList) {
        if (theList.size() == 0) {
            return;
        } else {
            theList.remove(theList.get(theList.size() - 1));
        }
    }
}
