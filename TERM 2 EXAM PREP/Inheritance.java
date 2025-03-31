//Child class
class Animal{
    void eat(){
        System.out.println("This animal eats");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("This dog eats dog food");
    }
    void bark(){
        System.out.println("This dog barks");
    }
}
class AnimalTest{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

    }
}