import java.util.Arrays;

public class LambdaSearch {
    public static void main(String[] args) {

        String[] names = {"Ali", "Sara", "Ahmed", "Zainab", "Usman"};

        String searchName = "Ahmed";

        // Using Lambda with Stream API
        boolean found = Arrays.stream(names)
                .anyMatch(name -> name.equalsIgnoreCase(searchName));

        if (found) {
            System.out.println(searchName + " is found in the array.");
        } else {
            System.out.println(searchName + " is NOT found in the array.");
        }
    }
}