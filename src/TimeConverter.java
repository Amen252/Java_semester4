import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number of seconds: ");

        // Read the user input
        int totalSeconds = scanner.nextInt();

        // Calculating minutes and remaining seconds
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        // Display the result in minutes:seconds format
        System.out.println(minutes + " minutes and " + remainingSeconds + " seconds");
    }
}