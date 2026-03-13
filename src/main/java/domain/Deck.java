package domain;

import domain.enums.Rank;
import domain.enums.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
  private final List<Card> cards = new ArrayList<>(52);
  private final static Random random = new Random();

  public Deck() {
    createDeck();
    shuffle(cards, random.nextInt(5, 8));
  }

  private void createDeck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        cards.add(new Card(suit.getSymbol(), rank.getSymbol()));
      }
    }
  }

  public void shuffle(List<Card> cards, int repeat) {
    for (int i = 0; i < repeat; i++) {
      int min = random.nextInt(cards.size()/2 + 1);
      int max = random.nextInt(cards.size()/2 + 10, cards.size());
      List<Card> sub = new ArrayList<>(cards.subList(min, max));
      cards.removeAll(sub);
      int startIndex = random.nextInt(cards.size());
      cards.addAll(startIndex, sub);
    }
  }

  public int size() {
    return cards.size();
  }
}
