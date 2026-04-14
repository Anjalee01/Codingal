import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Ternary operator to check leap year
        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                        ? "Leap Year"
                        : "Not a Leap Year";

        System.out.println(result);

        input.close();
    }
}