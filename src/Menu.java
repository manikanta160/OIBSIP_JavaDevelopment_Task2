public class Menu {

    public static void showMainMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("      SMART NUMBER GUESSING GAME");
        System.out.println("========================================");
        System.out.println("1. Start Game");
        System.out.println("2. Game Rules");
        System.out.println("3. Exit");
        System.out.println("========================================");
    }

    public static void showRules() {

        System.out.println("\n========== GAME RULES ==========");
        System.out.println("1. Guess the secret number.");
        System.out.println("2. Select difficulty level.");
        System.out.println("3. Too High / Too Low hints will be given.");
        System.out.println("4. Guess within maximum attempts.");
        System.out.println("5. Higher score for fewer attempts.");
        System.out.println("================================");
    }
}