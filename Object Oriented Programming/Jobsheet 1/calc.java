import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        double number1, number2;
        number1 = 0;
        number2 = 0;
        String operator = " ";

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose Operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();

        switch (choice) {
            case 1:
                result = number1 + number2;
                operator = "+";
                break;
            case 2:
                result = number1 - number2;
                operator = "-";
                break;
            case 3:
                result = number1 * number2;
                operator = "*";
                break;
            case 4:
                result = number1 / number2;
                operator = "/";
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        System.out.println(
                "Result: " + number1 + " " + operator + " " + number2 + " equals " + result);
        sc.close();
    }
}
