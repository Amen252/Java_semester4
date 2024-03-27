import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the miles of the run: ");
        double Miles = obj.nextDouble();
        System.out.print("Enter the hours of the run: ");
        double Hours = obj.nextDouble();
        System.out.print("Enter the minutes of the run :");
        double Minutes = obj.nextDouble();
        System.out.print("Enter the Seconds  of the run: ");
        double Seconds = obj.nextDouble();
        double avg = (Miles + Hours + Minutes) / 4;
        System.out.printf("Average speed in miles is %.2f", avg);
    }
}