Here is your content **cleanly formatted in Markdown**:

---

# **Chapter 7: Single-Dimensional Arrays (Page 249)**

Chapter 7 introduces single-dimensional arrays, which allow a single variable to reference a large collection of data.

---

## **7.2 Array Basics**

### **Need for Arrays**

* Arrays are essential for storing a large number of values, such as reading 100 numbers to compute their average and determining how many numbers are above that average.

### **Array as an Object**

* An array variable that appears to hold an array actually contains a **reference** to that array.
* Arrays are objects stored by the JVM in the **heap** area of memory.

### **Declaration and Creation**

* Array reference variables are declared using syntax like:

  ```java
  elementType[] arrayRefVar;
  ```

  (the preferred style)
* Arrays are created using the **new** operator.

### **Indexing**

* Elements are accessed using **indexes**, which start at **0**.
* Indexes must be `int` values.

### **Array Size and Bounds**

* The size of an array is **fixed once created**.
* Array size can be accessed using:

  ```java
  arrayRefVar.length
  ```
* Accessing an element with an invalid index causes an **ArrayIndexOutOfBoundsException**.
* A frequent beginner mistake: the **off-by-one** error.

### **Array Initializer**

* A shorthand way to declare, create, and initialize an array:

  ```java
  elementType[] arrayRefVar = {value0, value1, ..., valuek};
  ```

### **Common Array Operations**

* Displaying array contents
* Summing all elements
* Finding minimum and maximum
* Random shuffling
* Shifting elements

### **Foreach Loops**

* Java provides a **foreach loop** to traverse arrays sequentially without an index variable.

---

## **7.5 Copying Arrays**

### **Copying References**

* Using a statement like

  ```java
  list2 = list1;
  ```

  copies **the reference**, not the contents.
* Both variables now refer to the **same array**.

### **Garbage Collection**

* The array previously referenced by the destination variable becomes **garbage**, collected automatically by the JVM.

### **Copying Contents**

* To copy array contents, you **must copy each element manually**, or use utility methods.

---

## **7.6 Passing Arrays to Methods**

* When an array is passed to a method, **its reference** is passed (pass-by-sharing).
* The method can modify the original array’s elements.

---

## **7.9 Variable-Length Argument Lists**

* A method can be defined using a **variable-length argument list**, e.g.:

  ```java
  void someMethod(elementType... arrayRefVar)
  ```

---

## **7.10 Searching Arrays**

### **Linear Search**

* Searches the list **sequentially**.

### **Binary Search**

* Requires a **sorted array**.
* Much more efficient: **O(log n)** time.
* Animation examples available on the Companion Website.

---

## **7.11 Sorting Arrays**

### **Selection Sort**

* Repeatedly finds the smallest number in the unsorted portion of the list.
* Swaps it with the first element of that portion.
* Worst-case complexity: **O(n²)**.
* Visual animations available on the Companion Website.

---

## **7.12 The Arrays Class**

* `java.util.Arrays` provides useful static methods for:

  * Sorting
  * Searching
  * Comparing arrays
  * Filling arrays
  * Converting arrays to strings

---

## **7.13 Command-Line Arguments**

* Arguments passed to the `main` method appear in:

  ```java
  public static void main(String[] args)
  ```
* `args` is an array of strings representing the command-line input.
