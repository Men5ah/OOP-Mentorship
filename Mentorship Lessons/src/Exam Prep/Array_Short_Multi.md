# **Chapter 8: Multidimensional Arrays (Page 289)**

Chapter 8 discusses multidimensional arrays, which are used to represent data in tables, matrices, grids, and higher-dimensional structures.

---

## **8.2 Two-Dimensional Array Basics**

### **Definition**

* A two-dimensional array is an array whose elements are **themselves arrays**, also called a **nested array**.

### **Accessing Elements**

* Elements are accessed using **two indexes**:
  `array[row][column]`.

### **Structure**

* A 2D array `x` is actually a **1D array of references**, where each `x[i]` refers to a row array.

### **Dimensions**

* `x.length` → number of rows
* `x[i].length` → number of columns in row *i*

### **Ragged Arrays**

* Rows can have **different lengths**, making the array ragged.

### **Initialization**

* Can be done using an initializer:

  ```java
  int[][] matrix = {
      {1, 2, 3},
      {4, 5},
      {6, 7, 8, 9}
  };
  ```

---

## **8.3 Processing Two-Dimensional Arrays**

### **Control Structure**

* Processing typically uses **nested for-loops**.

### **Common Operations**

* Initializing values
* Printing rows/columns
* Summing all elements
* Finding the row or column with the **largest sum**
* **Random shuffling** of rows or elements

---

## **8.4 Passing Two-Dimensional Arrays to Methods**

* Passing a 2D array to a method passes **the reference**, just like with 1D arrays.
* Methods can modify the original 2D array.

---

## **8.5 Case Study: Grading a Multiple-Choice Test**

* A 2D array stores **student answers**; each row represents a student.
* A 1D array stores the **answer key**.
* Comparing corresponding positions determines each student’s score.

---

## **8.6 Case Study: Finding the Closest Pair**

* Represents points as a 2D array (e.g., `points[i][0]` is *x* and `points[i][1]` is *y*).
* A brute-force algorithm compares **every pair** to find the smallest distance.

---

## **8.7 Case Study: Sudoku**

* Sudoku grids are naturally represented using a **9×9** two-dimensional array.
* Useful for checking validity of rows, columns, and 3×3 subgrids.

---

## **8.8 Multidimensional Arrays**

### **Generalization**

* Can extend arrays to **three or more dimensions**.
* A 3D array is an array of 2D arrays.

### **Declaration**

```java
int[][][] threeD = new int[3][4][5];
```
