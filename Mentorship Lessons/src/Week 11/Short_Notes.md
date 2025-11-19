Here are **short, exam-friendly notes** with **clear code snippets** for each concept so you can understand and revise quickly.

---

# ⭐ **Short Notes + Code Snippets**

---

## **1. Abstract Classes vs Interfaces**

### 🔹 When to use Abstract Classes

Use an **abstract class** when you have a **strong is-a relationship** and want to share:

* Common fields
* Constructors
* Partially implemented methods

➡️ Good for related classes in the same family.

### 🔹 When to use Interfaces

Use an **interface** when unrelated classes should share **behavior**, not structure.
This is a **weak is-a relationship** (is-capable-of, is-behaviour-of).

### ⭐ Example

```java
abstract class Animal {          // Strong is-a
    abstract void makeSound();
}

interface Runnable {             // Weak is-a (ability)
    void run();
}

class Dog extends Animal implements Runnable {
    @Override
    void makeSound() { System.out.println("Bark"); }

    @Override
    public void run() { System.out.println("Dog runs"); }
}
```

---

## **2. Method Matching vs Dynamic Binding**

When you call a method through a reference variable:

### 🔹 1. Method Matching — *Compile time*

Compiler checks the **declared type** of the reference variable.

### 🔹 2. Dynamic Binding — *Runtime*

JVM chooses the **actual object's** method implementation.

### ⭐ Example

```java
Animal a = new Dog();   // declared type = Animal, actual type = Dog

a.makeSound();          // compile-time: Animal has makeSound()
                        // runtime: Dog's makeSound() runs
```

---

## **3. Why `Object o = new Student()` Works, but Method Calls Don’t**

### 🔹 Upcasting (implicit casting)

Legal because every subclass *is* an Object.

```java
Object o = new Circle();
```

But Object **does not know** about methods in Circle.

```java
o.getDiameter();   // ❌ compile error
```

Solution: downcast (explicit) + usually `instanceof`.

### ⭐ Example

```java
Object o = new Circle();

if (o instanceof Circle c) {
    System.out.println(c.getDiameter());
}
```

---

## **4. `equals` vs `==`**

### 🔹 If you do NOT override `equals`

It behaves **exactly like `==`**
➡️ Checks whether both references point to the **same object in memory**.

### ⭐ Example

```java
class Car {
    String model;
    Car(String m) { model = m; }
}

Car c1 = new Car("BMW");
Car c2 = new Car("BMW");

System.out.println(c1.equals(c2));  // false (references differ)
```

### 🔹 When overridden properly

Compares **content**, not memory location.

```java
@Override
public boolean equals(Object obj) {
    if (!(obj instanceof Car c)) return false;
    return this.model.equals(c.model);
}
```

---

## **5. Interface Constants**

Variables declared inside an interface are **implicitly**:

```
public static final
```

This means:

* They are constants
* Shared by ALL objects
* Cannot be changed

### ⭐ Example

```java
interface MathConstants {
    double PI = 3.14;          // public static final double PI = 3.14;
}

class Circle {
    double area(double r) {
        return MathConstants.PI * r * r;
    }
}
```

You cannot modify it:

```java
MathConstants.PI = 3.5; // ❌ error (final constant)
```
