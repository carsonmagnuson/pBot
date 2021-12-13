package cs222.pbot;

import java.util.ArrayList;

public class FullHouse {

    public static ArrayList<Card> fFullHouse(ArrayList<Card> cards) {
        ArrayList<Card> best = Trips.fTrips(cards);
        if (best.get(0).getValue() != -1) {
            for (Card card : best) {
                for (int x = 0; x < cards.size(); x++) {
                    if (card.getValue() == cards.get(x).getValue() && card.getSuit() == cards.get(x).getSuit()) {
                        cards.remove(x);
                        break;
                    }
                }
            }
            ArrayList<Card> best2 = Pair.fPair(cards);
            if (best2.get(0).getValue() != -1) {
                best.addAll(best2);
                return best;
            }
        }
        Card val = new Card(-1, -1);
        best.add(val);
        return best;
    }
}
