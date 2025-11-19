# ⭐ PRACTICE QUESTION 5 (Hard)

## Topic: Abstract class + Interface + Polymorphism + instanceof**

- Create an abstract class Employee with:

fields: name, salary

abstract method: double bonus()

Create an interface Taxable with:

double taxAmount()

Create two subclasses:

Manager implements Taxable

Developer implements Taxable

Write a method that:

Accepts an array of Employee

Prints bonus

If employee is Taxable, also prints taxAmount (use instanceof)

Starter Code
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    // TODO: abstract double bonus();
}

interface Taxable {
    double taxAmount();
}

class Manager extends Employee implements Taxable {
    // TODO: constructor, bonus(), taxAmount()
}

class Developer extends Employee implements Taxable {
    // TODO: constructor, bonus(), taxAmount()
}

public class Main {

    // TODO: method printDetails(Employee[] staff)

    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Alice", 5000),
            new Developer("Bob", 4000)
        };

        // TODO: call printDetails
    }
}

✅ Solution
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    abstract double bonus();
}

interface Taxable {
    double taxAmount();
}

class Manager extends Employee implements Taxable {
    public Manager(String n, double s) {
        super(n, s);
    }

    @Override
    double bonus() {
        return salary * 0.20;
    }

    @Override
    public double taxAmount() {
        return salary * 0.10;
    }
}

class Developer extends Employee implements Taxable {
    public Developer(String n, double s) {
        super(n, s);
    }

    @Override
    double bonus() {
        return salary * 0.15;
    }

    @Override
    public double taxAmount() {
        return salary * 0.07;
    }
}

public class Main {
    static void printDetails(Employee[] staff) {
        for (Employee e : staff) {
            System.out.println(e.name + " Bonus: " + e.bonus());

            if (e instanceof Taxable t) {
                System.out.println("Tax: " + t.taxAmount());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Alice", 5000),
            new Developer("Bob", 4000)
        };

        printDetails(staff);
    }
}
