package cs222.pbot;

import java.util.ArrayList;

public class Quads {//four of a kind
    public static ArrayList<Card> fQuads(ArrayList<Card> cards) {//remember, can only be one set of quads within 7 cards
        ArrayList<Card> best = new ArrayList<>();
        for (Card card : cards) {
            best.clear();
            best.add(card);
            for (Card comparison : cards) {
                if (card.getValue() == comparison.getValue() &&
                    card.getSuit() != comparison.getSuit()) {
                    best.add(comparison);
                }
            }
            if (best.size() > 3) {//same thing as trips, but checking for four cards total instead
                return best;
            }
        }
        Card val = new Card(-1, -1);
        best.clear();
        best.add(val);
        return best;
    }
}
