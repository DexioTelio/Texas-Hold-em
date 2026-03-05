# Texas Hold'em Poker Engine

A **Texas Hold'em poker engine** implemented in **Java**.

This project focuses on building a **clean, maintainable, and testable backend-style engine** that models the rules and behavior of Texas Hold'em.
It is designed as a **portfolio project** demonstrating solid software engineering practices such as domain modeling, object-oriented design, and testing.

---

## Features

* Texas Hold'em game engine
* Accurate poker domain modeling
* Object-oriented architecture
* Immutable value objects where appropriate
* Unit testing with JUnit
* Clean and extensible project structure

---

## Game Variant

This engine implements **Texas Hold'em** with the following rules:

* Standard **52-card deck**
* **2 private cards** per player
* **5 community cards**
* Best **5-card hand wins**

Full rules are documented in:

```
docs/RULES.md
```

---

## Architecture Overview

The engine models core poker concepts through dedicated components.

### Core Domain

| Component  | Responsibility                             |
| ---------- | ------------------------------------------ |
| **Card**   | Immutable representation of a playing card |
| **Deck**   | Creates, shuffles, and deals cards         |
| **Player** | Represents a participant in the game       |
| **Hand**   | Represents a player's possible poker hand  |

### Game Engine

Responsible for controlling the flow of the game:

* dealing phases
* community cards
* betting rounds
* round progression

### Hand Evaluation

Algorithms responsible for:

* detecting poker hands
* ranking hands
* comparing players

---

## Project Structure

```
TexasHoldem/
├── docs/                # project documentation
│   ├── ARCHITECTURE.md
│   ├── RULES.md
│   └── TODO.md
│
├── src/
│   ├── main/java/
│   │   ├── domain/      # core poker entities
│   │   ├── engine/      # game flow logic
│   │   ├── enums/       # enums (Suit, Rank, etc.)
│   │   └── evaluation/  # hand evaluation logic
│   │
│   └── test/            # unit tests
│
├── pom.xml
└── README.md
```

---

## Design Principles

This project emphasizes:

* **Clean domain modeling**
* **Single Responsibility Principle**
* **Encapsulation**
* **Immutability where appropriate**
* **Testable architecture**

The focus is on building a **robust game engine**, not a user interface.

---

## Testing

Unit tests validate critical parts of the engine:

* deck generation
* card integrity
* hand evaluation
* game flow rules

Testing is implemented using **JUnit**.

---

## Scope

### Included

* Poker engine logic
* Hand evaluation
* Game flow management
* Domain modeling

### Out of Scope

* GUI
* Web interface
* Networking
* Multiplayer infrastructure

The engine is designed so that interfaces could be added later if needed.

---

## Documentation

Additional documentation is available in the `docs/` directory:

* **Architecture notes**
* **Poker rules**
* **Development roadmap**

---

## License

License will be defined in the future.
