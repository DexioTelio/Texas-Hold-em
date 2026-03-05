package domain;

import enums.Rank;
import enums.Suit;

public record Card(
        Rank rank,
        Suit suit
) {
}
