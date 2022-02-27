
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        Money moneyLess = new Money(euros, cents);
        if (moneyLess.euros < compared.euros()) {
            return true;
        } else if (moneyLess.euros == compared.euros() && moneyLess.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        Money result = new Money(euros, cents);
        if (result.euros >= decreaser.euros && result.cents >= decreaser.cents) {
            result = new Money(euros - decreaser.euros, cents - decreaser.cents);
        } else if (result.euros >= decreaser.euros && result.cents < decreaser.cents) {
            result = new Money(result.euros - decreaser.euros - 1, 100 - decreaser.cents + result.cents);
        } else if (result.euros <= decreaser.euros) {
            result = new Money(0, 0);
        }
        return result;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
        return this.euros + "." + zero + this.cents + "e";
    }
}
