import java.util.Scanner;

public class DetermineWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day as number : ");
        int day  = input.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("this is a weekday");
                break;
            case 6:
            case 7:
                System.out.println("this is the weekend");
                break;
            default:
                System.out.println("Invalid number");
        }
        }

    }

