# Trace Tables

Trace Tables are helpful when you want to figure out the flow of your code. In CS industry and practice, you alomost always never pick up your laptop and open your IDE when presented with a problem.

Your first step is usually to pick up a pen and paper and break down the problem, write some pseudocode for the solution then trace it to find out if it works. From there, you can start implementing the code into your development environment.

Learning this skill will be helpful, not just as students but in the industry as well, especially in technical interviews so it is important that you learn it.

Here are some examples of trace tables to help you out.

## **1. If–Else: Number Sign Check**

```java
int n = -3;

if (n > 0)
    System.out.println("Positive");
else if (n < 0)
    System.out.println("Negative");
else
    System.out.println("Zero");
```

### Dry Run

| Step | n  | Condition Checked | Output     |
| ---- | -- | ----------------- | ---------- |
| 1    | -3 | `n > 0` → false   | —          |
| 2    | -3 | `n < 0` → true    | "Negative" |

What is the final output?

---

## 🔁 **2. For Loop: Sum of First 5 Numbers**

```java
int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum += i;
}
System.out.println(sum);
```

### Dry Run

| Iteration | i | sum (before) | sum (after) |
| --------- | - | ------------ | ----------- |
| 1         | 1 | 0            | 1           |
| 2         | 2 | 1            | 3           |
| 3         | 3 | 3            | 6           |
| 4         | 4 | 6            | 10          |
| 5         | 5 | 10           | 15          |

What is the final output?

---

## 🔄 **3. While Loop: Counting Down**

```java
int n = 3;
while (n > 0) {
    System.out.println(n);
    n--;
}
System.out.println("Blast off!");
```

### Dry Run

| Iteration | n (before) | Output | n (after) |
| --------- | ---------- | ------ | --------- |
| 1         | 3          | 3      | 2         |
| 2         | 2          | 2      | 1         |
| 3         | 1          | 1      | 0         |

What is the final output?

---

## ➿ **4. Nested Loops: Pattern**

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Dry Run

| Outer Loop (i) | Inner Loop (j iterations) | Printed Line |
| -------------- | ------------------------- | ------------ |
| 1              | 1                         | `*`          |
| 2              | 1,2                       | `**`         |
| 3              | 1,2,3                     | `***`        |

✅ **Output:**

```
*
**
***
```

💡 **Concept:** Nested loops for pattern building.

---

## 🧮 **5. Array Traversal: Find Maximum**

```java
int[] arr = {3, 7, 2, 9, 5};
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max)
        max = arr[i];
}
System.out.println(max);
```

### Dry Run

| i | arr[i] | max (before) | Condition     | max (after) |
| - | ------ | ------------ | ------------- | ----------- |
| 1 | 7      | 3            | 7 > 3 → true  | 7           |
| 2 | 2      | 7            | 2 > 7 → false | 7           |
| 3 | 9      | 7            | 9 > 7 → true  | 9           |
| 4 | 5      | 9            | 5 > 9 → false | 9           |

✅ **Final Output:** `9`
💡 **Concept:** Linear search for max value.

---

## 🔢 **6. Function Call Trace: Sum Method**

```java
int result = add(3, 4);
System.out.println(result);

public static int add(int a, int b) {
    int c = a + b;
    return c;
}
```

### Dry Run

| Step | Variable  | Value |
| ---- | --------- | ----- |
| 1    | a         | 3     |
| 2    | b         | 4     |
| 3    | c = a + b | 7     |
| 4    | return c  | 7     |

✅ **Output:** `7`
💡 **Concept:** Method call and return flow.

---

## 🧠 **7. Logic Exercise: Palindrome Check**

```java
int n = 121;
int original = n;
int rev = 0;

while (n > 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n = n / 10;
}

if (rev == original)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
```

### Dry Run

| Step | n   | digit | rev (after) | n (after) |
| ---- | --- | ----- | ----------- | --------- |
| 1    | 121 | 1     | 1           | 12        |
| 2    | 12  | 2     | 12          | 1         |
| 3    | 1   | 1     | 121         | 0         |

✅ **Final Output:** `Palindrome`
💡 **Concept:** Reverse integer logic + conditional check.

---

## ✅ **How to Use These for Study**

In your group:

1. **Hide the final output** and try to predict it first.
2. Create a **table of variables** — track how they change each iteration.
3. Use a whiteboard or shared doc to walk through the flow.
4. Discuss how you could simplify or rewrite the same logic.
