package domain;

public record Card(
        char suit,
        String rank
) {
  @Override
  public String toString() {
    return "%s%s".formatted(rank, suit);
  }
}
