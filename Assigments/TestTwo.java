import java.util.Random;
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number between 1 and 12: ");
        int userNumber = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Display the English month name for the user's input using switch
        String monthName = getMonthNameSwitchOnly(userNumber);
        System.out.println("Corresponding month: " + monthName);
    }

    // Method to get the English month name for a given number using switch
    private static String getMonthNameSwitchOnly(int monthNumber) {
        String monthName;

        switch (monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month number"; break;
        }

        return monthName;
    }
}
