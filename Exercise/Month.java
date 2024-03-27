import java.util.Random;

public class Month {
    public static void main(String[] args) {
        // Generate a random number between 1 and 12
        Random random = new Random();
        int randomNumber = random.nextInt(12) + 1;

        // Display the corresponding English month name
        String monthName = getMonthName(randomNumber);
        System.out.println("Randomly generated number: " + randomNumber);
        System.out.println("Corresponding month: " + monthName);
    }

    // Method to get the English month name based on the number
    private static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }
}
