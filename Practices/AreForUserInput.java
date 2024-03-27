import java.util.Scanner;
public class AreForUserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int number = obj.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is odd");
        }



    }

}

