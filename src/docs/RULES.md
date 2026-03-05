# Texas Hold'em Rules

This document describes the rules used by the poker engine implemented in this project.

The game variant is **Texas Hold'em**, the most widely played form of poker.

---

# Deck

The game uses a standard deck of **52 cards**.

Suits:

- Spades
- Hearts
- Diamonds
- Clubs

Ranks (from lowest to highest):

2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A

The Ace can act as both:

- the highest card
- the lowest card in a straight (A-2-3-4-5)

No jokers are used.

---

# Players

A Texas Hold'em table typically supports:

- Minimum: 2 players
- Maximum: 10 players

Each player receives **two private cards**.

Players may fold, continue, or participate in betting rounds depending on the game logic.

---

# Objective

The objective is to win the pot by either:

1. Having the best five-card hand at showdown.
2. Forcing all other players to fold.

Players build their hands using:

- their **two private cards**
- the **five community cards**

A player may use:

- both private cards
- one private card
- none (only community cards)

The best **five-card combination** determines the winner.

---

# Game Flow

A round of Texas Hold'em progresses through several phases.

---

## 1. Pre-Flop

Each player receives:

- **two private cards** (face down)

These cards are visible only to the player.

After receiving their cards, the first betting round occurs.

---

## 2. Flop

Three community cards are placed face up on the table.

These cards are shared by all players.

Another betting round follows.

---

## 3. Turn

A fourth community card is revealed.

Another betting round occurs.

---

## 4. River

The fifth and final community card is revealed.

A final betting round occurs.

---

## 5. Showdown

If two or more players remain after the final betting round:

- players reveal their cards
- the best five-card hand wins the pot

If hands are identical in strength, the pot is split.

---

# Poker Hand Rankings

Hands are ranked from lowest to highest.

---

## 1. High Card

No combination is formed.

The highest card determines the strength of the hand.

---

## 2. One Pair

Two cards of the same rank.

Example:

---

## 3. Two Pair

Two different pairs.

Example:

---

## 4. Three of a Kind

Three cards of the same rank.

Example:

---

## 5. Straight

Five consecutive ranks.

Example:

Ace may be used as:

---

## 6. Flush

Five cards of the same suit.

Example:

---

## 7. Full House

Three of a kind + a pair.

Example:

---

## 8. Four of a Kind

Four cards of the same rank.

Example:

---

## 9. Straight Flush

Five consecutive cards of the same suit.

Example:

---

## 10. Royal Flush

The strongest possible hand.

Example:

---

# Tie Resolution

If two players have the same hand category:

1. The highest relevant card determines the winner.
2. If still tied, the next highest card is compared.
3. If all cards are equal, the pot is split.

---

# Notes for Implementation

Important considerations for the engine:

- Only the best **five-card combination** matters.
- Community cards may be shared by all players.
- Hand evaluation must detect all ranking categories correctly.
- Hand comparison must follow official ranking rules.

The engine must be able to evaluate hands formed from **seven cards**:

- two private cards
- five community cards