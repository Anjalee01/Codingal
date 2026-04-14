class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Display account details
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class CodingalBankingServices {
    public static void main(String[] args) {

        // Creating account
        BankAccount user1 = new BankAccount("Codingal User", 1000);

        // Performing operations
        user1.display();

        System.out.println("\n--- Transactions ---");
        user1.deposit(500);
        user1.withdraw(300);
        user1.withdraw(1500); // should show error

        System.out.println("\n--- Final Details ---");
        user1.display();
    }
}