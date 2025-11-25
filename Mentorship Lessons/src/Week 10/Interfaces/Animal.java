public class Animal {
    //Datafields
    private String name;
    private int age;

    //Constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Overloaded Constructor
    public Animal(){
        this.name = "Unknown";
        this.age = 0;
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //Method
    public String makeSound(){
        return "Some generic animal sound";
    }

    //toString method
    // @Override
    // public String toString(){
    //     return "Animal [name=" + name + ", age=" + age + "]";
    // }
}
