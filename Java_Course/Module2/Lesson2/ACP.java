import java.util.Scanner;

// Parent Class
class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

// Child 1
class Subtraction extends Addition {
    int subtract(int a, int b) {
        return a - b;
    }
}

// Child 2
class Multiplication extends Subtraction {
    int multiply(int a, int b) {
        return a * b;
    }
}

// Child 3 (Lowest Child Class)
class Division extends Multiplication {
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choice = sc.nextInt();

        // Object of lowest child class
        Division obj = new Division();

        switch (choice) {
            case 1:
                System.out.println("Result: " + obj.add(num1, num2));
                break;

            case 2:
                System.out.println("Result: " + obj.subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result: " + obj.multiply(num1, num2));
                break;

            case 4:
                System.out.println("Result: " + obj.divide(num1, num2));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}