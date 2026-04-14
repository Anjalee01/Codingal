import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Division operation
            int result = num1 / num2;

            System.out.println("Result: " + result);
        }

        // Handles divide by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        // Handles invalid input
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only!");
        }

        // Handles any other unexpected error
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}