package cs222.pbot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck pDeck = new Deck();
        ArrayList<Card> best;
        ArrayList<Card> faceup = new ArrayList<>();
        ArrayList<Card> royal = new ArrayList<>();
        ArrayList<Card> quads = new ArrayList<>();
        pDeck.shuffle();

        royal.add(new Card(1, 2));//royal flush set
        royal.add(new Card(13, 2));
        royal.add(new Card(12, 2));
        royal.add(new Card(11, 2));
        royal.add(new Card(10, 2));

        quads.add(new Card(1, 1));//quads set
        quads.add(new Card(1, 2));
        quads.add(new Card(1, 3));
        quads.add(new Card(1, 4));



        for (int x = 0; x < 7; x++) {//Creating/printing random 7 card set
            System.out.print(pDeck.cards.peek().getName() + ", ");
            faceup.add(pDeck.cards.pop());
        }


        System.out.println();//Testing
        System.out.println(Hand.bestHand(faceup));
        System.out.println(Hand.bestHand(quads));
        System.out.println(Hand.bestHand(royal));

    }
}
//https://towardsdatascience.com/poker-with-python-how-to-score-all-hands-in-texas-holdem-6fd750ef73d
//https://towardsdatascience.com/how-to-build-a-poker-simulation-tool-with-python-449eddd59613
