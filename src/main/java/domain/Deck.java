package domain;

import domain.enums.Rank;
import domain.enums.Suit;

import java.util.ArrayList;
import java.util.List;

public class Deck {
  private final List<Card> cards = new ArrayList<>(52);

  public Deck() {
    createDeck();
  }

  private void createDeck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
  }

  public int size() {
    return cards.size();
  }
}
