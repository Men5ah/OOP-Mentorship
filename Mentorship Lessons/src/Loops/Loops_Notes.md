In Java programming, **loops** are powerful constructs that control the repeated execution of a block of statements. The concept of looping is fundamental, forming part of the essential foundation for both object-oriented and advanced programming.

The following notes, based on the provided text, detail the types of loops, design strategies, and common pitfalls.

### 1. Types of Java Loops
Java provides three primary repetition statements: the **while** loop, the **do-while** loop, and the **for** loop.

*   **The `while` Loop (Pretest Loop):**
    *   **Syntax:** `while (loop-continuation-condition) { // Loop body }`.
    *   **Mechanism:** It checks the boolean condition *before* executing the loop body. If the condition is true, the body executes; if false, the loop terminates.
    *   **Iteration:** A single execution of a loop body is called an **iteration**.
*   **The `do-while` Loop (Posttest Loop):**
    *   **Syntax:** `do { // Loop body } while (loop-continuation-condition);`.
    *   **Mechanism:** It executes the loop body *first* and then checks the continuation condition. This ensures the loop body executes **at least once**.
*   **The `for` Loop (Pretest Loop):**
    *   **Syntax:** `for (initial-action; loop-continuation-condition; action-after-each-iteration) { // Body }`.
    *   **Components:** 
        1.  **Initial-action:** Usually initializes a control variable.
        2.  **Loop-continuation-condition:** Evaluated before each iteration to determine if the body should execute.
        3.  **Action-after-each-iteration:** Executed after the loop body, often used to adjust the control variable.
*   **The Foreach Loop:**
    *   This is a convenient variant of the `for` loop used to traverse arrays or collections sequentially without an explicit index variable.
    *   **Syntax:** `for (elementType element: arrayRefVar) { // Process element }`.

### 2. Loop Control Strategies
*   **Counter-Controlled Loops:** Used when you know exactly how many times the loop needs to be executed.
*   **Sentinel-Controlled Loops:** Used when the number of repetitions is not fixed. A **sentinel value** is a special input value (like 0) that signifies the end of the input and terminates the loop.
*   **User Confirmation:** A template where the loop continues as long as the user enters a specific character (e.g., 'Y' for yes).

### 3. Additional Control Keywords
Java provides two keywords for more granular control within a loop body:
*   **`break`:** Immediately terminates the innermost loop containing the statement.
*   **`continue`:** Ends only the **current iteration** and transfers program control to the end of the loop body (the loop-continuation-condition is then re-evaluated).

### 4. Common Errors and Pitfalls
*   **Infinite Loops:** Occur when the continuation condition never becomes false. If a program runs for an unusually long time, it may be stuck in an infinite loop (which can be stopped with `CTRL+C` in a command window).
*   **Off-by-One Error:** A common mistake where the loop executes one more or one less time than intended, often due to using `<=` when `<` was needed.
*   **Floating-Point Inaccuracy:** You should **not** use floating-point values for equality checking in loop control. Because they are approximations, they may never exactly reach a target value, potentially causing an infinite loop.
*   **Wrong Semicolon:** Adding a semicolon at the end of a `for` or `while` header before the body creates an empty loop body, which is a common logic error.

### 5. Choosing Which Loop to Use
While all three loop forms are "expressively equivalent" (they can be converted into one another), each has a logical preference:
*   **`for` loop:** Best when the number of repetitions is known in advance.
*   **`while` loop:** Best when the number of repetitions is not fixed.
*   **`do-while` loop:** Use when the statements inside the loop must execute **at least once**.

Here are code examples for your exam prep guide formatted in markdown, drawing from the provided sources.

### 1. Loops (while, do-while, and for)
A **loop** is a construct that controls how many times an operation is executed. The **while loop** is a pretest loop that evaluates the condition before the body executes. The **do-while loop** is a posttest loop that ensures the body executes at least once. The **for loop** provides a concise syntax for counter-controlled repetitions.

```java
// while loop: Displays a message 100 times
int count = 0;
while (count < 100) {
    System.out.println("Welcome to Java!");
    count++;
}

// do-while loop: Executes at least once
int i = 0;
do {
    System.out.println("i is " + i);
    i++;
} while (i < 10);

// for loop: Counter-controlled
for (int j = 0; j < 100; j++) {
    System.out.println("Welcome");
}
```

