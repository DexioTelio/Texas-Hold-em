package domain.interfaces;

import domain.entities.Card;
import domain.enums.TableType;

import java.util.List;

public interface Deck {
  List<Card> draw(TableType tableType);
  void shuffle(List<Card> cards, int repeat);
  int remainingCards();
}
