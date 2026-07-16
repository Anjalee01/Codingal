import java.util.Scanner;

// 🔹 Custom Exceptions
class InvalidChoiceException extends Exception {
    InvalidChoiceException(String msg) {
        super(msg);
    }
}

class MinimumBalanceException extends Exception {
    MinimumBalanceException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

// 🔹 Bank Class
class Bank {
    private double balance;

    // Constructor
    Bank(double balance) throws MinimumBalanceException {
        if (balance < 500) {
            throw new MinimumBalanceException("Opening balance must be at least 500!");
        }
        this.balance = balance;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// 🔹 Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter opening balance: ");
            double opening = sc.nextDouble();

            Bank account = new Bank(opening);

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double d = sc.nextDouble();
                            account.deposit(d);
                            break;

                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double w = sc.nextDouble();
                            account.withdraw(w);
                            break;

                        case 3:
                            account.showBalance();
                            break;

                        case 4:
                            System.out.println("Thank you for using Banking Services!");
                            return;

                        default:
                            // 🔥 throwing custom exception
                            throw new InvalidChoiceException("Invalid menu option!");
                    }
                } catch (InvalidChoiceException | InvalidAmountException | InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}