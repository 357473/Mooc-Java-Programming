
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int firstPrice = this.squares * this.princePerSquare;
        int secondPrice = compared.squares * compared.princePerSquare;
        if (firstPrice > secondPrice) {
            return firstPrice - secondPrice;
        } else {
            return secondPrice - firstPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int firstPrice = this.squares * this.princePerSquare;
        int secondPrice = compared.squares * compared.princePerSquare;
        if (firstPrice > secondPrice) {
            return true;
        } else {
            return false;
        }
    }
}
