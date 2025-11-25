public class InheritanceTest {
    public static void main(String[] args) {
        //Create a bird object
        Bird myBird = new Bird("Parrot", 2, 0.25, "Green");

        //Accessing inherited methods
        System.out.println("Bird Name: " + myBird.getName());
        System.out.println("Bird Age: " + myBird.getAge());
        System.out.println("Bird Wing Span: " + myBird.getWingSpan());
        System.out.println("Bird Beak Color: " + myBird.getBeakColor());
        System.out.println("Bird Sound: " + myBird.makeSound("angry"));

        //Using the Flyable interface method and variables
        System.out.println(Flyable.MAX_ALTITUDE);
        System.out.println(myBird.fly("5000"));
        myBird.mate();
        //toString method
        System.out.println(myBird.toString());
    }
}
