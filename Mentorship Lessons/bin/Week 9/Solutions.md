# 🧩 **Instructor Solution Guide: Java Practice Exercises**

## 🟢 **Easy Level**

### **Problem 1 Solutions**

**(a)**
(i) `==` compares **object references**, while `.equals()` compares **values** (content). For Strings, `==` checks if both refer to the same object in memory; `.equals()` checks if they contain the same sequence of characters.
(ii) Local variables must be **explicitly initialized** before use. Instance variables are automatically initialized to default values (e.g., `0`, `false`, `null`).

---

**(b)**
**Error:** The semicolon after the `if` statement ends the condition early.
**Fix:**

```java
if (i % 2 == 0) // Remove the semicolon
    System.out.println(i);
```

---

**(c)**
(i)

```java
public static int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
        sum += i;
    }
    return sum;
}
```

(ii)

```java
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if (num > 0)
    System.out.println("Positive");
else if (num < 0)
    System.out.println("Negative");
else
    System.out.println("Zero");
```

(iii)

```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

---

### **Problem 2 Solutions**

**(a)**
(i) Instance methods operate on **object data**, while static methods belong to the **class** and can be called without an object.
(ii) Constants improve readability and prevent accidental modification.

---

**(b)**
**Errors:**

* `radius` cannot be a String.
* Use `Math.PI` for accuracy.

**Fix:**

```java
double radius = 5.0;
double area = Math.PI * radius * radius;
System.out.println("Area = " + area);
```

---

**(c)**
(i)

```java
public static void printMultiplicationTable(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
}
```

(ii)

```java
public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}
```

(iii)

```java
int max = 0;
for (int i = 0; i < 10; i++) {
    int rand = (int)(Math.random() * 100) + 1;
    if (rand > max) max = rand;
}
System.out.println("Largest: " + max);
```

---

## 🟡 **Medium Level**

### **Problem 3 Solutions**

**(a)**
(i) Java is **pass-by-value**, even for objects (it passes object references by value).
(ii) `this` refers to the **current object instance**.

---

**(b)**
**Error:** The loop runs past the string length (`<=` should be `<`).
**Fix:**

```java
for (int i = 0; i < word.length(); i++) {
```

---

**(c)**
(i)

```java
public static String reverse(String s) {
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--)
        rev += s.charAt(i);
    return rev;
}
```

(ii)

```java
public static double average(int[] arr) {
    int sum = 0;
    for (int val : arr) sum += val;
    return (double) sum / arr.length;
}
```

(iii)

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++)
        System.out.print(i * j + "\t");
    System.out.println();
}
```

---

### **Problem 4 Solutions**

**(a)**
(i) **Method overloading**: multiple methods with the same name but different parameters.
(ii) Constructors initialize new objects; if not defined, Java provides a default no-arg constructor.

---

**(b)**
**Error:** Missing constructor parameters when creating `Student`.
**Fix:**

```java
Student s = new Student("John", 20);
```

---

**(c)**
(i)

```java
class Circle {
    double radius;
    String color;

    public Circle(double r, String c) {
        radius = r; color = c;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

(ii)

```java
@Override
public String toString() {
    return "Circle[radius=" + radius + ", color=" + color + "]";
}
```

(iii)

```java
public static void main(String[] args) {
    Circle c1 = new Circle(3.0, "red");
    Circle c2 = new Circle(5.0, "blue");
    System.out.println(c1);
    System.out.println(c2);
}
```

---

### **Problem 5 Solutions**

**(a)**
(i) Arrays of objects store **references** to multiple object instances.
(ii) Encapsulation hides internal details and protects object state.

---

**(b)**
**Error:** `sum` not initialized.
**Fix:**

```java
int sum = 0;
```

---

**(c)**
(i)

```java
public static double findMin(double[] arr) {
    double min = arr[0];
    for (double v : arr) if (v < min) min = v;
    return min;
}
```

(ii)

```java
Scanner input = new Scanner(System.in);
int[] arr = new int[5];
for (int i = 0; i < 5; i++)
    arr[i] = input.nextInt();

for (int i = arr.length - 1; i >= 0; i--)
    System.out.print(arr[i] + " ");
