# 🧬 PART 1 — Inheritance Exercises

---

## 🐕 **Exercise 1: Animal Family**

**Goal:** Understand how child classes inherit parent behavior.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// TODO: Create a subclass called Dog that inherits from Animal
// and adds a method bark() that prints "Woof! Woof!"

public class TestInheritance1 {
    public static void main(String[] args) {
        // TODO: Create a Dog object and call both eat() and bark()
    }
}
```

---

## 🚗 **Exercise 2: Vehicle Upgrade**

**Goal:** Add new behaviors to a child class.

```java
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

// TODO: Create a subclass Car that extends Vehicle
// Add a method honk() that prints "Beep! Beep!"
// Add another method stop() that prints "The car stops safely."

public class TestInheritance2 {
    public static void main(String[] args) {
        // TODO: Create a Car object and call start(), honk(), and stop()
    }
}
```

---

## 🎮 **Exercise 3: Overriding Powers**

**Goal:** Override a parent method to change behavior.

```java
class Player {
    void attack() {
        System.out.println("The player attacks normally.");
    }
}

// TODO: Create a subclass Mage that overrides attack()
// to print "The mage casts a fireball!"

// TODO: Create a subclass Warrior that overrides attack()
// to print "The warrior swings a sword!"

public class TestInheritance3 {
    public static void main(String[] args) {
        // TODO: Create Mage and Warrior objects and call attack()
    }
}
```

---
