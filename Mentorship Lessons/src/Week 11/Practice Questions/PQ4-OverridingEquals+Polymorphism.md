# ⭐ PRACTICE QUESTION 4 (Medium–Hard)

## Topic: Overriding equals() + Polymorphism

- Create a Book class where two books are equal if they have the same title and author.
- Test equality in main.

### Starter Code

```java
class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    // TODO: override equals(Object obj)
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book("1984", "Orwell");
        Book b3 = new Book("Animal Farm", "Orwell");

        // TODO: print equality results
    }
}
```






















## ✅ Solution

```java
class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book b)) return false;
        return this.title.equals(b.title) && this.author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book("1984", "Orwell");
        Book b3 = new Book("Animal Farm", "Orwell");

        System.out.println(b1.equals(b2)); // true
        System.out.println(b1.equals(b3)); // false
    }
}
```
