package cs222.pbot;

import java.util.ArrayList;

public class FullHouse {

    public static ArrayList<Card> fFullHouse(ArrayList<Card> cards) {
        ArrayList<Card> best = Trips.fTrips(cards);
        if (Hand.fHand(best)) {
            for (Card card : best) {
                for (int x = 0; x < cards.size(); x++) {
                    if (card.getValue() == cards.get(x).getValue() && card.getSuit() == cards.get(x).getSuit()) {
                        cards.remove(x);
                        break;
                    }
                }
            }
            ArrayList<Card> best2 = Pair.fPair(cards);
            if (Hand.fHand(best2)) {
                best.addAll(best2);
                return best;
            }
        }
        best.clear();
        Card val = new Card(-1, -1);
        best.add(val);
        return best;
    }
}
