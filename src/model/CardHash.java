
package model;

import java.util.ArrayList;
import java.util.Collections;
import util.Validation;

public class CardHash{
    private ArrayList<Card> cardList = new ArrayList<>();
    Validation val;

    public CardHash() {
    }
    
    public CardHash(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }

    public void CreateCard(Card cardNew) {      //1-ATM, 2-Credit, 3-Debit
        if(cardList.add(cardNew)){
            System.out.println(">>Add card successfuly!");
        } else {
            System.out.println(">>Cann't add this card!!");
        }
    } 
    
//    public ArrayList sortCard() {
//        cardList.sort((o1, o2) -> {o1.get});
//        return cardList;
//    }
//    
    

}
