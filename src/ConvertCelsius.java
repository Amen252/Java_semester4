import java.util.Scanner;
public class ConvertCelsius {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter a degree in fahrenheit: ");
        double fahrenheit = UserInput.nextDouble();
        double celcsuis = (5.0 / 9) * (fahrenheit - 32);
        System.out.print("The celsius degree of Fahrenheit is : "+ fahrenheit + " is: "+ celcsuis);
    }
}