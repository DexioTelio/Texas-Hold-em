package domain;

import domain.enums.Rank;

public record Card(
        char suit,
        String rank
) {
  @Override
  public String toString() {
    return "%s%s".formatted(rank, suit);
  }
}
