class Volume {

    // Private variables (Encapsulation)
    private double length, width, height, radius;

    // Setter methods
    public void setCuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public void setCube(double side) {
        length = side;
    }

    public void setSphere(double r) {
        radius = r;
    }

    // Getter methods (calculate volume)
    public double getCuboidVolume() {
        return length * width * height;
    }

    public double getCubeVolume() {
        return length * length * length;
    }

    public double getSphereVolume() {
        return (4.0 / 3) * 3.14 * radius * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Volume obj = new Volume();

        // Cuboid
        obj.setCuboid(2, 3, 4);
        System.out.println("Cuboid Volume = " + obj.getCuboidVolume());

        // Cube
        obj.setCube(3);
        System.out.println("Cube Volume = " + obj.getCubeVolume());

        // Sphere
        obj.setSphere(2.5);
        System.out.println("Sphere Volume = " + obj.getSphereVolume());
    }
}