```

(iii)

```java
double sum = 0;
for (int n : arr) sum += n;
double avg = sum / arr.length;
int count = 0;
for (int n : arr) if (n > avg) count++;
System.out.println(count + " numbers above average.");
```

---

## 🔴 **Hard Level**

### **Problem 6 Solutions**

**(a)**
(i) Inheritance uses “is-a” relationships; composition uses “has-a”.
(ii) Avoid inheritance when classes are not truly related (e.g., forcing a “Car” to extend “Wheel”).

---

**(b)**
**Error:** Missing return type in method declaration.
**Fix:**

```java
public void makeSound() {
    System.out.println("Bark");
}
```

---

**(c)**

```java
class Person {
    String name;
    int age;
    public Person(String n, int a) {
        name = n; age = a;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    public Student(String n, int a, String id) {
        super(n, a);
        studentId = id;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "S001");
        Student s2 = new Student("Bob", 22, "S002");
        s1.displayInfo();
        s2.displayInfo();
    }
}
```

---

### **Problem 7 Solutions**

**(a)**
(i) Overriding occurs when a subclass redefines a superclass method.
(ii) A `final` method cannot be overridden.

---

**(b)**
**Fix:**

```java
class Rectangle extends Shape {
    double width, height;
    public Rectangle(double w, double h) {
        width = w; height = h;
    }
    public double getArea() {
        return width * height;
    }
}
```

---

**(c)**

```java
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;
    public Circle(double r) { radius = r; }
    public double getArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double width, height;
    public Rectangle(double w, double h) { width = w; height = h; }
    public double getArea() { return width * height; }
}

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5)
        };
        for (Shape s : shapes)
            System.out.println(s.getArea());
    }
}
```

---

### **Problem 8 Solutions**

**(a)**
(i) Polymorphism allows one interface to be used for different types of objects.
(ii) Abstract classes enforce design structure without full implementation.

---

**(b)**
**Error:** The superclass constructor isn’t called, so `salary` remains uninitialized.
**Fix:**

```java
class Manager extends Employee {
    double bonus;
    public Manager(double s, double b) {
        super(s);
        bonus = b;
    }
}
```

---

**(c)**

```java
class Employee {
    double salary;
    public Employee(double s) { salary = s; }
}

class Manager extends Employee {
    double bonus;
    public Manager(double s, double b) {
        super(s);
        bonus = b;
    }
    public double getTotalCompensation() {
        return salary + bonus;
    }
}

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager(3000, 5000);
        System.out.println("Total compensation: " + m.getTotalCompensation());
    }
}
```

---

### **Problem 9 Solutions**

**(a)**
(i) Interfaces define contracts (only method signatures), while abstract classes can have implemented methods.
(ii) A class can implement multiple interfaces but only extend one class.

---

**(b)**
**Fix:**

```java
class Bird implements Flyable {
    public void fly() {
        System.out.println("Flying...");
    }
}
```

---

**(c)**

```java
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() { System.out.println("Strumming guitar"); }
}

class Piano implements Playable {
    public void play() { System.out.println("Playing piano"); }
}

public class TestPlayable {
    public static void main(String[] args) {
        Playable[] instruments = { new Guitar(), new Piano() };
        for (Playable p : instruments) p.play();
    }
}
```

---

### **Problem 10 Solutions**

**(a)**
(i) Wrapper classes (like `Integer`, `Double`) allow primitives to be used as objects.
(ii) Autoboxing: automatic conversion from primitive → object; Unboxing: reverse.

---

**(b)**
**Error:** `intValue` is a method, not a field.
**Fix:**

```java
System.out.println(obj.intValue());
```

---

**(c)**
(i)

```java
public static int sumList(ArrayList<Integer> list) {
    int sum = 0;
    for (int n : list) sum += n;
    return sum;
}
```

(ii)

```java
public static ArrayList<Integer> toArrayList(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int n : arr) list.add(n);
    return list;
}
```

(iii)

```java
public static void removeEvens(ArrayList<Integer> list) {
    list.removeIf(n -> n % 2 == 0);
}
```
