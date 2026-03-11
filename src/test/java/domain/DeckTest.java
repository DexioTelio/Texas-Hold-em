package domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {

  @Test
  void deckShouldContains52Cards() {
    Deck deck = new Deck();
    assertEquals(52, deck.size());
  }
}
