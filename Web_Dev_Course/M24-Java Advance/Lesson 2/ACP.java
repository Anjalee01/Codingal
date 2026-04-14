// Parent class
class Wonder {
    void display() {
        System.out.println("A wonder of the world");
    }
}

// Child classes
class GreatWall extends Wonder {
    void display() {
        System.out.println("Great Wall of China - China");
    }
}

class Petra extends Wonder {
    void display() {
        System.out.println("Petra - Jordan");
    }
}

class ChristRedeemer extends Wonder {
    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

class MachuPicchu extends Wonder {
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChichenItza extends Wonder {
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class Colosseum extends Wonder {
    void display() {
        System.out.println("Colosseum - Italy");
    }
}

class TajMahal extends Wonder {
    void display() {
        System.out.println("Taj Mahal - India");
    }
}

// Main class
public class SevenWonders {
    public static void main(String[] args) {

        // Polymorphic references
        Wonder w;

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

        w = new TajMahal();
        w.display();
    }
}