package Class;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class QuestionType {

    private static String name;
    private static String text;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        QuestionType.name = name;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        QuestionType.text = text;
    }
}
