---

# ✅ **5 Practice Questions (with starter code + full solutions)**

---

# **Q1. Using ArrayList**

Write a method to return the **second largest number** in a list.

### Starter Code

```java
public static Integer secondLargest(List<Integer> list) {
    // your code here
    return null;
}

public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(5, 1, 7, 3, 9);
    System.out.println(secondLargest(nums));
}
```

### ✔️ Solution

```java
public static Integer secondLargest(List<Integer> list) {
    Collections.sort(list);
    return list.get(list.size() - 2);
}
```

---

# **Q2. Using HashSet**

Check if two strings have the same set of characters.

### Starter Code

```java
public static boolean sameCharacters(String a, String b) {
    // your code here
    return false;
}
```

### ✔️ Solution

```java
public static boolean sameCharacters(String a, String b) {
    return new HashSet<>(Arrays.asList(a.split("")))
            .equals(new HashSet<>(Arrays.asList(b.split(""))));
}
```

---

# **Q3. Using Queue**

Simulate a queue where customers are served in FIFO order.

### Starter Code

```java
public static void serveCustomers(Queue<String> q) {
    // print each served customer
}
```

### ✔️ Solution

```java
public static void serveCustomers(Queue<String> q) {
    while (!q.isEmpty()) {
        System.out.println("Serving: " + q.poll());
    }
}
```

---

# **Q4. Using HashMap**

Count frequency of words in an array.

### Starter Code

```java
public static Map<String, Integer> countWords(String[] words) {
    // your code
    return null;
}
```

### ✔️ Solution

```java
public static Map<String, Integer> countWords(String[] words) {
    Map<String, Integer> map = new HashMap<>();
    for (String w : words) {
        map.put(w, map.getOrDefault(w, 0) + 1);
    }
    return map;
}
```

---

# **Q5. TreeSet Sorting**

Store numbers in a TreeSet and return the **smallest 3**.

### Starter Code

```java
public static List<Integer> smallestThree(Set<Integer> set) {
    // your code here
    return null;
}
```

### ✔️ Solution

```java
public static List<Integer> smallestThree(Set<Integer> set) {
    TreeSet<Integer> ts = new TreeSet<>(set);
    List<Integer> result = new ArrayList<>();
    int count = 0;

    for (int n : ts) {
        if (count == 3) break;
        result.add(n);
        count++;
    }
    return result;
}
```
