package OOP;

abstract class Appliance {
    private String brand;

    // Constructor
    public Appliance(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void operate();

    // Concrete method
    public void showBrand() {
        System.out.println("Brand: " + brand); // Output the brand
    }
}


class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand); // Call the parent class constructor
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes..."); // Specific implementation
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Create a WashingMachine object
        Appliance appliance = new WashingMachine("LG");
        appliance.showBrand(); // Output: Brand: LG
        appliance.operate(); // Output: Washing clothes...
    }
}
