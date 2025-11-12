# **Java Practice Exercises**

---

## 🟢 **Easy Level**

### **Problem 1 [50 points]**

**(a) [12 points] Explaining Concepts**
(i) Explain the difference between the `==` operator and the `.equals()` method when comparing Strings in Java.
(ii) Describe what happens when a variable is declared but not initialized in Java. Does this behavior differ for local and instance variables?

**(b) [14 points] Understanding Written Code**
The following code is intended to print all even numbers between 1 and 10, but it contains a logical error. Identify the error and explain how to fix it.

```java
public class EvenPrinter {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0);
                System.out.println(i);
            i++;
        }
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a static method `sumRange(int start, int end)` that returns the sum of all integers from `start` to `end` (inclusive).
(ii) [8 points] Write a program that reads a number from the user and prints whether it is **positive**, **negative**, or **zero**.
(iii) [8 points] Write a method `isPrime(int n)` that returns `true` if `n` is a prime number, otherwise returns `false`.

---

### **Problem 2 [50 points]**

**(a) [10 points] Explaining Concepts**
(i) What is the difference between **instance methods** and **static methods** in Java?
(ii) Give one advantage of using constants (`final` variables) in your code.

**(b) [16 points] Error Detection**
The following class is supposed to compute the area of a circle but contains compile-time and logical errors. Identify and fix them.

```java
public class CircleArea {
    public static void main(String[] args) {
        double radius = "5.0";
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a method `printMultiplicationTable(int n)` that prints the multiplication table for `n` (from 1 to 10).
(ii) [8 points] Write a method that takes a character and returns `true` if it is a vowel, otherwise `false`.
(iii) [8 points] Write a program that generates 10 random integers between 1 and 100 and prints the **largest** one.

---

## 🟡 **Medium Level**

### **Problem 3 [50 points]**

**(a) [12 points] Concepts**
(i) Explain the difference between **passing by value** and **passing by reference**. How does Java handle argument passing?
(ii) Briefly describe what the `this` keyword does in Java.

**(b) [14 points] Debugging**
The following program is intended to count how many times a character appears in a string, but it has an error. Identify and fix it.

```java
public class CountChars {
    public static void main(String[] args) {
        String word = "banana";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i <= word.length(); i++) {
            if (word.charAt(i) == ch)
                count++;
        }
        System.out.println(count);
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a method `reverse(String s)` that returns the reversed form of the input string.
(ii) [8 points] Write a program that takes an integer array and returns the **average** value of its elements.
(iii) [8 points] Write a method that accepts an integer `n` and prints an `n × n` multiplication grid.

---

### **Problem 4 [50 points]**

**(a) [10 points] Concepts**
(i) What is **method overloading**? Give one example.
(ii) What is the purpose of a **constructor**? What happens if you do not define one in your class?

**(b) [16 points] Debugging**
The code below attempts to create and print details of a `Student` object, but contains errors. Identify and fix them.

```java
public class Student {
    String name;
    int age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name + ", Age: " + s.age);
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a `Circle` class with fields `radius` and `color`, a constructor to initialize them, and a method `getArea()` that returns the area.
(ii) [8 points] Add a `toString()` method that returns a readable description of the circle.
(iii) [8 points] Create a `main()` method that tests your `Circle` class by creating and printing two objects.

---

### **Problem 5 [50 points]**

**(a) [10 points] Concepts**
(i) Explain the concept of **arrays of objects**.
(ii) Why is **encapsulation** considered good practice in object-oriented design?

**(b) [14 points] Debugging**
The code below should calculate the sum of numbers in an array, but it has an error. Identify and fix it.

```java
public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a method `findMin(double[] arr)` that returns the smallest value in a given array.
(ii) [8 points] Write a program that asks the user for 5 integers and stores them in an array, then prints them in reverse order.
(iii) [8 points] Write a program that counts how many numbers in an array are greater than the average.

---

## 🔴 **Hard Level**

### **Problem 6 [50 points]**

**(a) [10 points] Concepts**
(i) Explain the difference between **inheritance** and **composition** in object-oriented design.
(ii) Give one example where **inheritance** is *not* the best design choice.

**(b) [14 points] Debugging**
The following code intends to demonstrate inheritance but fails to compile correctly. Identify and fix the issues.

```java
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    public makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a superclass `Person` with attributes `name` and `age`, and a method `displayInfo()`.
(ii) [8 points] Create a subclass `Student` that extends `Person` and adds a field `studentId`. Override the `displayInfo()` method to include it.
(iii) [8 points] Write a `main()` method to create and display information for two students.

---

### **Problem 7 [50 points]**

**(a) [12 points] Concepts**
(i) Explain **method overriding** with an example.
(ii) What happens when you mark a method as `final`? Can it still be overridden?

**(b) [14 points] Error Correction**
Find and correct the errors in the following code:

```java
abstract class Shape {
    abstract double getArea();
}

public class Rectangle extends Shape {
    double width, height;
    public Rectangle(double w, double h) {
        width = w; height = h;
    }
    public double getArea {
        return width * height;
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Create an abstract class `Shape` with an abstract method `getArea()`.
(ii) [8 points] Create subclasses `Circle` and `Rectangle` that implement `getArea()`.
(iii) [8 points] In the `main()` method, create an array of `Shape` objects and display their areas using polymorphism.

---

### **Problem 8 [50 points]**

**(a) [10 points] Concepts**
(i) What is **polymorphism** and how does it work in Java?
(ii) Why might you declare a method or class as `abstract`?

**(b) [14 points] Debugging**
Identify and fix the logical error in this inheritance-based code:

```java
class Employee {
    double salary;
    public Employee(double s) { salary = s; }
}

class Manager extends Employee {
    double bonus;
    public Manager(double b) { bonus = b; }
}

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager(5000);
        System.out.println("Total compensation: " + (m.salary + m.bonus));
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Add a proper constructor to initialize both `salary` and `bonus` for `Manager`.
(ii) [8 points] Write a method `getTotalCompensation()` in `Manager` that returns the sum of both.
(iii) [8 points] Modify `Test` to demonstrate the correct behavior.

---

### **Problem 9 [50 points]**

**(a) [10 points] Concepts**
(i) Explain **interfaces** in Java and how they differ from abstract classes.
(ii) Can a class implement multiple interfaces? Can it extend multiple classes? Explain.

**(b) [14 points] Error Identification**
Find and correct the errors:

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly {
        System.out.println("Flying...");
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Define an interface `Playable` with a method `play()`.
(ii) [8 points] Create two classes, `Guitar` and `Piano`, that implement `Playable`.
(iii) [8 points] Write a program that creates an array of `Playable` objects and calls `play()` on each one.

---

### **Problem 10 [50 points]**

**(a) [12 points] Concepts**
(i) What are **wrapper classes** in Java, and why do we need them?
(ii) Explain **autoboxing** and **unboxing** with examples.

**(b) [14 points] Debugging**
Identify and fix the compile-time errors:

```java
public class WrapperTest {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;
        System.out.println(obj.intValue);
    }
}
```

**(c) [24 points] Writing Code**
(i) [8 points] Write a method that takes an `ArrayList<Integer>` and returns the **sum** of its elements.
(ii) [8 points] Write a method that converts an array of primitive `int` values into an `ArrayList<Integer>`.
(iii) [8 points] Write a method that removes all even numbers from an `ArrayList<Integer>`.