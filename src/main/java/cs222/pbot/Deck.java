package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {
  private final Stack<Card> cards = new Stack<>();

  public Deck() {
    for (int val = 0; val < 13; val++) {
      for (int suit = 0; suit < 4; suit++) {
        cards.push(new Card(val + 1, suit + 1));
      }
    }
  }

  public ArrayList<String> flop() {
    ArrayList<String> flop = new ArrayList<>();
    for (int x = 0; x < 3; x++) {
      flop.add(cards.pop().getName());
    }
    return flop;
  }

  public Stack<Card> shuffle() {
    ArrayList<Card> deck = new ArrayList<>();
    while (!cards.isEmpty()) {
      deck.add(cards.pop());
    }
    Collections.shuffle(deck);
    for (Card c : deck) {
      cards.push(c);
    }
    return cards;
  }

}
