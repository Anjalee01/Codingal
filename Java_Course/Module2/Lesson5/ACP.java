// Parent Class
class SevenWonders {

    // Method to be overridden
    void display() {
        System.out.println("Seven Wonders of the World");
    }
}

// 🔹 1. Taj Mahal
class TajMahal extends SevenWonders {
    @Override
    void display() {
        System.out.println("Taj Mahal - India");
        System.out.println("The four minarets lean slightly outward to protect the main structure.");
    }
}

// 🔹 2. Great Wall of China
class GreatWall extends SevenWonders {
    @Override
    void display() {
        System.out.println("Great Wall of China - China");
    }
}

// 🔹 3. Petra
class Petra extends SevenWonders {
    @Override
    void display() {
        System.out.println("Petra - Jordan");
    }
}

// 🔹 4. Christ the Redeemer
class ChristRedeemer extends SevenWonders {
    @Override
    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

// 🔹 5. Machu Picchu
class MachuPicchu extends SevenWonders {
    @Override
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

// 🔹 6. Chichen Itza
class ChichenItza extends SevenWonders {
    @Override
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

// 🔹 7. Colosseum
class Colosseum extends SevenWonders {
    @Override
    void display() {
        System.out.println("Colosseum - Italy");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Parent reference, child objects (Polymorphism)
        SevenWonders w;

        w = new TajMahal();
        w.display();

        w = new GreatWall();
        w.display();

        w = new Petra();
        w.display();

        w = new ChristRedeemer();
        w.display();

        w = new MachuPicchu();
        w.display();

        w = new ChichenItza();
        w.display();

        w = new Colosseum();
        w.display();
    }
}