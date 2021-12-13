package cs222.pbot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int preflop = 0;
        int flop = 1;
        int river = 2;
        int turn = 3;
        Deck pDeck = new Deck();
        ArrayList<Card> best;
        ArrayList<Card> faceup = new ArrayList<>();
        pDeck.shuffle();

        //Create random 7 card set
        for (int x = 0; x < 7; x++) {
            faceup.add(pDeck.cards.pop());
        }
//Testing
//        faceup.add(new Card(7, 1));
//        faceup.add(new Card(6, 1));
//        faceup.add(new Card(5, 1));
//        faceup.add(new Card(6, 1));
//        faceup.add(new Card(8, 1));
//        faceup.add(new Card(9, 1));
//        faceup.add(new Card(10, 1));
//        faceup.add(new Card(10, 2));
//        faceup.add(new Card(10, 3));

        for (Card card : faceup) {
            System.out.print(card.getName() + ", ");
        }
        System.out.println();
        System.out.println(Hand.bestHand(faceup));

    }
}
//https://towardsdatascience.com/poker-with-python-how-to-score-all-hands-in-texas-holdem-6fd750ef73d
//https://towardsdatascience.com/how-to-build-a-poker-simulation-tool-with-python-449eddd59613
