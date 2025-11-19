# ⭐ PRACTICE QUESTION 1 (Easy)

## Topic: Abstract class + subclass implementation

- Create an abstract class Shape with an abstract method area().
- Create Circle and Rectangle subclasses that implement the method.

### Starter Code

```java
abstract class Shape {
    // TODO: declare abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    // TODO: implement area()
}

class Rectangle extends Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    // TODO: implement area()
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        // TODO: print areas of both shapes
    }
}
```










## ✅ Solution
```java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double area() {
        return w * h;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
```
