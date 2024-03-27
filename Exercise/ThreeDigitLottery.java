import java.util.Scanner;

public class ThreeDigitLottery {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 900) + 100;

        // Prompt the user to enter a three-digit number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        // Extract digits from the lottery and user input
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        System.out.println("Lottery number is " + lottery);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: You win $12,000!");
        } else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
                && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
                && (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
            System.out.println("Match all digits: You win $5,000!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: You win $2,000!");
        } else {
            System.out.println("Sorry, no match. Better luck next time!");
        }

        input.close();
    }
}
