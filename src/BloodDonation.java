import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int Age = Input.nextInt();
        System.out.print("Enter your Weight : ");
        double Weight = Input.nextDouble();
        if (Age > 18 ) {
            if (Weight >= 50){
                System.out.println("You can donate a blood .");
            }
            } else {
            System.out.println("You can't donate a blood.");

        }

    }
}
