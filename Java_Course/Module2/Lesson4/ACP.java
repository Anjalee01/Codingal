// Parent Class
class Shape {
    // Method to be overridden
    double getVolume() {
        return 0;
    }
}

// 🔹 Cube Class
class Cube extends Shape {
    private double side; // encapsulated variable

    // Setter method
    public void setSide(double side) {
        this.side = side;
    }

    // Overriding method
    @Override
    double getVolume() {
        return side * side * side;
    }
}

// 🔹 Cuboid Class
class Cuboid extends Shape {
    private double length, width, height;

    // Setter method
    public void setDimensions(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    @Override
    double getVolume() {
        return length * width * height;
    }
}

// 🔹 Cylinder Class
class Cylinder extends Shape {
    private double radius, height;

    // Setter method
    public void setValues(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Cube
        Cube cube = new Cube();
        cube.setSide(5);
        System.out.println("Volume of Cube: " + cube.getVolume());

        // Cuboid
        Cuboid cuboid = new Cuboid();
        cuboid.setDimensions(4, 3, 2);
        System.out.println("Volume of Cuboid: " + cuboid.getVolume());

        // Cylinder
        Cylinder cylinder = new Cylinder();
        cylinder.setValues(3, 7);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}