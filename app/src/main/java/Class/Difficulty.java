package Class;

/**
 * 3 вида сложности
 */
public enum Difficulty {

    Low("low"),
    Medium ("medium"),
    Hard("hard");

    private final String name;

    private Difficulty(String name) {
        this.name = name;
    }
}
