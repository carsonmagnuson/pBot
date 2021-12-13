package cs222.pbot;

import java.util.ArrayList;

public class StraightFlush {
    public static ArrayList<Card> fStraightFlush(ArrayList<Card> cards) {
        ArrayList<Card> best = Straight.fStraight(cards);
        if (best.get(0).getValue() != -1) {
            best = Flush.fFlush(best);
            if (best.get(0).getValue() != -1) {
                return best;
            }
        }
        best.clear();
        Card val = new Card(-1, -1);
        best.add(val);
        return best;
    }
}
