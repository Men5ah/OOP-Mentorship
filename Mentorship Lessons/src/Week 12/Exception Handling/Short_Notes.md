# ✅ **Short Notes on Exception Handling (Java)**

## **1. What Are Exceptions?**

* Exceptions are **runtime errors** represented as objects.
* If not handled → **program crashes**.
* Examples:
  `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `NullPointerException`.

---

## **2. Exception Types**

### **a. Error (unchecked)**

* Thrown by JVM (system-level).
  E.g., `OutOfMemoryError`

### **b. Exception (checked)**

* External problems, must be handled.
  E.g., `IOException`, `SQLException`

### **c. RuntimeException (unchecked)**

* Programmer mistakes.
  E.g., `ArithmeticException`, `IllegalArgumentException`

### **Checked vs Unchecked**

* **Checked** → must handle or declare (`throws`)
* **Unchecked** → optional to handle

---

## **3. Declaring, Throwing, Catching**

### **Declaring**

```java
public void read() throws IOException { }
```

### **Throwing**

```java
throw new IllegalArgumentException("Invalid number");
```

### **Catching**

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException ex) {
    System.out.println("Cannot divide by zero");
}
```

---

## **4. Multi-Catch (Java 7+)**

```java
try {
    int[] arr = new int[3];
    System.out.println(arr[5]);
} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
    System.out.println("Error: " + ex.getMessage());
}
```

---

## **5. Exception Propagation**

If a method doesn’t handle the exception, it moves **up the call stack**.

```java
public void a() { b(); }
public void b() { c(); }
public void c() { int x = 5 / 0; } // exception propagates
```

---

## **6. Getting Exception Info**

```java
catch (Exception ex) {
    System.out.println(ex.getMessage());
    ex.printStackTrace();
}
```

---

## **7. finally Block**

* Runs **always** (exception or not)
* Great for cleanup

```java
try {
    System.out.println("Opening file...");
} catch (Exception ex) {
    System.out.println("Error!");
} finally {
    System.out.println("Closing file...");
}
```

---

## **8. Try-With-Resources (Auto-close)**

Resources must implement `AutoCloseable`.

```java
try (Scanner input = new Scanner(new File("data.txt"))) {
    System.out.println(input.nextLine());
} catch (IOException ex) {
    System.out.println(ex.getMessage());
}
```

---

## **9. Custom Exception**

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public void setAge(int age) throws InvalidAgeException {
    if (age < 0) throw new InvalidAgeException("Age cannot be negative");
}
```

---

## **10. Rethrowing Exceptions**

```java
try {
    risky();
} catch (IOException ex) {
    System.out.println("Logging error...");
    throw ex; // rethrow
}
```

---

## **11. Chained Exceptions**

Attach cause of error:

```java
catch (IOException ex) {
    throw new RuntimeException("Failed to load file", ex);
}
```

---

# ✅ **Summary Table**

| Concept            | One-Line Meaning            | Example                        |        |
| ------------------ | --------------------------- | ------------------------------ | ------ |
| Exception          | Runtime error object        | `new Exception()`              |        |
| Checked            | Must handle                 | `IOException`                  |        |
| Unchecked          | Optional to handle          | `RuntimeException`             |        |
| throw              | Manually create exception   | `throw new Exception()`        |        |
| throws             | Declare possible exceptions | `void f() throws IOException`  |        |
| try-catch          | Handle errors               | `try{} catch(){}`              |        |
| finally            | Always runs                 | cleanup                        |        |
| Multi-catch        | Handle many exceptions      | `catch (A                      | B ex)` |
| Custom exception   | User-defined                | `class MyEx extends Exception` |        |
| Try-with-resources | Auto-close                  | `try (FileReader fr...)`       |        |

