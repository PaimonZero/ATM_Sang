package model;

import java.time.LocalDate;

public class DebitCard extends Card{
    //DateValid, AmountRemaind (the amount in the card)
    protected LocalDate DateValid;
    protected double AmountRemaind;

    public DebitCard(LocalDate DateValid, double AmountRemaind, String CardID, String CardNumber, LocalDate DateRelease) {
        super("DEB" + CardID, CardNumber, DateRelease);         //Cardid sẽ có dạng DEB****
        this.DateValid = DateValid;
        this.AmountRemaind = AmountRemaind;
        this.CardType = "DEB";
    }

    public LocalDate getDateValid() {
        return DateValid;
    }

    public void setDateValid(LocalDate DateValid) {
        this.DateValid = DateValid;
    }

    public double getAmountRemaind() {
        return AmountRemaind;
    }

    public void setAmountRemaind(double AmountRemaind) {
        this.AmountRemaind = AmountRemaind;
    }

    @Override
    public String toString() {
        return super.toString() + "DebitCard{" + "DateValid=" + DateValid + ", AmountRemaind=" + AmountRemaind + '}';
    }
    
}
