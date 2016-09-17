package Class;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Answer {

    @Getter @Setter private String text;

    public Answer(String text) {
        this.text = text;
    }
}
