package domain.entities;

import domain.enums.Rank;
import domain.enums.Suit;
import domain.enums.TableType;
import domain.interfaces.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerDeck implements Deck {
  private final List<Card> cards = new ArrayList<>(52);
  private final static Random random = new Random();

  public PokerDeck() {
    createDeck();
    shuffle(cards, 14);
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

  @Override
  public List<Card> draw(TableType tableType) {
    int totalCards = (tableType.getTableType() * 2) + 5;
    int size = size();
    List<Card> cardsToDealt = cards.subList(size - totalCards, size);
    cards.removeAll(cardsToDealt);
    return cardsToDealt;
  }

  @Override
  public void shuffle() {

  }

  @Override
  public int remainingCards() {
    return 0;
  }
}
