
public class Main {

    public static void main(String[] args) {
        Gift book1 = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book2 = new Gift("The Dune", 3);

        Package gifts = new Package();
        gifts.addGift(book1);
        gifts.addGift(book2);
        System.out.println(gifts.totalWeight());
    }
}
