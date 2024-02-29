
package model;

import java.time.LocalDate;

public abstract class Card implements Comparable<Card> {
    //CardID, CardNumber, DateRelease (issue date), CardType (card type).
    protected String CardID;
    protected String CardNumber;
    protected LocalDate DateRelease;
    protected String CardType;

    public Card(String CardID, String CardNumber, LocalDate DateRelease) {
        this.CardID = CardID;
        this.CardNumber = CardNumber;
        this.DateRelease = DateRelease;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public LocalDate getDateRelease() {
        return DateRelease;
    }

    public void setDateRelease(LocalDate DateRelease) {
        this.DateRelease = DateRelease;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }
    
    @Override
    public int compareTo(Card otherCard) {
        return this.CardID.compareToIgnoreCase(otherCard.CardID);
    }

    @Override
    public String toString() {
        return "Card{" + "CardID=" + CardID + ", CardNumber=" + CardNumber + ", DateRelease=" + DateRelease + ", CardType=" + CardType + '}';
    }
    
}
