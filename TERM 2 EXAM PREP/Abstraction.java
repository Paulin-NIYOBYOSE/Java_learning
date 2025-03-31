abstract class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    //concrete method
    public double getBalance(){
        return balance;
    }

    //Abstract Methods(must be implemented by subclasses)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    //concrete method
    public void displayAccountInfo() {
        System.out.println("Account number" + accountNumber);
        System.out.println("Balance" + balance);

    }
}

//concrete savingsAccount class
class savingsAccount extends BankAccount{
    private double interestRate;

    public savingsAccount(String accountNumber, double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;

    }

    @Override
    public void deposit(double amount){
        if (amount >= 50){
            double newBalance = getBalance() + amount;
            System.out.println("New balance is " + newBalance);
        }
        else{
            System.out.println("Minimum deposit is 50");
        }

    }

    @Override
    public void withdraw(double amount){
        if (getBalance() - amount >= 100){
            System.out.println("Withdraw amount is " + amount);
        }
        else{
            System.out.println("Must maintain $100 minimum balance");
        }

    }

    public void applyInterest(){
        double interest = getBalance() + interestRate;
        System.out.println("Interest applied " + interestRate);
    }

}
class BankingSystem{
    public static void main(String[] args){
        BankAccount savings = new savingsAccount("SAV001",500,0.05);

        savings.deposit(500);
        savings.withdraw(300);
    }
}