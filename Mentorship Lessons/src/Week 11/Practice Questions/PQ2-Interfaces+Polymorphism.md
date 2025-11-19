# PRACTICE QUESTION 2 (Easy–Medium)

## Topic: Interfaces + Polymorphism

- Define an interface Playable with a method play().
- Let Guitar and Piano implement it.
- Create a method that accepts any Playable and calls play().

### Starter Code

```java
interface Playable {
    // TODO: define void play();
}

class Guitar implements Playable {
    // TODO: implement play()
}

class Piano implements Playable {
    // TODO: implement play()
}

public class Main {
    // TODO: write a static method startPlaying(Playable p) that calls p.play()

    public static void main(String[] args) {
        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        // TODO: call startPlaying(p1) and startPlaying(p2)
    }
}
```













## ✅ Solution

```java
interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming guitar...");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano keys...");
    }
}

public class Main {
    static void startPlaying(Playable p) {
        p.play();
    }

    public static void main(String[] args) {
        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        startPlaying(p1);
        startPlaying(p2);
    }
}
```
