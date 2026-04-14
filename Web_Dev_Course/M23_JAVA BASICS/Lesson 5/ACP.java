// Parent class
class Calculator {
    int a, b;

    void input(int x, int y) {
        a = x;
        b = y;
    }
}

// Child class
class Operations extends Calculator {

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Operations obj = new Operations();

        obj.input(10, 5);  // passing values

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}