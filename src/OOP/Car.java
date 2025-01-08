package OOP;
class Car {
    // Attributes
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}