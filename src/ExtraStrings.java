import java.util.Scanner;

public class ExtraStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FirstName, MiddleName, LastName, Gender, PhoneNumber;
        int Age;

        System.out.print("Enter your First Name: ");
        FirstName = input.next();

        System.out.print("Enter your Middle Name: ");
        MiddleName = input.next();

        System.out.print("Enter your Last Name: ");
        LastName = input.next();

        System.out.print("Enter your Gender: ");
        Gender = input.next();

        System.out.print("Enter your Age: ");
        Age = input.nextInt();

        System.out.print("Enter your Phone Number: ");
        PhoneNumber = input.next();

        System.out.println("Your Full Information:");
        System.out.println("Name: " + FirstName + " " + MiddleName + " " + LastName);
        System.out.println("Gender: " + Gender);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
    }
}
