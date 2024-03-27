import java.util.Scanner;

public class FullInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking User to Enter His full Name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();


        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");

        String middleName = fullName.substring(firstSpaceIndex , lastSpaceIndex);
        System.out.println("Your middle name is: " + middleName);

        // Asking user to enter date of birth
        System.out.print("Enter your date of birth : ");
        String dob = scanner.nextLine();

        String day = dob.substring(0, 2);
        String month = dob.substring(3,5);
        String year = dob.substring(6);

        // Formatting
        String formattedDOB = day + "-" + month + "-" + year;
        System.out.println("Your Date Of Birth is : " + formattedDOB);

    }
}
