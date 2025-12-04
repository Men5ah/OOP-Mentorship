Here you go — **a clean, exam-ready mixed set of Java OOP + Arrays questions**, covering exactly the topics you listed.
I’ve included **15 questions**: some theory, some code-based, and some short-answer.

If you want, I can turn these into **multiple-choice**, **long-form exam questions**, or **full solutions**.

---

# ✅ **Mixed Java Questions (Arrays, 2D Arrays, Overloading, Overriding, Inheritance, Interfaces, Abstract Classes, Polymorphism)**

---

## **Arrays & 2D Arrays**

### **1.**

Write a Java method that takes an `int[]` and returns a *new* array containing only the even numbers.
What is the time complexity?

---

### **2.**

Given the following 2D array:

```java
int[][] grid = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

a) What is the value of `grid[2][1]`?
b) Why is this 2D array considered a *jagged array*?

---

### **3.**

Write code to find the **largest element in a 2D array** of integers.

---

### **4.**

What is the difference between:

```java
int[] a = new int[5];
int[][] b = new int[5][];
```

Explain what memory is allocated in each case.

---

---

## **Overloading vs Overriding**

### **5.**

Explain **method overloading** and **method overriding** in Java.
Give an example of each (short code snippets).

---

### **6.**

Consider the following code:

```java
class Test {
    void show(int a) { System.out.println("int"); }
    void show(double a) { System.out.println("double"); }
}

Test t = new Test();
t.show(5);
```

What is the output and why?

---

### **7.**

Given:

```java
class A {
    void print() { System.out.println("A"); }
}

class B extends A {
    void print(int x) { System.out.println("B: " + x); }
}
```

Is method overriding happening?
Explain your reasoning.

---

---

## **Inheritance & Polymorphism**

### **8.**

What is dynamic polymorphism? Explain using a short code example involving a superclass and subclass.

---

### **9.**

Given:

```java
class Parent {
    void speak() { System.out.println("Parent speaking"); }
}

class Child extends Parent {
    @Override
    void speak() { System.out.println("Child speaking"); }
}

Parent p = new Child();
p.speak();
```

a) What is printed?
b) Explain why this is dynamic binding.

---

### **10.**

In Java, can a subclass extend more than one parent class?
Explain how Java solves this limitation.

---

---

## **Interfaces & Abstract Classes**

### **11.**

Write a simple Java interface named `Drivable` with two methods: `start()` and `stop()`.
Then write a class `Car` that implements this interface.

---

### **12.**

What is the key difference between **abstract classes** and **interfaces** in Java?
Give two differences.

---

### **13.**

Given:

```java
interface Shape {
    double area();
}

abstract class Polygon implements Shape {
    abstract int numberOfSides();
}
```

Explain which methods must be implemented by a concrete subclass of `Polygon`.

---

---

## **Mixed Application (Higher Difficulty)**

### **14.**

Design a class hierarchy for the following:

* An abstract class `Animal`
* All animals must implement a method `sound()`
* Create two subclasses: `Dog` and `Cat`
* Add an overloaded version of `sound()` that takes a volume parameter (int)

Write brief code snippets to show this structure.

---

### **15.**

**Combine arrays + polymorphism + overriding:**

You have an array:

```java
Animal[] animals = { new Dog(), new Cat(), new Dog() };
```

Write a loop that makes each animal in the array produce its sound.
