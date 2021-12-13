package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;

public class FullHouse {//three of a kind and two of a kind

    public static ArrayList<Card> fFullHouse(ArrayList<Card> cards) {

        Collections.reverse(Deck.sort(cards));//make sure highest trips are found first in case of two sets of trips, for best possible hand by sorting reverse
        ArrayList<Card> best = Trips.fTrips(cards);//using trips method first
        if (Hand.fHand(best)) {
            for (Card card : best) {
                for (int x = 0; x < cards.size(); x++) {
                    if (card.getValue() == cards.get(x).getValue() && card.getSuit() == cards.get(x).getSuit()) {
                        cards.remove(x);//removing found trips cards from cardlist
                        break;
                    }
                }
            }
            ArrayList<Card> best2 = Pair.fPair(cards);//using pair method second
            if (Hand.fHand(best2)) {//if both were successful, no default negative card value, returning all five best cards
                best.addAll(best2);
                return best;
            }
        }
        best.clear();
        Card val = new Card(-1, -1);
        best.add(val);
        return best;//default negative value card
    }
}
