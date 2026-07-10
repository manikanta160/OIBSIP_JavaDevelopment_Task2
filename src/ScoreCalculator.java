public class ScoreCalculator {

    public static int calculateScore(int attempts, int maxAttempts) {

        int score = (maxAttempts - attempts + 1) * 10;

        if (score < 10) {
            score = 10;
        }

        return score;
    }
}