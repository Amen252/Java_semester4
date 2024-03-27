import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by Spaces : ");
        String S1 = input.next();
        String S2 = input.next();
        String S3 = input.next();
        System.out.println("S1 is " + S1);
        System.out.println("S2 is " + S2);
        System.out.println("S3 is " + S3);

    }
}
