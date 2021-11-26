import java.util.Scanner;

public class FixInfiniteLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int guess;

        System.out.println("\nEnter your guess between 1 and 10:");
        guess = userInput.nextInt();

        while (guess < 1 || guess > 10) {
            System.out.println("Invalid guess");
            guess = userInput.nextInt();
        }
        System.out.print("Valid guess entered");
        userInput.close();
    }
}
