import java.util.Scanner;

public class StudentMarksAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER your javaProgramming Marks: ");
        double javaProgramming = scanner.nextDouble();
        System.out.print("ENTER your Oracle Marks: ");
        double oracle = scanner.nextDouble();
        System.out.print("ENTER your POM Marks: ");
        double pom = scanner.nextDouble();
        System.out.print("ENTER your POA Marks: ");
        double poa = scanner.nextDouble();
        System.out.print("ENTER your Csharp Marks: ");
        double csharp = scanner.nextDouble();
        System.out.print("ENTER your DLD Marks: ");
        double dld = scanner.nextDouble();

        double total = javaProgramming + oracle + pom + dld + csharp + poa;
        double avg = total / 6;

        System.out.println("Your Total is:"   + total + " And Your are average is:" + avg);

        if (avg > 90) {
            System.out.println("YOU ARE SO GOOD!");
        } else if (avg > 70) {
            System.out.println("YOU ARE GOOD!");
        } else {
            System.out.println("YOU ARE AVG");
        }
    }
}
