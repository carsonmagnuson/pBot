package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;

public class Straight {
    public static ArrayList<Card> fStraight(ArrayList<Card> cards) {

        Collections.reverse(Deck.sort(cards));

        ArrayList<Card> best = new ArrayList<>();
        for (int card = 0; card < cards.size() - 4; card++) {
            best.clear();
            for (int comparison = 0; comparison < 5; comparison++) {
                if (cards.get(card + comparison).getValue() == cards.get(card).getValue() - comparison) {
                    best.add(cards.get(card + comparison));
                }
            }
            if (best.size() > 4) {
                return best;
            }
        }
        best.clear();
        Card val = new Card(-1, -1);
        best.add(val);
        return best;
    }

}
