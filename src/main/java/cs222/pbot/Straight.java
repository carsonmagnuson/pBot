package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;

public class Straight {//5 cards in value sequence
    public static ArrayList<Card> fStraight(ArrayList<Card> cards) {

        Collections.reverse(Deck.sort(cards));//sort and reverse card order so that cards are highest to lowest - find best straight first

        ArrayList<Card> best = new ArrayList<>();
        if (seqCheck(cards, best)) return best;//first sequence check - for while aces = 1

        for (Card card : cards) {//set aces to equal 14
            if (card.getValue() == 1) {
                card.setValue(14);
            }
        }

        Collections.reverse(Deck.sort(cards));// re-sort and reverse cards now that aces are 14

        if (seqCheck(cards, best)) return best;//second sequence check - for while aces = 14
        Card val = new Card(-1, -1);
        best.add(val);
        return best;
    }

    private static boolean seqCheck(ArrayList<Card> cards, ArrayList<Card> best) {//sequenceCheck for 5 cards in a row
        for (int card = 0; card < cards.size() - 4; card++) {//remember, counter ends 4 before the end, because 5 are needed for a straight
            best.clear();
            for (int comparison = 0; comparison < 5; comparison++) {
                if (cards.get(card + comparison).getValue() == cards.get(card).getValue() - comparison) {//the minus sign because remember - they're organized in descending order
                    best.add(cards.get(card + comparison));//each successful sequencing card is added
                }
            }
            if (best.size() > 4) {//if we get to 5 successful sequencing cards, we return, with best containing them
                return true;
            }
        }
        best.clear();//otherwise we wipe best and move on
        return false;
    }

}
