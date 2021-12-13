package cs222.pbot;

import java.util.ArrayList;

public class Pair {//two of a kind

    public static ArrayList<Card> fPair(ArrayList<Card> cards) {
        Card val = new Card(-1, -1);
        ArrayList<Card> best = new ArrayList<>();
        best.add(val);
        for (int card = 0; card < cards.size(); ) {
            for (int comparison = 0; comparison < cards.size(); comparison++) {
                if (cards.get(card).getValue() == cards.get(comparison).getValue() &&
                    cards.get(card).getSuit() != cards.get(comparison).getSuit()) {
                    if (cards.get(card).getValue() > val.getValue()) {
                        best.remove(0);
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
