
package model;

import java.time.LocalDate;

public class AtmCard extends Card{
    private double Amount;

    public AtmCard(double Amount, String CardID, String CardNumber, LocalDate DateRelease) {
        super("ATM" + CardID, CardNumber, DateRelease);     ////Cardid sẽ có dạng ATM****
        this.Amount = Amount;
        this.CardType = "ATM";
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return super.toString() + "AtmCard{" + "Amount=" + Amount + '}';
    }
    
}
