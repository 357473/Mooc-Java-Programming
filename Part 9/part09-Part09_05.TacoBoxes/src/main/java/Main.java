
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        CustomTacoBox v = new CustomTacoBox(5);
        System.out.println(v.tacosRemaining());
        v.eat();
        v.eat();
        v.eat();
        v.eat();
        System.out.println(v.tacosRemaining());
    }
}
