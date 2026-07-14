import java.util.Scanner;

public class EvenOddGame {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Story prompt
        System.out.println("Rashi asks Sunil to guess whether the number is even or odd!");
        System.out.print("Enter the number Rashi says: ");

        // Take number from user
        int number = input.nextInt();

        // Check even or odd
        if (number % 2 == 0) {
            System.out.println("Sunil says: The number is EVEN!");
        } else {
            System.out.println("Sunil says: The number is ODD!");
        }

        input.close();
    }
}