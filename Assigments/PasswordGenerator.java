import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] args) {
        Random  random = new Random();
        int min =100000;
        int max = 999999;
        int RandomNumber =  (int)(Math.random() * (max-min+1)) + min;
        System.out.println("Password :" + RandomNumber);

    }
}
