package cs222.pbot;

import java.util.HashMap;

public class Card {
    private static HashMap<Integer, String> valNames;
    private static HashMap<Integer, String> suitNames;
    private int value;
    private final int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;

        valNames = new HashMap<>();
        valNames.put(-1, "none");
        valNames.put(1, "Ace");
        valNames.put(2, "Two");
        valNames.put(3, "Three");
        valNames.put(4, "Four");
        valNames.put(5, "Five");
        valNames.put(6, "Six");
        valNames.put(7, "Seven");
        valNames.put(8, "Eight");
        valNames.put(9, "Nine");
        valNames.put(10, "Ten");
        valNames.put(11, "Jack");
        valNames.put(12, "Queen");
        valNames.put(13, "King");
        valNames.put(14, "Ace");

        suitNames = new HashMap<>();
        suitNames.put(-1, "none");
        suitNames.put(1, "Clubs");
        suitNames.put(2, "Diamonds");
        suitNames.put(3, "Hearts");
        suitNames.put(4, "Spades");
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String getName() {
        return valNames.get(this.value) + " of " + suitNames.get(this.suit);
    }
}
