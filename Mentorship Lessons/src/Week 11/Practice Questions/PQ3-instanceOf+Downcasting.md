# ⭐ PRACTICE QUESTION 3 (Medium)

## Topic: instanceof + Downcasting

- Given an array of Animal, check which animals are Dogs and call bark().

### Starter Code

```java
class Animal {}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Dog() };

        // TODO: loop through animals, detect Dog using instanceof, call bark()
    }
}
```

## ✅ Solution

```java
public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Dog() };

        for (Animal a : animals) {
            if (a instanceof Dog d) {
                d.bark();
            }
        }
    }
}
```
