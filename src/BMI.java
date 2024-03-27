import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Height : ");
        double height = UserInput.nextDouble();
        System.out.print("Enter Weight : ");
        double Weight = UserInput.nextDouble();
        double bmi = Weight / (height * height);
        System.out.println("The bmi is: "+ bmi);
        if(bmi<18.5){
            System.out.print("You are underweight ");

        } else if (bmi <25) {
            System.out.println("Normal");
        } else if (bmi >30) {
            System.out.println("You are obese !");

        }
    }
}
