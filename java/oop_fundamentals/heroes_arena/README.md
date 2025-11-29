# Heroes Arena Game - OOP Fundamentals Project ⚔️

Welcome to the Heroes Arena game! This project is designed to help you practice and understand core Object-Oriented Programming (OOP) concepts in Java through building an interactive battle game.

## 🎯 Objectives

By completing this project, you will practice:

1. **Abstract Classes**: Understanding and implementing abstract classes
2. **Inheritance**: Creating subclasses that extend parent classes
3. **Interfaces**: Implementing interfaces for specific behaviors
4. **Encapsulation**: Using access modifiers and getters/setters
5. **Polymorphism**: Implementing method overriding and dynamic method dispatch
6. **Package Structure**: Organizing code with packages
7. **Class Design**: Designing a cohesive class hierarchy

---

## 📂 Project Structure

The project is organized with source files in the `src/` folder:

```
heroes_arena/
├── README.md
└── src/
    └── oop_fundamentals/
        └── heroes_arena/
            ├── Main.java          - Entry point of the application
            ├── GameCharacter.java - Abstract base class for all characters
            ├── Warrior.java       - Concrete class extending GameCharacter
            ├── Mage.java         - Concrete class extending GameCharacter and implementing Healable
            ├── Weapon.java       - Class representing weapons used by characters
            ├── Healable.java     - Interface for characters that can heal
            └── Arena.java        - Class managing the battle logic
```

---

## 🎮 Game Overview

The Heroes Arena is a turn-based combat game where two characters battle until one is defeated. The game features:

- **Two Character Types**: Warriors and Mages with different abilities
- **Weapon System**: Characters can equip weapons that affect damage
- **Special Abilities**: Mages can heal when low on health
- **Turn-Based Combat**: Characters take turns attacking each other
- **Random Elements**: Mages have a chance for critical hits or spell failures

---

## 📝 How to Run

### Prerequisites

- Java JDK installed (version 8 or higher)
- Command line or IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compilation and Execution

1. **Navigate to the project directory:**

   ```bash
   cd java/oop_fundamentals/heroes_arena
   ```

2. **Compile all Java files from the src directory:**

   ```bash
   javac src/oop_fundamentals/heroes_arena/*.java
   ```

   Or compile with output directory:

   ```bash
   javac -d . src/oop_fundamentals/heroes_arena/*.java
   ```

3. **Run the game:**

   ```bash
   java -cp src oop_fundamentals.heroes_arena.Main
   ```

   Or if compiled to current directory:

   ```bash
   java oop_fundamentals.heroes_arena.Main
   ```

### Using an IDE

- **IntelliJ IDEA / Eclipse**:
  - Open the `heroes_arena` folder as the project root
  - Mark `src` as the source root
  - Right-click `Main.java` in `src/oop_fundamentals/heroes_arena/` → Run
- **VS Code**:
  - Install Java extensions
  - Open the `heroes_arena` folder
  - Click "Run" above the `main` method in `src/oop_fundamentals/heroes_arena/Main.java`

---

## 🏗️ Project Architecture

### Class Hierarchy

```
GameCharacter (abstract)
    ├── Warrior
    └── Mage (implements Healable)
```

### Key Components

1. **GameCharacter (Abstract Class)**

   - Base class for all characters
   - Contains common properties: name, HP, power, weapon
   - Defines abstract `attack()` method
   - Provides common methods: `getHp()`, `setHp()`, `isAlive()`

2. **Warrior (Concrete Class)**

   - Extends `GameCharacter`
   - High HP (150) and moderate power (10)
   - Simple attack: power + weapon damage

3. **Mage (Concrete Class)**

   - Extends `GameCharacter` and implements `Healable`
   - Lower HP (100) but higher power (20)
   - Special attack with critical hit chance and spell failure
   - Can heal when HP drops below 30

4. **Weapon (Class)**

   - Encapsulated class with private fields
   - Represents weapons with name and damage
   - Provides getters for accessing weapon properties

5. **Healable (Interface)**

   - Defines contract for healing ability
   - Implemented by `Mage` class

6. **Arena (Class)**
   - Manages battle logic
   - Handles turn-based combat
   - Determines winner

---

## 💡 Learning Concepts Demonstrated

### 1. Abstract Classes

