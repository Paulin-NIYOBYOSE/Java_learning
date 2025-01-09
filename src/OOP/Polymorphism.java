package OOP;

class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Cat barks");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
    }
}
