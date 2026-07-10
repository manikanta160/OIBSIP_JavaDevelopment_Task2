import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu.showMainMenu();

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Player Name: ");
                    String playerName = scanner.nextLine();

                    Player player = new Player(playerName);

                    Game game = new Game();
                    game.startGame(player);

                    // Exit after game ends
                    scanner.close();
                    return;

                case 2:

                    Menu.showRules();
                    break;

                case 3:

                    System.out.println("\nThank you for using Smart Number Guessing Game!");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid Choice! Please select 1, 2 or 3.");
            }
        }
    }
}