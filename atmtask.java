//java program to display the atm transaction
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double intialBalance) {
        this.balance = intialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <=balance) {
            balance -= amount;
            System.out.println("withdrawal successful.new balance: " + balance);
        } else {
            System.out.println("insufficient funds or invalid amount for withdrawal ...");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.Newbalance: " + balance);
        } else {
            System.out.println("insufficient amount for depoist");
        }
    }
}

class atm1 {
    private BankAccount account;
    private Scanner scanner;

    public atm1(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);

    }

    public void ShowMenu() {
        System.out.println("1. WITHDRAW");
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
    }

    public void run() {
        int choice;
        do {
            ShowMenu();
            System.out.print("Enter your choice :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    CheckBalance();
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING THE ATM");
                    break;
                default:
                    System.out.println("invalid choice please select a valid option");

            }
        } while (choice != 4);
    }

    private void CheckBalance() {
        System.out.println("your current balance: "+ account.getBalance());
    }

    /**
     * 
     */
    private void withdraw(){
        System.out.println("enter the amount to withdraw: " );
        final double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private void deposit(){
        System.out.println("enter the amount to deposit");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
}
    public class atmtask{
        
        public static void main(String[]args){
            System.out.println("WELCOME TO THE ATM");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your 4 digit PIN");
            int enteredPin = sc.nextInt();
                   BankAccount userAccount = new BankAccount(1000.0);
        atm1 atm = new atm1(userAccount);
        atm.run();


    }
        
    }
       
    
    
 