# **📌 1. Declaring and Creating Arrays**

### **Note**

* Arrays store multiple values of the same type.
* They must be created using `new`.

### **Code**

```java
int[] numbers = new int[5];   // array of 5 integers
numbers[0] = 10;              // assign first element
```

---

# **📌 2. Array Initializer**

### **Note**

* A quick way to create and initialize an array in one statement.

### **Code**

```java
int[] scores = {90, 80, 70, 85, 100};
```

---

# **📌 3. Accessing Elements (Indexing)**

### **Note**

* Index starts at **0**.
* Accessing invalid index → `ArrayIndexOutOfBoundsException`.

### **Code**

```java
System.out.println(scores[0]);   // prints 90
System.out.println(scores[4]);   // prints 100
```

---

# **📌 4. Looping Through an Array**

### **Using for-loop**

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

### **Using foreach-loop**

```java
for (int value : scores) {
    System.out.println(value);
}
```

---

# **📌 5. Summing Elements**

### **Note**

* A common operation on arrays.

### **Code**

```java
int sum = 0;
for (int n : scores) {
    sum += n;
}
System.out.println("Sum = " + sum);
```

---

# **📌 6. Finding Min and Max**

### **Code**

```java
int min = scores[0];
for (int n : scores) {
    if (n < min) min = n;
}
System.out.println("Minimum = " + min);
```

---

# **📌 7. Copying Arrays**

### **Wrong (copies reference)**

```java
int[] a = {1, 2, 3};
int[] b = a;   // NOT a real copy
```

### **Correct (copies contents)**

```java
int[] a = {1, 2, 3};
int[] b = new int[a.length];

for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

---

# **📌 8. Passing Arrays to Methods**

### **Note**

* Methods can modify the original array.

### **Code**

```java
public static void fillWithZeros(int[] arr) {
    for (int i = 0; i < arr.length; i++)
        arr[i] = 0;
}

int[] nums = {5, 4, 3};
fillWithZeros(nums);   // nums becomes {0,0,0}
```

---

# **📌 9. Variable-Length Arguments (`...`)**

### **Note**

* Java treats them as an array inside the method.

### **Code**

```java
public static int addAll(int... nums) {
    int sum = 0;
    for (int n : nums) sum += n;
    return sum;
}

System.out.println(addAll(1, 2, 3, 4)); // prints 10
```

---

# **📌 10. Linear Search**

### **Code**

```java
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++)
        if (arr[i] == key) return i;
    return -1;
}
```

---

# **📌 11. Binary Search**

### **Note**

* Works only on **sorted** arrays.

### **Code**

```java
int index = Arrays.binarySearch(scores, 85);
```

---

# **📌 12. Selection Sort**

### **Code**

```java
for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }
    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
}
```

---

# **📌 13. Command-Line Arguments**

### **Note**

* Stored in the `args` array of `main`.

### **Code**

```java
public static void main(String[] args) {
    System.out.println("First argument: " + args[0]);
}
```

Just tell me!
