package cs222.pbot;

import java.util.ArrayList;

public class High {//high card
    public static ArrayList<Card> fHigh(ArrayList<Card> cards) {//checking for highest card
        ArrayList<Card> best = new ArrayList<>();
        Card val = new Card(-1, -1);
        best.add(val);
        for (Card card : cards) {
            if (card.getValue() > best.get(0).getValue()) {
                best.set(0, card);
            }
        }
        return best;
    }
}
