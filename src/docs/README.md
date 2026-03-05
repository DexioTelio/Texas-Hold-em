# Texas Hold'em Poker Engine

A Texas Hold'em poker engine implemented in Java.

This project focuses on building a clean, maintainable, and testable implementation of the core mechanics of poker. The goal is not to create a graphical game, but to develop a robust backend-style game engine that models the rules and behavior of Texas Hold'em.

The project is designed as a portfolio piece demonstrating software engineering practices such as object-oriented design, domain modeling, testing, and clean architecture.

---

## Project Goals

- Implement a complete Texas Hold'em game engine
- Apply object-oriented design principles
- Model the poker domain accurately
- Write reliable unit tests
- Maintain a clean and extensible architecture

This project emphasizes **domain modeling and correctness** rather than user interface development.

---

## Game Variant

This engine implements:

**Texas Hold'em**

Key characteristics:

- Standard 52-card deck
- 2 private cards per player
- 5 community cards
- Best 5-card hand wins

Full rules are documented in `RULES.md`.

---

## Architecture Overview

The project models the poker domain through several core components.

### Card

Represents a single playing card.

Properties:

- Rank
- Suit

Cards are immutable value objects.

---

### Deck

Represents the full deck of 52 cards.

Responsibilities:

- Create the deck
- Shuffle cards
- Deal cards

---

### Player

Represents a participant in the game.

Responsibilities:

- Hold private cards
- Maintain player state (active, folded, etc.)
- Participate in rounds

Players may be:

- Human-controlled
- AI-controlled

---

### Table / Game Engine

Controls the flow of the game.

Responsibilities:

- Manage players
- Handle dealing phases
- Reveal community cards
- Control betting rounds
- Determine when a round ends

---

### Hand Evaluation

Responsible for determining the best poker hand.

Responsibilities include:

- Detecting hand types
- Ranking hands
- Comparing players' hands

---

## Design Principles

The project follows core object-oriented design principles.

### Encapsulation

Each class manages its own state and exposes only necessary behavior.

### Single Responsibility

Each component has a clearly defined role within the poker domain.

### Domain Modeling

Classes represent real concepts from poker:

- Card
- Deck
- Player
- Hand
- Table

### Immutability (where appropriate)

Objects like `Card` should be immutable to prevent inconsistent state.

---

## Testing

Testing is an essential part of this project.

Unit tests validate critical parts of the system:

- Deck creation
- Card integrity
- Hand evaluation
- Game flow rules

Testing will be implemented using **JUnit**.

---

## Scope

This project intentionally focuses on the **game engine only**.

Out of scope:

- Graphical user interface
- Web interface
- Networking
- Multiplayer infrastructure

The engine is designed so that interfaces could be added later if desired.

---

## Project Structure (Conceptual)

The project follows a modular structure separating documentation, domain modeling, game logic, and testing.

TexasHoldem/
├── .idea/                    (configuración del IDE)
├── src/
│   ├── docs/                 (documentación)
│   │   ├── ARCHITECTURE.md
│   │   ├── README.md
│   │   ├── RULES.md          ← (seleccionado)
│   │   └── TODO.md
│   │
│   ├── main/
│   │   ├── java/
│   │   │   ├── domain/       (entidades principales)
│   │   │   │   ├── Card
│   │   │   │   └── Deck
│   │   │   ├── engine/       (lógica del juego)
│   │   │   ├── enums/        (enumeraciones)
│   │   │   └── evaluation/   (evaluación de manos)
│   │   │
│   │   └── resources/        (archivos de recursos)
│   │
│   └── test/                 (pruebas unitarias)
│
├── .gitignore
└── pom.xml                   (configuración Maven)


### Directory Responsibilities

**docs**

Contains all documentation related to the project:

- rules of the game
- architecture notes
- design decisions
- development roadmap

---

**domain**

Contains the core entities of the poker model.

Examples:

- Card
- Deck
- Player
- Hand

These classes represent the fundamental concepts of the poker domain.

---

**engine**

Responsible for controlling the flow of the game.

Examples of responsibilities:

- managing rounds
- controlling game phases
- coordinating players and cards

---

**enums**

Contains enumerations that define fixed sets of values.

Examples:

- Suit
- Rank
- HandRank

---

**evaluation**

Contains algorithms responsible for evaluating and comparing poker hands.

This is one of the most critical parts of the system.

---

**test**

Contains unit tests validating the correctness of the engine.

Critical components such as deck generation and hand evaluation must be thoroughly tested.

---

## Engineering Goals

This project aims to demonstrate:

- clean domain modeling
- object-oriented design
- test-driven development practices
- clear project organization
- maintainable and extensible code

The focus is on building a **robust poker engine**, not on user interfaces.

---

## License

License will be defined in the future.