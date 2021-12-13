package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;

public class Flush {//five cards of the same suit
    public static ArrayList<Card> fFlush(ArrayList<Card> cards) {
        ArrayList<ArrayList<Card>> suits = new ArrayList<>();
        ArrayList<Card> best = new ArrayList<>();
        for (int x = 0; x < 4; x++) {//creating new arraylist for each suit
            suits.add(new ArrayList<>());
        }
        ArrayList<Card> curr;

        for (Card card : cards) {//sorting cards into respective suits
            if (card.getSuit() == 1) {
                curr = suits.get(0);
                curr.add(card);
                suits.set(0, curr);
            }
            if (card.getSuit() == 2) {
                curr = suits.get(1);
                curr.add(card);
                suits.set(1, curr);
            }
            if (card.getSuit() == 3) {
                curr = suits.get(2);
                curr.add(card);
                suits.set(2, curr);
            }
            if (card.getSuit() == 4) {
                curr = suits.get(3);
                curr.add(card);
                suits.set(3, curr);
            }
        }
        for (ArrayList<Card> currSuit : suits) {//can only be one suit with 5 cards in a 7 card hand
            if (currSuit.size() > 4) {
                for(Card card: cards){//if ace is present, setting to 14 value
                    if(card.getValue()==1){
                        card.setValue(14);
                    }
                }
                Collections.reverse(Deck.sort(currSuit));//only highest of flush suit is needed for score, sorting into reverse to return highest card
                best.add(currSuit.get(0));
                return best;
            }
        }

        Card val = new Card(-1, -1);
        best.add(val);
        return best;//default negative value card
    }
}
