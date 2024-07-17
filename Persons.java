// Person class definition
class Person {
    private String name;
    private int age;
    private String emailAddress;

    // Constructor with three parameters
    public Person(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + emailAddress);
    }

    // Method to call displayDetails on a given Person object
    public static void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to print details of the current instance
    public void printCurrentInstance() {
        System.out.println("Printing details of current instance:");
        displayDetails();
    }
}

// Main class to test Person class
public class Persons {
    public static void main(String[] args) {
        // Create an object named Daniel Memusi
        Person danielMemusi = new Person("Daniel Memusi", 30, "daniel.memusi@gmail.com");

        // Call printCurrentInstance method using the object
        danielMemusi.printCurrentInstance();
    }
}
