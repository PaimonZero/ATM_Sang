/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import model.AtmCard;
import model.Card;
import model.CardHash;
import model.CreditCard;
import model.DebitCard;
import util.Validation;
import view.ConsoleUI;

/**
 *
 * @author HoangNam
 */
public class Application {
    private final ConsoleUI cui;
    

    public Application(ConsoleUI cui) {
        this.cui = cui;
    }
    
    private final CardHash caH = new CardHash();
    
    public void run() {
        while (true) {
            //step 1: Display GUI and users input Data
            int choice = cui.showMenuList();

            switch (choice) {
                //step 2: perform function based on the selected option
                case 1:
                    // add Doctor and check valid data
                    this.addCard();
                    break;
                case 2:
                    // Update Doctor and check valid data
                    this.printAll();
                    break;
                case 3:
                    // Delete Doctor and check valid data
                    break;
                case 4:
                    // exit the program
                    System.exit(0);
            }

        }
    }
    
    public void addCard(){
        int cardty = Validation.getInt("Enter card type(1- ATM; 2-Credit; 3-Debit): ", 1, 3);
        switch (cardty) {
            case 1:
                //CardID, CardNumber, DateRelease (issue date), Amount
                String id = Validation.getString(">Enter CardID: ");
                String CardNumber = Validation.getString(">Enter CardNumber: ");
                LocalDate DateRelease = Validation.getDate(">Enter DateRelease(dd-MM-yyyy): ");
                double amount = Validation.getDouble(">Enter amount: ");
                AtmCard cardAtm = new AtmCard(amount, id, CardNumber, DateRelease);
                caH.CreateCard( cardAtm);
                break;
            case 2:
                //DateValid (card expiration date), AmountDue (card outstanding balance), AmountMax (card spending limit)
                id = Validation.getString(">Enter CardID: ");
                CardNumber = Validation.getString(">Enter CardNumber: ");
                DateRelease = Validation.getDate(">Enter DateRelease(dd-MM-yyyy): ");
                LocalDate DateValid = Validation.getDate(">Enter DateValid(dd-MM-yyyy): ");
                double AmountDue = Validation.getDouble(">Enter AmountDue: ");
                double AmountMax = Validation.getDouble(">Enter AmountMax: ");
                
                CreditCard cardCre = new CreditCard(DateValid, AmountDue, AmountMax, id, CardNumber, DateRelease);
                caH.CreateCard(cardCre);
                break;
            case 3:
                //DateValid, AmountRemaind (the amount in the card)
                id = Validation.getString(">Enter CardID: ");
                CardNumber = Validation.getString(">Enter CardNumber: ");
                DateRelease = Validation.getDate(">Enter DateRelease(dd-MM-yyyy): ");
                DateValid = Validation.getDate(">Enter DateValid(dd-MM-yyyy): ");
                double AmountRemaind = Validation.getDouble(">Enter amount: ");
                
                DebitCard cardDe = new DebitCard(DateValid, AmountRemaind, id, CardNumber, DateRelease);
                caH.CreateCard(cardDe);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void printAll() {
        ArrayList<Card> list = caH.getCardList();
        for (Card card : list) {
            System.out.println(card.toString());
        }
    }
}
