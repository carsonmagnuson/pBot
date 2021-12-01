package cs222.pbot;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int preflop = 0;
    int flop = 1;
    int river = 2;
    int turn = 3;
    Deck pDeck = new Deck();
    ArrayList<Card> hand = new ArrayList<>();
    ArrayList<Card> faceup = new ArrayList<>();
//        pDeck.shuffle();
//        System.out.println(pDeck.flop());

    int c = 0;
    long startTime = System.nanoTime();
    for (int i = 0; i < 2600000; i++) {
      c++;
    }
    long elapsedTime = System.nanoTime() - startTime;

    System.out.println("Total execution time to create 1000K objects in Java in millis: "
      + elapsedTime / 1000000);
//        int value1 = (int) (Math.random()*(14-1)+1);
//        int suit1 = (int) (Math.random()*(5-1)+1);
//
//        int value2 = (int) (Math.random()*(14-1)+1);
//        int suit2 = (int) (Math.random()*(5-1)+1);
//
//        Card first = new Card(value1, suit1);
//        Card second = new Card(value2, suit2);
//        hand.add(first);//hand is dealt
//        hand.add(second);
//
//        calculate(preflop, hand, faceup);

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
