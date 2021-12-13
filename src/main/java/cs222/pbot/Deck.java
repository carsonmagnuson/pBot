package cs222.pbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    public Stack<Card> cards = new Stack<>();

    public Deck() {
        for (int val = 0; val < 13; val++) {
            for (int suit = 0; suit < 4; suit++) {
                cards.push(new Card(val + 1, suit + 1));
            }
        }
    }

    public static ArrayList<Card> sort(ArrayList<Card> cards) {//sorting any number of cards using a merge sort
        mergeSort(cards, 0, cards.size() - 1);
        return cards;
    }

    public static void merge(ArrayList<Card> a, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        ArrayList<Card> LeftArray = new ArrayList<>();
        ArrayList<Card> RightArray = new ArrayList<>();

        for (i = 0; i < n1; i++) {
            LeftArray.add(a.get(beg + i));
        }

        for (j = 0; j < n2; j++) {
            RightArray.add(a.get(mid + 1 + j));
        }

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray.get(i).getValue() <= RightArray.get(j).getValue()) {
                a.set(k, LeftArray.get(i));
                i++;
            } else {
                a.set(k, RightArray.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            a.set(k, LeftArray.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            a.set(k, RightArray.get(j));
            j++;
            k++;
        }
    }

    public static void mergeSort(ArrayList<Card> a, int beg, int end) {//merge sort
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public ArrayList<String> flop() {//method to return top three cards off the deck
        ArrayList<String> flop = new ArrayList<>();
        for (int x = 0; x < 3; x++) {
            flop.add(cards.pop().getName());
        }
        return flop;
    }

    public Stack<Card> shuffle() {//shuffle method
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
