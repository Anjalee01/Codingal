import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter rotation value: ");
        int k = sc.nextInt();

        // Count digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Handle large or negative rotations
        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }

        // Split number
        int divisor = (int)Math.pow(10, k);
        int remainder = num % divisor;   // last k digits
        int quotient = num / divisor;   // remaining digits

        // Rotate
        int result = (int)(remainder * Math.pow(10, digits - k) + quotient);

        // Output
        System.out.println("Rotated Number: " + result);
    }
}