class Student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating 10 student objects
        Student s1 = new Student("Sam", 1, 95);
        Student s2 = new Student("Tom", 2, 94);
        Student s3 = new Student("Ali", 3, 93);
        Student s4 = new Student("Sara", 4, 92);
        Student s5 = new Student("John", 5, 91);
        Student s6 = new Student("Ayesha", 6, 90);
        Student s7 = new Student("David", 7, 89);
        Student s8 = new Student("Mina", 8, 88);
        Student s9 = new Student("Zain", 9, 87);
        Student s10 = new Student("Noor", 10, 86);

        // Displaying details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
        s6.displayDetails();
        s7.displayDetails();
        s8.displayDetails();
        s9.displayDetails();
        s10.displayDetails();
    }
}