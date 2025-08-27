import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You have insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("The current balance is ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 0:
                    System.out.println("Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
