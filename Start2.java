package Inheritance;
class Box {
    double length;
    double width;
    double height;

    // Constructor with all parameters
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Constructor with default dimensions
    Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with a single parameter (assumes a cube)
    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // Calculate and return the volume of the box
    double calculateVolume() {
        return length * width * height;
    }
}

 class Start2 {
    public static void main(String[] args) {
        // Create Box objects using different constructors
        Box box1 = new Box(3.0, 4.0, 5.0);
        Box box2 = new Box(); // Default dimensions (1.0, 1.0, 1.0)
        Box box3 = new Box(2.5); // Cube with side length 2.5

        // Calculate and display the volume of each box
        System.out.println("Volume of Box 1: " + box1.calculateVolume());
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
        System.out.println("Volume of Box 3: " + box3.calculateVolume());
    }
}
