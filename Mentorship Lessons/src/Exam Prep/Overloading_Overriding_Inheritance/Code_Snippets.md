# ✅ **1. Method Overloading — Same Name, Different Parameters**

```java
public class MathUtil {

    // Overload 1: two ints
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Overload 2: two doubles
    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // Overload 3: three ints
    public int max(int a, int b, int c) {
        return max(max(a, b), c); // reuse method
    }
}

class TestOverload {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();

        System.out.println(m.max(3, 4));       // calls int,int
        System.out.println(m.max(2.5, 7.9));   // calls double,double
        System.out.println(m.max(2, 5, 1));    // calls int,int,int
    }
}
```

---

# ✅ **2. Ambiguous Overload Example (Compile Error)**

```java
public class AmbiguousExample {
    public void print(int a, double b) {}
    public void print(double a, int b) {}

    public static void main(String[] args) {
        AmbiguousExample ex = new AmbiguousExample();
        // ex.print(5, 5); // ERROR: ambiguous method call
    }
}
```

---

# ✅ **3. Method Overriding — Same Signature in Subclass**

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class TestOverride {
    public static void main(String[] args) {
        Animal a = new Dog(); // polymorphism
        a.sound();            // dynamic binding → Dog's sound()
    }
}
```

---

# ✅ **4. Overriding + Return Type Covariance**

```java
class Plant {
    public Plant grow() {
        System.out.println("Plant growing");
        return this;
    }
}

class Flower extends Plant {
    @Override
    public Flower grow() { // subtype return allowed
        System.out.println("Flower growing beautifully");
        return this;
    }
}
```

---

# ✅ **5. Using `super` to Refer to Superclass Method**

```java
class Person {
    public String info() {
        return "Person info";
    }
}

class Student extends Person {
    @Override
    public String info() {
        return super.info() + " → Student info"; // calls superclass version
    }
}
```

---

# ✅ **6. Constructor Chaining (`super()`)**

```java
class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle constructor");
    }

    public Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {

    public Car() {
        super("Car"); // must be first statement
        System.out.println("Car constructor");
    }
}

class Test {
    public static void main(String[] args) {
        new Car();
    }
}
```

---

# ✅ **7. Inheritance: Private Fields + Getters/Setters**

```java
class Account {
    private double balance; // not directly accessible

    public Account(double balance) {
        this.balance = balance;
    }

    protected double getBalance() { // accessible to subclasses
        return balance;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void printBalance() {
        System.out.println("Balance: " + getBalance());
    }
}
```

---

# ✅ **8. Access Control (public, protected, private)**

```java
class A {
    private int x = 10;      // subclass cannot access
    protected int y = 20;    // subclass can access
    public int z = 30;       // everyone can access
}

class B extends A {
    public void show() {
        // System.out.println(x); // ERROR: private
        System.out.println(y);     // OK (protected)
        System.out.println(z);     // OK (public)
    }
}
```

---

# ✅ **9. Final Class & Final Method**

```java
final class FinalClass {
    // cannot be extended
}

class Vehicle {
    public final void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    // ERROR: cannot override a final method
    // public void startEngine() {}
}
```

---

# ✅ **10. Static Method Hiding (Not Overriding)**

```java
class Parent {
    public static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public static void greet() { // method hiding
        System.out.println("Hello from Child");
    }
}

class TestStatic {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet(); // calls Parent.greet() → static binding
    }
}
```
