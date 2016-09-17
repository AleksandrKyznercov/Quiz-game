package Class;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SANTOR_user on 17.09.2016.
 */
public class Player {

    @Getter @Setter private static String name;
    @Getter @Setter private static Integer maxScore;
    @Getter @Setter private static Integer totalGamesCount;
    @Getter @Setter private static Integer lastScore;

    public Player(String name) {
        this.name = name;
    }

}
