
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }

    public void add(String task) {
        this.toDo.add(task);
    }

    public void print() {
        int i = 1;
        for (String line : this.toDo) {
            System.out.println(i + ": " + line);
            i++;
        }
    }

    public void remove(int number) {
        this.toDo.remove(number - 1);
    }
}
