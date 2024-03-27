import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number");
        int number=input.nextInt();
       if( number %2==0){
           System.out.print(number + " is even");
       }
       else{
           System.out.print(number + " is odd");
       }
    }
}
