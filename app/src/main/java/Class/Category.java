package Class;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Category {

    private static String name;
    private static ArrayList questionTypes;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Category.name = name;
    }

    public static ArrayList getQuestionTypes() {
        return questionTypes;
    }

    public static void setQuestionTypes(ArrayList questionTypes) {
        Category.questionTypes = questionTypes;
    }
}
