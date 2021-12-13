package cs222.pbot;

import java.util.ArrayList;

public class Quads {
    public static ArrayList<Card> fQuads(ArrayList<Card> cards) {
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
            if (best.size() > 3) {
                return best;
            }
        }
        Card val = new Card(-1, -1);
        best.clear();
        best.add(val);
        return best;
    }
}
