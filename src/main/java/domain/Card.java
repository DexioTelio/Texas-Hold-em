package domain;

import domain.enums.Rank;
import domain.enums.Suit;

public record Card(
        Suit suit,
        Rank rank
) {
}