- `GameCharacter` is abstract and cannot be instantiated
- Contains both concrete methods (`getHp()`, `setHp()`) and abstract methods (`attack()`)
- Forces subclasses to implement the `attack()` method

### 2. Inheritance

- `Warrior` and `Mage` inherit from `GameCharacter`
- Use `super()` to call parent constructor
- Inherit all protected and public members

### 3. Method Overriding

- Both `Warrior` and `Mage` override the `attack()` method
- Each provides unique attack implementation
- Demonstrates polymorphism

### 4. Interfaces

- `Healable` interface defines a contract
- `Mage` implements `Healable` to gain healing ability
- Shows interface implementation with `implements` keyword

### 5. Encapsulation

- `Weapon` class uses private fields
- Access controlled through public getters
- Prevents direct modification of internal state

### 6. Polymorphism

- `GameCharacter` reference can point to `Warrior` or `Mage` objects
- Method calls resolved at runtime based on actual object type
- `instanceof` used to check object type in `Arena` class

### 7. Package Structure

- All classes in `oop_fundamentals.heroes_arena` package
- Demonstrates proper Java package organization

---

## 🚀 Extension Ideas

Want to extend this project? Here are some ideas:

1. **Add More Character Types**

   - Create `Archer`, `Rogue`, or `Paladin` classes
   - Each with unique abilities and stats

2. **Enhance the Weapon System**

   - Add weapon types (sword, staff, bow)
   - Implement weapon durability
   - Create rare/legendary weapons

3. **Add More Interfaces**

   - `Defendable` for characters that can block
   - `Castable` for spell-casting characters
   - `Rageable` for characters with rage abilities

4. **Improve Battle System**

   - Add status effects (poison, burn, freeze)
   - Implement dodge/block mechanics
   - Add multiple rounds or tournament mode

5. **Add User Input**

   - Let players choose characters
   - Allow weapon selection
   - Add interactive battle choices

6. **Save/Load System**
   - Save character stats to file
   - Load previous game states
   - Track win/loss statistics

---

## 📚 Related Learning Topics

This project covers topics from the Java Learning Path:

- **Topic 7**: Object-Oriented Programming: Classes and Objects
- **Topic 8**: Encapsulation and Access Modifiers
- **Topic 9**: Inheritance
- **Topic 10**: Polymorphism
- **Topic 11**: Abstract Classes and Interfaces

Refer to `java/README.md` for detailed explanations of these concepts.

---

## 🐛 Common Issues and Solutions

### Issue: "Weapon cannot be resolved to a type"

**Solution**: Make sure all files are in the same package and compile all files together with `javac *.java`

### Issue: "Package does not match expected package"

**Solution**: Ensure the package declaration matches your folder structure. Files in `java/oop_fundamentals/heroes_arena/` should have `package oop_fundamentals.heroes_arena;`

### Issue: "Cannot find symbol" errors

**Solution**: Compile all files at once, or compile dependencies first (Weapon.java before GameCharacter.java)

### Issue: "Main method not found"

**Solution**: Run with full package path: `java oop_fundamentals.heroes_arena.Main`

---

## ✅ Project Checklist

Use this checklist to track your understanding:

- [ ] Understand what an abstract class is and why `GameCharacter` is abstract
- [ ] Understand how `Warrior` and `Mage` inherit from `GameCharacter`
- [ ] Understand how method overriding works in `attack()` methods
- [ ] Understand how `Mage` implements the `Healable` interface
- [ ] Understand encapsulation in the `Weapon` class
- [ ] Understand polymorphism when `Arena` uses `GameCharacter` references
- [ ] Understand the package structure and how to compile/run
- [ ] Successfully run the game and see the battle output

---

## 🎓 Next Steps

After completing this project:

1. **Experiment**: Modify character stats, add new abilities, or create new character types
2. **Refactor**: Improve code organization, add more methods, or enhance encapsulation
3. **Extend**: Implement the extension ideas mentioned above
4. **Review**: Go back to the Java Learning Path and review OOP concepts
5. **Practice**: Build another OOP project to reinforce your learning

---

**Happy Coding! ⚔️**

Remember: The best way to learn OOP is by building projects. Experiment with the code, break things, fix them, and most importantly, have fun while learning!
