import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner Quiz = new Scanner(System.in);
        int Number1 = (int)(System.currentTimeMillis()%10);
        int Number2 = (int)(System.currentTimeMillis()/10 %10);
        System.out.print("What is " +Number1 + "  +" + Number2 + " ? " );
        int Answer = Quiz.nextInt();
        System.out.println(Number1 +  " + " + Number2 + " = " + Answer + " is " + (Number1+Number2 == Answer) );


    }
}
