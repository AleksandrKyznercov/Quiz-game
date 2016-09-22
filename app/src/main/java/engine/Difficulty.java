package engine;

/**
 * 3 вида сложности
 */
public enum Difficulty {

    low("low"),
    medium ("medium"),
    hard("hard");

    private final String difficulty;

    Difficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    @Override
    public String toString() {
        return this.difficulty;
    }
}
