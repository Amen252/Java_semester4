import java.util.Scanner;

public class ComputeAreaWithCondition {
    public static void main(String[] args) {
        Scanner Compute = new Scanner(System.in);
        double Radius ,Area;
        final  double PI = Math.PI;
        System.out.print("Enter A number for radius : ");
        Radius = Compute.nextDouble();
        if (Radius >= 0){
            Area = Radius * Radius  * PI;
            System.out.printf("The area  %.2f " + " is " , Area);
        }else {
            System.out.println("Number is VALID!");
        }
        }

    }