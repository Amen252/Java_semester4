import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Scanner Average = new Scanner(System.in);
        double Score;
        System.out.println("Enter A marks to Check : ");
        Score = Average.nextDouble();
        System.out.print("Enter Marks To Calculate : ");
        if (Score >= 90) {
            System.out.println("You're Grade is 'B'");
        } else if (Score >= 80) {
            System.out.println("You're Grade is 'C'");

        } else if (Score >= 70) {
            System.out.println("You're Grade is 'D'");
        }else if (Score >= 60) {
            System.out.println("You're Grade is 'D'");
        }

        }
    }
