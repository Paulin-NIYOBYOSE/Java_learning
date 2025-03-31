
class Person{
    private String name; //private field
    private int age;

    //Public getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
     if(age>0){
         this.age = age;
     }
    }
}
class PersonTest{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(20);

        System.out.println("Name:" +p1.getName());
        System.out.println("Age:" +p1.getAge());

    }
}