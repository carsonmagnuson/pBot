package cs222.pbot;

import java.util.ArrayList;

public class Hand {
    public static void bestHand(ArrayList<Card> cards){
        ArrayList<Card> best = StraightFlush.fStraightFlush(cards);
        if(best.get(0).getValue() != -1){
            if(best.get(0).getValue() == 14){
                System.out.println("Royal Flush");
            } else {
                System.out.println(best.get(0).getName() + " high Straight Flush");
            }
        }
    }
}
