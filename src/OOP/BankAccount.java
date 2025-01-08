package OOP;

public class BankAccount {
    private double balance = 10;
    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
