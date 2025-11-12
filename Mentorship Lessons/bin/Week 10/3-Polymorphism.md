# 🎶 **Exercise 1: Instruments**

**Goal:** See how one command can trigger many behaviors.

```java
class Instrument {
    void play() {
        System.out.println("An instrument is playing.");
    }
}

// TODO: Create Guitar and Piano classes that extend Instrument
// Override play() in each to print unique messages

public class TestPolymorphism1 {
    public static void main(String[] args) {
        // TODO: Create an array of Instrument type with Guitar and Piano
        // Loop through and call play() — observe different outputs!
    }
}
```

---

## 🐾 **Exercise 2: Animal Sounds**

**Goal:** Practice dynamic method dispatch (runtime polymorphism).

```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

// TODO: Create subclasses Dog, Cat, and Cow
// Each overrides makeSound() with its specific sound

public class TestPolymorphism2 {
    public static void main(String[] args) {
        // TODO: Use an Animal reference for each subclass
        // e.g., Animal a = new Dog();
        // Call makeSound() and see which version runs
    }
}
```

---

## 🏁 **Exercise 3: Payment System**

**Goal:** Apply polymorphism to a real-world example.

```java
abstract class Payment {
    abstract void pay();
}

// TODO: Create subclasses CreditCardPayment, PayPalPayment, and BankTransferPayment
// Each should implement pay() differently (print a unique message)

public class TestPolymorphism3 {
    public static void main(String[] args) {
        // TODO: Create an array of Payment references holding different payment types
        // Use a loop to call pay() on each
    }
}
```
