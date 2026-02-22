
/** a class is a detailed description of an object its a plan or blueprint
 * object is the actualise or tangible plan of the class it is an instansiation of a class
 * This class is called Person class
 *
 **/
public class Person {
    // attributes/ fields/ member variable
    private String name;
    private int age;
    private String nationality;
    private double weight;
    private double height;
    private enum bloodType{O_positive, O_negative, A_positive, A_negative, B_positive, B_negative, AB_positive, AB_negative,};

    // if you don't specify constructor java will automatically create it for you
    // public Person (){} // this is the default constructor
    // Define the Constructor
    // it looks like a method
    // it initialises the member variables
    // parameter is a placeholder/ variable whilst argument is the actual value
    // if you don't specify anything in the constructor

    // Overloaded constructor
    // public Person (String name){
    // this.name = name
    // }

    public Person(String name, int personAge, String nationality, double weight, double height) {
        // 'this' is a reference to a calling object
        this.name = name; // you can use this approach or
        age = personAge; // this approach
        this.nationality = nationality;
        this.weight = weight;
        this.height = height;

    }

    // Mutator methods - Setter. It has a void return type
    // they modify the values of the member variables
    // setters allow for parameters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // Accessor methods - to get something, Getter - you don't need a parameter
    public String getName(){
        return this.name;

    }
    public int getAge(){
        return this.age;
    }

    //Auxiliary Methods
    // toString method
    public String toString(){
        return this.name + " " +
        this.age + " " +
        this.nationality + " " +
        this.weight + " " +
        this.height;
    }
    // comparison of numbers, characters and objects
    public static boolean compareItems(int num1, int num2){
        return (num1 == num2);
    }
    // hash code generates unique values towards identification of objects

    public static void main(String[] args){
        // Instantiation
        // person is the object reference
        Person person = new Person("Enoch", 21, "English", 112.5, 6.2);

        // Access data
        System.out.println("Name: " + person.toString());
        System.out.println("Age: " + person.getAge());
        // System.out.println("Nationality: " + person.getNationality()); because we have not created getNationality method

    }

}

