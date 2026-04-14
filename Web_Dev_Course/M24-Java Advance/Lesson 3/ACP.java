class Vehicle {
    private int speed = 0;

    // Method to set speed based on gear
    void setGear(int gear) {
        switch (gear) {
            case 1:
                speed = 20;
                break;
            case 2:
                speed = 40;
                break;
            case 3:
                speed = 60;
                break;
            case 4:
                speed = 80;
                break;
            case 5:
                speed = 100;
                break;
            default:
                System.out.println("Invalid gear! Speed set to 0.");
                speed = 0;
        }
        System.out.println("Gear changed to " + gear + ", Speed: " + speed + " km/h");
    }

    // Method to apply brakes
    void applyBrake(int reduction) {
        speed -= reduction;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Brakes applied, Speed now: " + speed + " km/h");
    }

    // Method to display current speed
    void showSpeed() {
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.setGear(1);
        v.setGear(3);
        v.applyBrake(15);
        v.setGear(5);
        v.applyBrake(50);
        v.showSpeed();
    }
}