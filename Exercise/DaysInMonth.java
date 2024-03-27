import java.util.Scanner;

public class DaysInMonth {
    public static boolean isLeapYear(int year) {
        // Leap year calculation
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;

            case 2:  // February
                return isLeapYear(year) ? 29 : 28;

            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month >= 1 && month <= 12) {
            // Display the result
            int result = daysInMonth(month, year);
            if (result != -1) {
                System.out.println(result + " days in " + month + "/" + year + ".");
            } else {
                System.out.println("Invalid month.");
            }
        } else {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
        }

        scanner.close();
    }
}
