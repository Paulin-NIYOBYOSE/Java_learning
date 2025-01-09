package OOP;
//Inheritance: Allow a class to inherit fields and methods from another class, promoting code reuse.
class Vehicle{
    public String brand;
    //constructor to initialize brand
    public Vehicle(String brand){
        this.brand = brand;
    }
    public void start(){
        System.out.println(brand + " is starting");// Display the brand and action
    }
}

//Child class that inherits from vehicle
class Car extends Vehicle{
    private int numberOfDoors;// Additional field to car
    public Car(String brand ,int numberOfDoors){
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }
    //Method to display car's details
    public void showDetails(){
        System.out.println(brand + " with " + numberOfDoors + " doors");
    }
}

public class InheritanceExample{
    public static void main(String[] args){
        //Create car object with specific brand and number of doors
        Car car = new Car("Benz",4);
        car.start();
        car.showDetails();
    }
}

