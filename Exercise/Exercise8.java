import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Miles of the run: ");
        double Miles = obj.nextDouble();
        System.out.print("Enter the Hours of the run: ");
        double Hours  = obj.nextDouble();
        System.out.print("Enter the Minutes of the run : ");
        double Minutes = obj.nextDouble();
        System.out.print("Enter the Seconds of the run : ");
        double Seconds = obj.nextDouble();
        double avg = (Miles + Hours  + Minutes + Seconds) / 4;
        System.out.printf(" the average speed in kilometers per hour is : %.2f" ,avg);

    }
}
