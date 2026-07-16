import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the movie rating count: ");
        int rating = input.nextInt();

        if (rating > 75000) {
            System.out.println("Rating: Out of the world!");
        } 
        else if (rating > 45000 && rating < 70000) {
            System.out.println("Rating: Best");
        } 
        else if (rating > 25000) {
            System.out.println("Rating: Better");
        } 
        else if (rating > 5000) {
            System.out.println("Rating: Good");
        } 
        else {
            System.out.println("Rating: Average or below");
        }

        input.close();
    }
}