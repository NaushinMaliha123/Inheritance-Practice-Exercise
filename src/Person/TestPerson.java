package Person;
public class TestPerson {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 1985);
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Bob", 2000, "Computer Science");
        System.out.println(student);

        // Create an Instructor object
        Instructor instructor = new Instructor("Dr. Smith", 1970, 80000);
        System.out.println(instructor);
    }
}
