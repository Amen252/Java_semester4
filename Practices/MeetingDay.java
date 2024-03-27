import java.util.Random;
import java.util.Scanner;
public class MeetingDay {
    private static Random input;

    public  static void  main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        int Today ,MeetingDay;
        System.out.print("Enter A day As a number: ");
        Today = UserInput.nextInt();
        MeetingDay = (Today + 10) % 7;
        System.out.println("The meeting day will be day " + MeetingDay + " of the week" );

    }
}
