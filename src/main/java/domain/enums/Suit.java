package domain.enums;

public enum Suit {
  SPADES('\u2660'), // ♠
  HEARTS('\u2665'), // ♥
  DIAMONDS('\u2666'), // ♦
  CLUBS('\u2663'); // ♣

  public final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }
}
