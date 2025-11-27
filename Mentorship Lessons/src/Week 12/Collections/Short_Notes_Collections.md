Below are **short, exam-friendly notes**, **Java snippets**, and **5 practice questions** with **starter code + solutions**.

---

# ✅ **Short Notes on Java Collections (with code snippets)**

## **1. Collection Interface**

Root of all collection types (except maps). Supports add, remove, size, iteration.

**Snippet:**

```java
Collection<String> names = new ArrayList<>();
names.add("John");
names.remove("John");
for (String s : names) System.out.println(s);
```

---

## **2. List Interface (Ordered, Allows Duplicates)**

### **ArrayList** – fast random access

```java
List<Integer> nums = new ArrayList<>();
nums.add(10);
nums.get(0);
```

### **LinkedList** – fast insertion/removal at ends

```java
List<String> ll = new LinkedList<>();
ll.addFirst("A");
ll.addLast("B");
```

### **Vector** – synchronized list

```java
Vector<Integer> v = new Vector<>();
v.add(1);
```

---

## **3. Set Interface (No Duplicates)**

### **HashSet** – unordered

```java
Set<String> set = new HashSet<>();
set.add("A");
set.add("A"); // ignored
```

### **LinkedHashSet** – insertion order

```java
Set<Integer> set = new LinkedHashSet<>();
```

### **TreeSet** – sorted

```java
Set<Integer> set = new TreeSet<>();
```

---

## **4. Queue & PriorityQueue**

### **Queue (FIFO)**

```java
Queue<String> q = new LinkedList<>();
q.offer("A");
q.poll();  // removes A
```

### **PriorityQueue** – smallest element first

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
System.out.println(pq.poll()); // 10
```

---

## **5. Maps (Key–Value Pairs)**

### **HashMap** – fast lookup, unordered

```java
Map<String, Integer> map = new HashMap<>();
map.put("Age", 20);
```

### **LinkedHashMap** – insertion/access order

```java
Map<String, String> map = new LinkedHashMap<>();
```

### **TreeMap** – sorted keys

```java
Map<Integer, String> map = new TreeMap<>();
```

---

## **6. Comparable and Comparator**

### **Comparable (natural order)**

```java
class Student implements Comparable<Student> {
    int age;
    public Student(int age){ this.age = age; }
    public int compareTo(Student o){ return this.age - o.age; }
}
```

### **Comparator (custom order)**

```java
Collections.sort(list, (a, b) -> b.age - a.age); // descending
```

---

## **7. Collections Utility Class**

```java
Collections.sort(list);
Collections.shuffle(list);
Collections.max(list);
```
