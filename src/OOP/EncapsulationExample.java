class Employee {
    // Private fields to ensure encapsulation
    private String name; // Stores the employee's name
    private int age;     // Stores the employee's age

    // Constructor to initialize Employee objects
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the name field
    public String getName() {
        return name; // Returns the value of the name field
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name; // Updates the name field with the new value
    }

    // Getter method for the age field
    public int getAge() {
        return age; // Returns the value of the age field
    }

    // Setter method for the age field
    public void setAge(int age) {
        // Validates that age is positive before updating
        if (age > 0) {
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an Employee object with initial details
        Employee emp = new Employee("Alice", 30);

        // Access and display the employee's details using getter methods
        System.out.println("Name: " + emp.getName()); // Output: Name: Alice
        System.out.println("Age: " + emp.getAge());   // Output: Age: 30

        // Update the employee's details using setter methods
        emp.setName("Bob");  // Change name to Bob
        emp.setAge(35);      // Change age to 35

        // Display the updated details
        System.out.println("Updated Name: " + emp.getName()); // Output: Updated Name: Bob
        System.out.println("Updated Age: " + emp.getAge());   // Output: Updated Age: 35
    }
}
