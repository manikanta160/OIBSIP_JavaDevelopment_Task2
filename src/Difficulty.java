public class Difficulty {

    public static final int EASY = 1;
    public static final int MEDIUM = 2;
    public static final int HARD = 3;

    public static int getMaxNumber(int level) {
        switch (level) {
            case EASY:
                return 50;
            case MEDIUM:
                return 100;
            case HARD:
                return 200;
            default:
                return 100;
        }
    }

    public static int getAttempts(int level) {
        switch (level) {
            case EASY:
                return 10;
            case MEDIUM:
                return 8;
            case HARD:
                return 6;
            default:
                return 8;
        }
    }
}