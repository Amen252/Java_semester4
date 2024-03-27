import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter A year to Check : ");
        int Year = UserInput.nextInt();
        if( (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0))  {
            System.out.println(Year + " Is  Leap year.");
        } else {
            System.out.println(Year + " is not Leap Year.");
        }
    }

}
