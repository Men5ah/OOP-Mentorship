# **Making Java Classes Work Together — The Magic of Inheritance, Interfaces, and Polymorphism**

---

## 🎯 Objectives

By the end of this session, students should be able to:

1. Understand inheritance as “reusing and extending behavior.”
2. Use interfaces to define shared abilities.
3. Apply polymorphism to write flexible and reusable code.

---

## 🪄 What’s Inheritance?

> Imagine you’re a **superhero family**.
> The *parent superhero* can fly and run fast.
> The *child superhero* gets those powers too — without learning them again!
> But the child can also learn **new tricks** of their own.
>
> 💬 That’s inheritance: “Child classes inherit powers from parent classes.”

---

### 🧩 What’s an Interface?

> Think of an interface like a **promise or contract**.
> If a superhero *signs the FlyingHero contract*, they **promise** they can fly.
>
> Java says: “Okay, but then you must show me how you fly.”
>
> 💬 That’s an interface: a *list of things you must be able to do* — but you decide *how* to do them.

---

### 🎭 What’s Polymorphism?

> Imagine you tell all your heroes to “Attack!”
> A fire hero throws flames, a water hero splashes waves, and a speed hero punches fast —
> but you don’t have to know *which* one they are. You just say “Attack!”
>
> 💬 That’s polymorphism: **many forms, one command.**

---

## 🧱 Session Outline

---

### Part 1: Inheritance – “Like Parent, Like Child” (20 mins)

**Mini Explanation (5 mins)**

* A child class gets all the public/protected fields and methods from its parent.
* You can *extend* a class using `extends`.
* The child can *add* or *change* behavior.

**Exercise 1: The Animal Kingdom**

```java
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow!");
    }
}

public class TestAnimals {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Dog-specific

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

> 💡 *Thinking prompts:*
>
> * “Why can Dog and Cat both use eat()?”
> * “What happens if we make a method in Dog also called eat()? (method overriding)”

---

### Part 2: Interfaces – “Promises You Must Keep” (25 mins)

**Mini Explanation (5 mins)**

* Interfaces say *what you must do*, but not *how to do it*.
* A class can *implement* multiple interfaces.
* Helps us treat different objects as if they share the same “ability.”

**Exercise 2: Superpowers**

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies high in the sky!");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Fish swims gracefully!");
    }
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flaps and takes off!");
    }
    public void swim() {
        System.out.println("Duck paddles in the pond!");
    }
}

public class TestInterfaces {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
```

> 💡 *Thinking prompts:*
>
> * “Why can a duck do both things, but a fish can’t fly?”
> * “What if we add a ‘Runnable’ interface too?”

---

### Part 3: Polymorphism – “Many Forms, One Command” (25 mins)

**Mini Explanation (5 mins)**

* Polymorphism means using a **parent reference** to call **child behavior**.
* You don’t need to know which exact class it is — you just trust it knows what to do.
* Makes programs flexible and extensible.

**Exercise 3: The Orchestra**

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

public class TestPolymorphism {
    public static void main(String[] args) {
        Instrument i1 = new Guitar();
        Instrument i2 = new Piano();

        i1.play();  // Guitar version
        i2.play();  // Piano version
    }
}
```

> 💡 *Thinking prompts:*
>
> * “Why does Java call the right `play()` automatically?”
> * “What happens if we add a `Drum` class without changing the main code?”

---

### Part 4: Integration Challenge – “The Zoo of Skills” (20 mins)

**Concept Focus:** Combine all three ideas.

**Exercise 4:**

```java
interface SoundMaker {
    void makeSound();
}

class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal implements SoundMaker {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal implements SoundMaker {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        SoundMaker[] animals = { new Dog(), new Cat() };
        for (SoundMaker a : animals) {
            a.makeSound();  // Polymorphism in action
        }
    }
}
```

> 💡 *Thinking prompts:*
>
> * “What if we add a Cow that moos — what do we have to change?”
>   (Answer: just add `new Cow()`; the loop still works.)

---

### 🎬 Wrap-up Discussion (10 mins)

Ask them:

* “What’s the difference between inheritance and an interface?”
* “Why is polymorphism powerful?”
* “How can this make big software easier to build?”

Encourage them to imagine:

> “If you were coding a game, how could you use inheritance for characters, interfaces for abilities, and polymorphism for attacks?”