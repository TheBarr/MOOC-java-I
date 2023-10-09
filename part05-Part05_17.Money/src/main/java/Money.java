
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int new_euros = this.euros + addition.euros;
        int new_cents = this.cents + addition.cents;
        if (new_cents > 99) {
            new_euros += 1;
            new_cents = new_cents - 100;
        }
        Money newMoney = new Money(new_euros, new_cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros <= compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int new_euros = this.euros - decreaser.euros;
        int new_cents = this.cents - decreaser.cents;
        if (new_cents < 0) {
            new_euros -= 1;
            new_cents = 100 - (decreaser.cents - this.cents);
        }

        if (new_euros < 0) {
            new_euros = 0;
            new_cents = 0;
        }
        Money newMoney = new Money(new_euros, new_cents);
        return newMoney;
    }
}
