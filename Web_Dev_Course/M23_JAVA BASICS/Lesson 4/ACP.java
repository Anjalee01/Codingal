import java.util.Scanner;

class ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Student details
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Marks input
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = input.nextInt();

        // Calculations
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        // Grade using ternary operator
        String grade = (average >= 80) ? "A" :
                       (average >= 60) ? "B" :
                       (average >= 50) ? "C" :
                       (average >= 40) ? "D" : "F";

        // Display Report Card
        System.out.println("\n----- Report Card -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}