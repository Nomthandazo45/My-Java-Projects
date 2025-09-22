import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        
        boolean playAgain = true;
        

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            // Prompt usser to guess number
            while (!guessedCorrectly && attempts < 10) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;// increamenting attempts
                
                if (userGuess == randomNumber) { // check correct answer
                    System.out.println("Congratulations! Your guess is correct.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            System.out.println("Number of attempts: " + attempts);


            System.out.print("Play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Final score: " + score);

    }
}

