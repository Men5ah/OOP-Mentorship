public class Bird extends Animal implements Flyable {
    // Data fields
    double wingSpan;
    String beakColor;

    public Bird(String name, int age, double wingSpan, String beakColor) {
        super(name, age);
        // super(); // Animal(name, age)
        this.wingSpan = wingSpan;
        this.beakColor = beakColor;
    }

    // Getters
    public double getWingSpan() {
        return this.wingSpan;
    }

    public String getBeakColor() {
        return this.beakColor;
    }

    // Method overriding and overloading at the same time
    @Override
    public String makeSound() {
        return "Chirp Chirp";
    }

    public String makeSound(String soundType) {
        if (soundType.equals("happy")) {
            return "Chirp Chirp!";
        } else if (soundType.equals("angry")) {
            return "CHIRP CHIRP!";
        } else {
            return makeSound(); // Calls the overridden method
        }
    }
    // Implementing Flyable interface method
    @Override
    public String fly(String someArg) {
        return "The bird is flying at an altitude of " + someArg + " feet.";
    }

    @Override
    public void mate() {
        System.out.println("The bird is mating.");
    }

    // toString method
    @Override
    public String toString() {
        return "Bird [name=" + getName() + ", age=" + getAge() + ", wingSpan=" + wingSpan + ", beakColor=" + beakColor + "]";
    }

    //displayInfo
    public void displayInfo() {
        System.out.println("Bird Name: " + getName());
        System.out.println("Bird Age: " + getAge());
        System.out.println("Bird Wing Span: " + wingSpan);
        System.out.println("Bird Beak Color: " + beakColor);
    }

    
}




//Cover UML
//Inheritance with super classes
//Method overriding
