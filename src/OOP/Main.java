package OOP;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.displayInfo(); // Output: Brand

        //BankAccount
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
    }
}