package cs222.pbot;

import java.util.ArrayList;

public class StraightFlush {//five sequential cards all within the same suit
    public static ArrayList<Card> fStraightFlush(ArrayList<Card> cards) {
        ArrayList<Card> best = Straight.fStraight(cards);//use straight method to check for sequential cards
        if (best.get(0).getValue() != -1) {
            best = Flush.fFlush(best);//upon success of sequential cards, checking if flush
            if (Hand.fHand(best)) {
                return best;
            }
        }
        best.clear();
        Card val = new Card(-1, -1);
        best.add(val);
        return best; //default negative value card
    }
}
