package cs222.pbot;

import java.util.ArrayList;

public class Trips {//Three of a kind

    public static ArrayList<Card> fTrips(ArrayList<Card> cards) {
        ArrayList<Card> best = new ArrayList<>();
        for (Card card : cards) {//only one case of trips is possible in seven cards, otherwise it's a full house
            best.clear();
            best.add(card);
            for (Card comparison : cards) {
                if (card.getValue() == comparison.getValue() &&
                    card.getSuit() != comparison.getSuit()) {//once again checking suit as well is important so same card isn't checked paired with itself
                    best.add(comparison);
                }
            }
            if (best.size() > 2) {//if three same value cards found return them
                return best;
            }
        }
        Card val = new Card(-1, -1);
        best.clear();
        best.add(val);
        return best;//otherwise return the default negative value card in an arraylist
    }
}
