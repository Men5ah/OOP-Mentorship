import java.io.File;

public class Course  {
    // member variables and constants
    private double courseCredit;
    private Person[] facultyTeam;
    private Person facultyIntern;
    private Person[] enrolledStudents;
    private String courseRecommendedText;
    private File courseSyllabus;
    private static final String COURSE_CODE = "CS213";
    private static final String COURSE_NAME = "Object-Oriented Programming";

    public Course(){
        this.enrolledStudents = new Person[3];
    }

    // Accessor method
    public Person[] getEnrolledStudents(){
        return this.enrolledStudents;
    }
    // mutator method
    public void setEnrolledStudents(Person person){
        for (int count =0; count < enrolledStudents.length; count++) {
            this.enrolledStudents[count] = person;
        }
    }

    public static void main(String[] args){
        Person person1 = new Person("Enoch", 21, "English", 112.5, 6.2);
        Person person2 = new Person("Martha", 12, "Ga", 112.5, 6.2);
        Person person3 = new Person("Winfred", 25, "French", 112.5, 6.2);
        Course course = new Course();
        course.setEnrolledStudents(person1);// non-static
        course.setEnrolledStudents(person2);
        course.setEnrolledStudents(person3);
    }

}
