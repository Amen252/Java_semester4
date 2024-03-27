import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the greatest number
        double greatest = findGreatest(num1, num2, num3);

        // Print the result
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        scanner.close();
    }

    // Method to find the greatest number among three
    private static double findGreatest(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
