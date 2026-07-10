public class Player {

    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int bestScore;

    public Player(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.bestScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void incrementGamesPlayed() {
        gamesPlayed++;
    }

    public void incrementGamesWon() {
        gamesWon++;
    }

    public void setBestScore(int score) {
        if (score > bestScore) {
            bestScore = score;
        }
    }

    public void displayStatistics() {
        System.out.println("\n========== PLAYER STATISTICS ==========");
        System.out.println("Player Name : " + name);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Games Won   : " + gamesWon);
        System.out.println("Best Score  : " + bestScore);
        System.out.println("=======================================\n");
    }
}