package cs222.pbot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int preflop = 0;
        int flop = 1;
        int river = 2;
        int turn = 3;
        Deck pDeck = new Deck();
        ArrayList<Card> hand;
        ArrayList<Card> faceup = new ArrayList<>();
        pDeck.shuffle();
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());
//    faceup.add(pDeck.cards.pop());

        faceup.add(new Card(2, 3));
        faceup.add(new Card(2, 1));
        faceup.add(new Card(3, 3));
        faceup.add(new Card(5, 1));
        faceup.add(new Card(3, 2));
//    faceup.add(new Card(11, 1));
//    faceup.add(new Card(12, 1));
//    faceup.add(new Card(9, 1));
//    faceup.add(new Card(10, 1));
//    faceup.add(new Card(13, 1));


        for (Card card : faceup) {
            System.out.print(card.getName() + ", ");
        }
        System.out.println();

        hand = FullHouse.fFullHouse(faceup);
        if (hand.get(0).getValue() != -1) {
            for (Card card : hand) {
                System.out.print(card.getName() + ", ");
            }
        }


//    Trips trips = new Trips();
//    hand = trips.fTrips(faceup);
//    System.out.println("\n" + hand.get(0).getName() + ", " + hand.get(1).getName() + ", and the " + hand.get(2).getName());

//    Pair pair = new Pair();
//    System.out.println("\n" + hand.get(0).getName() + " and " + hand.get(1).getName());


    }

    public static void calculate(int phase, ArrayList<Card> hand, ArrayList<Card> faceup) {
        switch (phase) {
            case 0:
                Statistics.preflop(hand);
        }
    }
}
//https://towardsdatascience.com/poker-with-python-how-to-score-all-hands-in-texas-holdem-6fd750ef73d
//https://towardsdatascience.com/how-to-build-a-poker-simulation-tool-with-python-449eddd59613
