package cs222.pbot;

import java.util.ArrayList;

public class Hand {
    public static String bestHand(ArrayList<Card> cards) {
        ArrayList<Card> best = new ArrayList<>(cards);


        best = StraightFlush.fStraightFlush(best);
        if (fHand(best)) {
            if (best.get(0).getValue() == 14) {
                return "Royal Flush";
            } else {
                return (best.get(0).getName(1) + " high Straight Flush");
            }
        }

        best = new ArrayList<>(cards);
        best = Quads.fQuads(best);
        if (fHand(best)) {
            return ("Quad " + best.get(0).getName(0));
        }

        best = new ArrayList<>(cards);
        best = FullHouse.fFullHouse(best);
        if (fHand(best)) {
            return (best.get(0).getName(0) + " full of " + best.get(3).getName(0));
        }

        best = new ArrayList<>(cards);
        best = Flush.fFlush(best);
        if (fHand(best)) {
            return (best.get(0).getName(1) + " high Flush");
        }

        best = new ArrayList<>(cards);
        best = Straight.fStraight(best);
        if (fHand(best)) {
            return (best.get(0).getName(1) + " high Straight");
        }

        best = new ArrayList<>(cards);
        best = Trips.fTrips(best);
        if (fHand(best)) {
            return ("Trip " + best.get(0).getName(0));
        }

        best = new ArrayList<>(cards);
        best = Pair.fPair(best);
        if (fHand(best)) {
            return ("Pair of " + best.get(0).getName(0));
        }

        best = new ArrayList<>(cards);
        best = High.fHigh(best);
        return (best.get(0).getName(1) + " High");


    }

    public static boolean fHand(ArrayList<Card> best) {
        if (best.get(0).getValue() != -1) {
            return true;
        } else {
            return false;
        }
    }
}
