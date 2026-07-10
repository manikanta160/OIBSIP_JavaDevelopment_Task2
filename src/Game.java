import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public void startGame(Player player) {

        boolean playAgain = true;

        while (playAgain) {

            player.incrementGamesPlayed();

            System.out.println("\n========== SELECT DIFFICULTY ==========");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.print("Enter your choice: ");

            int level;

            while (true) {

                if (scanner.hasNextInt()) {

                    level = scanner.nextInt();

                    if (level >= 1 && level <= 3) {
                        break;
                    }
                } else {
                    scanner.next();
                }

                System.out.print("Invalid choice! Enter 1, 2 or 3: ");
            }

            int maxNumber = Difficulty.getMaxNumber(level);
            int maxAttempts = Difficulty.getAttempts(level);

            int secretNumber = random.nextInt(maxNumber) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\n====================================");
            System.out.println("Guess the number between 1 and " + maxNumber);
            System.out.println("Maximum Attempts : " + maxAttempts);
            System.out.println("====================================");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {

                    guessed = true;
                    player.incrementGamesWon();

                    int score = ScoreCalculator.calculateScore(attempts, maxAttempts);
                    player.setBestScore(score);

                    System.out.println("\n================================");
                    System.out.println("🏆 CONGRATULATIONS!");
                    System.out.println("You guessed the number.");
                    System.out.println("Attempts : " + attempts);
                    System.out.println("Score    : " + score);
                    System.out.println("================================");

                    break;

                } else if (guess < secretNumber) {

                    System.out.println("Too Low!");

                } else {

                    System.out.println("Too High!");
                }
            }

            if (!guessed) {

                System.out.println("\n================================");
                System.out.println("GAME OVER!");
                System.out.println("Correct Number : " + secretNumber);
                System.out.println("================================");
            }

            player.displayStatistics();

            System.out.print("\nDo you want to play again? (Y/N): ");
            String choice = scanner.next();

            playAgain = choice.equalsIgnoreCase("Y");
        }

        System.out.println("\nThank you for playing!");
    }
}