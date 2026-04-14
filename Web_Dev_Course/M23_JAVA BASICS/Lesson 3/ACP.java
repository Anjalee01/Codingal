import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = 0;

        // Loop to reverse the number
        while (num != 0) {
            int digit = num % 10;       // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;             // remove last digit
        }

        System.out.println("Reversed number = " + reverse);

        input.close();
    }
}