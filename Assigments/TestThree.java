import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read distance in meters from the user
        System.out.print("Enter distance in meters: ");

        // Check if the entered input is a valid double
        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();

            // Check if the entered distance is non-negative
            if (meters >= 0) {
                // Convert meters to kilometers
                double kilometers = meters / 1000;

                // Display the result
                System.out.printf("%.2f meters is equal to %.2f kilometers.%n", meters, kilometers);
            } else {
                System.out.println("Distance cannot be negative. Please enter a non-negative value.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
