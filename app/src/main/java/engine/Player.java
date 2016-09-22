package engine;

/**
 * Created by SANTOR_user on 17.09.2016.
 */
public class Player {

    private static String name;
    private static Integer maxScore;
    private static Integer totalGamesCount;
    private static Integer lastScore;

    public Player(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static Integer getMaxScore() {
        return maxScore;
    }

    public static void setMaxScore(Integer maxScore) {
        Player.maxScore = maxScore;
    }

    public static Integer getTotalGamesCount() {
        return totalGamesCount;
    }

    public static void setTotalGamesCount(Integer totalGamesCount) {
        Player.totalGamesCount = totalGamesCount;
    }

    public static Integer getLastScore() {
        return lastScore;
    }

    public static void setLastScore(Integer lastScore) {
        Player.lastScore = lastScore;
    }
}
