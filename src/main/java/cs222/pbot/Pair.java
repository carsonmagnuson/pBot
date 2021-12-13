package cs222.pbot;

import java.util.ArrayList;

public class Pair {//two of a kind

    public static ArrayList<Card> fPair(ArrayList<Card> cards) {
        Card val = new Card(-1, -1); //make val default negative return card
        ArrayList<Card> best = new ArrayList<>();
        best.add(val);
        for (int card = 0; card < cards.size(); ) {//loop through cards
            for (int comparison = 0; comparison < cards.size(); comparison++) {
                if (cards.get(card).getValue() == cards.get(comparison).getValue() &&
                    cards.get(card).getSuit() != cards.get(comparison).getSuit()) {//check both suit and number to make sure card is never paired with itself
                    if (cards.get(card).getValue() > val.getValue()) {//only switch out val with new pair if higher than old pair value
                        best.remove(0);//remove card - less iterations over time
                        best.add(cards.get(comparison));
                        val = cards.get(card);
                    }
                }
            }
            cards.remove(card);
        }
        best.add(val);
        return best;
    }

}
