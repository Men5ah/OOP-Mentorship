Below are the **5 problem questions WITH starter code AND full solutions**.
Each question includes:

✅ The problem
✅ Starter code (students complete the TODOs)
✅ Full working solution

---

# -----------------------------------------

# ✅ **Problem 1 — Basic Try-Catch (2 marks)**

# -----------------------------------------

## **Problem**

Write a program that divides two integers.
If the user tries to divide by zero, catch the `ArithmeticException` and print:

```
Error: Cannot divide by zero.
```

---

## **Starter Code**

```java
public class Problem1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        // TODO: Perform num1 / num2 inside a try-catch block
        // TODO: Catch ArithmeticException and print the message:
        //       "Error: Cannot divide by zero."

    }
}
```

---

## **Solution**

```java
public class Problem1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
```

---

# ----------------------------------------------------

# ✅ **Problem 2 — Multi-Catch Block (3 marks)**

# ----------------------------------------------------

## **Problem**

Fix the code so that both `NullPointerException` and `ArrayIndexOutOfBoundsException` are caught by **one** multi-catch block.

Print:

```
Invalid array operation!
```

---

## **Starter Code**

```java
public class Problem2 {
    public static void main(String[] args) {

        String[] words = {"Java", "Python"};

        // TODO: Fix the program using one multi-catch block
        //       The following line throws an exception:
        System.out.println(words[3].toUpperCase());

    }
}
```

---

## **Solution**

```java
public class Problem2 {
    public static void main(String[] args) {

        String[] words = {"Java", "Python"};

        try {
            System.out.println(words[3].toUpperCase());
        } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid array operation!");
        }
    }
}
```

---

# ---------------------------------------------------------

# ✅ **Problem 3 — Throwing and Declaring Exceptions (4 marks)**

# ---------------------------------------------------------

## **Problem**

Create a method:

```java
public static int readPositive(int number) throws IllegalArgumentException
```

The method must:

* Throw an exception if number ≤ 0
* Return the number otherwise

---

## **Starter Code**

```java
public class Problem3 {

    // TODO: Complete this method
    public static int readPositive(int number) throws IllegalArgumentException {
        return 0; // temporary
    }

    public static void main(String[] args) {

        int n = -5;

        // TODO: Call readPositive inside a try-catch block
        //       Print the exception message if thrown
    }
}
```

---

## **Solution**

```java
public class Problem3 {

    public static int readPositive(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        return number;
    }

    public static void main(String[] args) {

        int n = -5;

        try {
            System.out.println("Valid number: " + readPositive(n));
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
```

---

# -----------------------------------------------------

# ✅ **Problem 4 — Exception Propagation (5 marks)**

# -----------------------------------------------------

## **Problem**

Cause an exception in `methodC()`, let it propagate up the call stack, and catch it *only* in `main()`.

**Output:**

```
Exception caught in main: / by zero
```

---

## **Starter Code**

```java
public class Problem4 {

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        // TODO: Throw an ArithmeticException here
    }

    public static void main(String[] args) {
        // TODO: Call methodA inside a try-catch
        //       Print: "Exception caught in main: <message>"
    }
}
```

---

## **Solution**

```java
public class Problem4 {

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int x = 10 / 0;   // ArithmeticException
    }

    public static void main(String[] args) {

        try {
            methodA();
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        }
    }
}
```

---

# ------------------------------------------------------------

# ✅ **Problem 5 — Custom Exception + Finally Block (8 marks)**

# ------------------------------------------------------------

## **Problem**

Create a custom exception named `PasswordTooShortException`.
Throw it if password length < 8.
Use try-catch-finally.

---

## **Starter Code**

```java
// TODO: Define the custom exception here


public class Problem5 {

    // TODO: Complete this method
    public static void validatePassword(String pass) throws PasswordTooShortException {

    }

    public static void main(String[] args) {

        String password = "abc";  // test value

        // TODO: Use try-catch-finally to validate the password
        //       Print the appropriate messages
    }
}
```

---

## **Solution**

```java
// Custom exception class
class PasswordTooShortException extends Exception {
    public PasswordTooShortException(String message) {
        super(message);
    }
}

public class Problem5 {

    public static void validatePassword(String pass) throws PasswordTooShortException {
        if (pass.length() < 8) {
            throw new PasswordTooShortException("Password must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {

        String password = "abc";

        try {
            validatePassword(password);
            System.out.println("Password accepted!");
        } catch (PasswordTooShortException ex) {
            System.out.println("Invalid password: " + ex.getMessage());
        } finally {
            System.out.println("Validation attempt finished.");
        }
    }
}
```
