## 🧬 PART 1 — INHERITANCE EXERCISES

---

### 🐕 **Exercise 1: Animal Family**

**Starter Code + Solution**

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class TestInheritance1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited from Animal
        d.bark(); // Dog's own method
    }
}
```

**💡 Explanation:**
`Dog` inherits `eat()` from `Animal`, so it can use that behavior without re-writing it. `Dog` also adds its own `bark()` method — demonstrating class extension.

---

### 🚗 **Exercise 2: Vehicle Upgrade**

**Starter Code + Solution**

```java
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Beep! Beep!");
    }

    void stop() {
        System.out.println("The car stops safely.");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        car.stop();
    }
}
```

**💡 Explanation:**
`Car` extends `Vehicle` and inherits its `start()` method, while adding new behaviors (`honk()` and `stop()`).

---

### 🎮 **Exercise 3: Overriding Powers**

**Starter Code + Solution**

```java
class Player {
    void attack() {
        System.out.println("The player attacks normally.");
    }
}

class Mage extends Player {
    void attack() {
        System.out.println("The mage casts a fireball!");
    }
}

class Warrior extends Player {
    void attack() {
        System.out.println("The warrior swings a sword!");
    }
}

public class TestInheritance3 {
    public static void main(String[] args) {
        Mage m = new Mage();
        m.attack();

        Warrior w = new Warrior();
        w.attack();
    }
}
```

**💡 Explanation:**
Each subclass **overrides** the parent’s `attack()` method to provide specialized behavior — showing method overriding.

---

## ⚙️ PART 2 — INTERFACE EXERCISES

---

### ✈️ **Exercise 1: Flyable Interface**

**Starter Code + Solution**

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("The bird soars high in the sky.");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
    }
}
```

**💡 Explanation:**
An interface defines a promise. `Bird` implements `Flyable` and must provide the `fly()` behavior.

---

### 💬 **Exercise 2: Speak Up!**

**Starter Code + Solution**

```java
interface Speakable {
    void speak();
}

class Human implements Speakable {
    public void speak() {
        System.out.println("Hello!");
    }
}

class Dog implements Speakable {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Robot implements Speakable {
    public void speak() {
        System.out.println("Beep boop.");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Speakable[] speakers = { new Human(), new Dog(), new Robot() };

        for (Speakable s : speakers) {
            s.speak();
        }
    }
}
```

**💡 Explanation:**
All three classes **implement the same interface** but behave differently — showing consistency through a shared contract.

---

### 🦸 **Exercise 3: Multiple Abilities**

**Starter Code + Solution**

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flaps its wings.");
    }

    public void swim() {
        System.out.println("Duck paddles in the pond.");
    }
}

public class TestInterface3 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
```

**💡 Explanation:**
A class can implement **multiple interfaces**, combining multiple abilities into one object — a duck can both fly and swim.

---

## 🎭 PART 3 — POLYMORPHISM EXERCISES

---

### 🎶 **Exercise 1: Instruments**

**Starter Code + Solution**

```java
class Instrument {
    void play() {
        System.out.println("An instrument is playing.");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Strumming the guitar 🎸");
    }
}

class Piano extends Instrument {
    void play() {
        System.out.println("Playing the piano 🎹");
    }
}

public class TestPolymorphism1 {
    public static void main(String[] args) {
        Instrument[] instruments = { new Guitar(), new Piano() };

        for (Instrument i : instruments) {
            i.play();  // calls the version from each subclass
        }
    }
}
```

**💡 Explanation:**
Polymorphism allows `Instrument` references to call different `play()` methods depending on the actual object at runtime.

---

### 🐾 **Exercise 2: Animal Sounds**

**Starter Code + Solution**

```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo!");
    }
}

public class TestPolymorphism2 {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal a : animals) {
            a.makeSound();  // each animal “speaks” in its own way
        }
    }
}
```

**💡 Explanation:**
Even though all are `Animal` references, Java runs the **actual subclass’s version** of `makeSound()` — that’s dynamic dispatch.

---

### 🏁 **Exercise 3: Payment System**

**Starter Code + Solution**

```java
abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    void pay() {
        System.out.println("Payment made using PayPal.");
    }
}

class BankTransferPayment extends Payment {
    void pay() {
        System.out.println("Payment made via Bank Transfer.");
    }
}

public class TestPolymorphism3 {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new PayPalPayment(),
            new BankTransferPayment()
        };

        for (Payment p : payments) {
            p.pay();  // each subclass defines how to pay
        }
    }
}
```

**💡 Explanation:**
An abstract class defines a *shared idea* (`pay()`), and each subclass provides its own way to implement it — a real-world polymorphism example.

---

## 🧩 Summary Table

| Concept          | Key Java Feature                      | Core Skill Practiced                    |
| ---------------- | ------------------------------------- | --------------------------------------- |
| **Inheritance**  | `extends`                             | Reuse and override parent behavior      |
| **Interfaces**   | `implements`                          | Define contracts and multiple abilities |
| **Polymorphism** | method overriding + parent references | Many forms, one command                 |

---

Would you like me to bundle all 9 (with clear headings, objectives, and explanations) into a printable **lab sheet (.docx or .pdf)** for easy classroom distribution? I can format it nicely for either **student** or **instructor** use.
