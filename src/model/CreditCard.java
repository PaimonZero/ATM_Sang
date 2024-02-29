
package model;

import java.time.LocalDate;

public class CreditCard extends Card {
    //DateValid (card expiration date), AmountDue (card outstanding balance), AmountMax (card spending limit)
    private LocalDate DateValid;
    private double AmountDue;
    private double AmountMax;

    public CreditCard(LocalDate DateValid, double AmountDue, double AmountMax, String CardID, String CardNumber, LocalDate DateRelease) {
        super("CRE" + CardID, CardNumber, DateRelease);     //Cardid sẽ có dạng CRE****
        this.DateValid = DateValid;
        this.AmountDue = AmountDue;
        this.AmountMax = AmountMax;
        this.CardType = "CRE";
    }

    public LocalDate getDateValid() {
        return DateValid;
    }

    public void setDateValid(LocalDate DateValid) {
        this.DateValid = DateValid;
    }

    public double getAmountDue() {
        return AmountDue;
    }

    public void setAmountDue(double AmountDue) {
        this.AmountDue = AmountDue;
    }

    public double getAmountMax() {
        return AmountMax;
    }

    public void setAmountMax(double AmountMax) {
        this.AmountMax = AmountMax;
    }

    @Override
    public String toString() {
        return super.toString() + "CreditCard{" + "DateValid=" + DateValid + ", AmountDue=" + AmountDue + ", AmountMax=" + AmountMax + '}';
    }
    
}
