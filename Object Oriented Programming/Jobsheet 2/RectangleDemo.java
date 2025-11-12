import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create the first rectangle with user input
        Rectangle rect1 = new Rectangle();
        System.out.println("Enter the dimensions of the rectangle:");
        System.out.print("Length: ");
        rect1.length = scanner.nextInt();

        System.out.print("Width: ");
        rect1.width = scanner.nextInt();

        rect1.displayInfo();
        rect1.displayResult();

        // create the second rectangle with predefined values
        System.out.println();
        Rectangle rect2 = new Rectangle(2, 3);
        rect2.displayInfo();
        rect2.displayResult();

        scanner.close();
    }
}


