// Parent Class
class Calculator {

    // 🔹 METHOD OVERLOADING (Same method name, different parameters)

    int calculate(int a, int b) {
        return a + b;  // adds two integers
    }

    int calculate(int a, int b, int c) {
        return a + b + c;  // adds three integers
    }

    double calculate(double a, double b) {
        return a + b;  // adds two decimal numbers
    }

    // 🔹 METHOD TO BE OVERRIDDEN
    void showMessage() {
        System.out.println("This is the parent class method.");
    }
}

// Child Class
class AdvancedCalculator extends Calculator {

    // 🔹 METHOD OVERRIDING (Same method name & parameters, different behavior)
    @Override
    void showMessage() {
        System.out.println("This is the overridden method in child class.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Object of child class
        AdvancedCalculator obj = new AdvancedCalculator();

        // 🔸 Calling OVERLOADED methods
        System.out.println("Addition of 2 numbers: " + obj.calculate(5, 10));
        System.out.println("Addition of 3 numbers: " + obj.calculate(5, 10, 15));
        System.out.println("Addition of double numbers: " + obj.calculate(5.5, 2.5));

        // 🔸 Calling OVERRIDDEN method
        obj.showMessage();
    }
}