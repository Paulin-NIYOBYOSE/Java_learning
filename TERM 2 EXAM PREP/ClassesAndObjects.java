class Car {
    String make;
    String model;

    int year;
    void start(){
        System.out.println("The car has started");
    }

    void stop(){
        System.out.println("The car has stopped");
    }

}
class Main{
    public static void main(String[] args){
        //Create an object for the car class
        Car myCar = new Car();

        //values for the fields
        myCar.make = "Toyota";
        myCar.model= "Prius";

        //call methods
        myCar.start();
        myCar.stop();
    }
}