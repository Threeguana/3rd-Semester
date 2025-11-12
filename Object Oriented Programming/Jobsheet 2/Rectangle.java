public class Rectangle {
    int length;
    int width;

    // default constructor
    public Rectangle() {}

    // constructor with parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Rectangle dimensions:");
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public void displayResult() {
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}
