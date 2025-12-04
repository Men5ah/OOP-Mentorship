# ✅ **SOLUTIONS**

---

# **1. Even numbers from an array**

```java
int[] getEvens(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int x : arr) {
        if (x % 2 == 0) list.add(x);
    }
    // Convert back to array
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
    return result;
}
```

**Time complexity:**
O(n) — you scan the array once.

---

# **2. Jagged 2D array**

### a)

`grid[2][1] = 7`

Because row 2 is `{6, 7, 8, 9}`.

### b)

It is **jagged** because each row has a different length:

* row 0 → length 3
* row 1 → length 2
* row 2 → length 4

---

# **3. Largest element in a 2D array**

```java
int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] row : arr) {
        for (int val : row) {
            if (val > max) max = val;
        }
    }
    return max;
}
```

---

# **4. Memory allocation difference**

### `int[] a = new int[5];`

Allocates **one array of 5 integers**.

### `int[][] b = new int[5][];`

Allocates:

* an array of 5 references
* **but no rows yet** (they are `null`)
  You must later allocate each row manually:

```java
b[0] = new int[10];
```

---

# **5. Overloading vs Overriding**

### Overloading:

* Same name, different parameter lists
* Happens within the same class

```java
void show(int x) {}
void show(double x) {}
```

### Overriding:

* Same name, same parameters
* Between superclass and subclass

```java
class A { void print() {} }
class B extends A { @Override void print() {} }
```

---

# **6. Output of overloaded method**

```java
t.show(5);
```

Output:
**int**

Reason:
`5` is an integer literal → matches `show(int)` exactly.

---

# **7. Is overriding happening?**

```java
class B extends A {
    void print(int x) { ... }
}
```

No overriding occurs.

`A` has:

```java
void print()
```

`B` has:

```java
void print(int x)
```

Different parameters ⇒ **overloading**, not overriding.

---

# **8. What is dynamic polymorphism?**

Dynamic polymorphism = method call determined at **runtime**, not compile time.

Example:

```java
class A { void talk() { System.out.println("A"); }}
class B extends A { void talk() { System.out.println("B"); }}

A obj = new B();
obj.talk();   // prints "B"
```

---

# **9. Polymorphism example**

### a) Output:

```
Child speaking
```

### b) Why?

Because `p` references a `Child` object.
At runtime, Java checks the **actual object type**, not the reference type.

This is **dynamic binding / runtime polymorphism**.

---

# **10. Can Java extend multiple classes?**

No. Java does **not** support multiple inheritance of classes.

But it solves this with:

### ✔ Multiple **interfaces**

A class can implement many interfaces:

```java
class A implements X, Y, Z { }
```

---

# **11. Interface + implementing class**

```java
interface Drivable {
    void start();
    void stop();
}

class Car implements Drivable {
    public void start() { System.out.println("Car starting"); }
    public void stop()  { System.out.println("Car stopping"); }
}
```

---

# **12. Abstract class vs Interface (2 differences)**

1. **Abstract class** can have instance variables; **interfaces** cannot (only constants).
2. A class can extend **one** abstract class, but can implement **many** interfaces.

---

# **13. Which methods must be implemented?**

```java
interface Shape {
    double area();
}

abstract class Polygon implements Shape {
    abstract int numberOfSides();
}
```

A concrete subclass must implement:

* `double area()` (from Shape)
* `int numberOfSides()` (from Polygon)

Example:

```java
class Triangle extends Polygon {
    double area() { ... }
    int numberOfSides() { return 3; }
}
```

---

# **14. Animal → Dog/Cat with overloaded sound**

```java
abstract class Animal {
    abstract void sound();
    void sound(int volume) {
        System.out.println("Sound at volume " + volume);
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

# **15. Loop through array of animals**

```java
Animal[] animals = { new Dog(), new Cat(), new Dog() };

for (Animal a : animals) {
    a.sound();   // polymorphism in action
}
```

This prints:

```
Bark
Meow
Bark
```

Just tell me!
