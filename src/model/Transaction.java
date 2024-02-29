
package model;

import java.time.LocalDate;

public class Transaction {
    //TransactionID, CardID (ID of the transaction card), TransactionDate (Transaction date), Money (Transaction amount), Note (Note if any)
    private String TransactionID;
    private String CardID;
    private LocalDate TransactionDate;
    private double Money;
    private String Node;

    public Transaction(String TransactionID, String CardID, LocalDate TransactionDate, double Money, String Node) {
        this.TransactionID = TransactionID;
        this.CardID = CardID;
        this.TransactionDate = TransactionDate;
        this.Money = Money;
        this.Node = Node;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public LocalDate getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(LocalDate TransactionDate) {
        this.TransactionDate = TransactionDate;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    public String getNode() {
        return Node;
    }

    public void setNode(String Node) {
        this.Node = Node;
    }
}
