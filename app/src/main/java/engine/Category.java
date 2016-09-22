package engine;

import java.util.ArrayList;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Category {

    private String name;
    private ArrayList questionTypes;

    public Category(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getQuestionTypes() {
        return questionTypes;
    }

    public void setQuestionTypes(ArrayList questionTypes) {
        this.questionTypes = questionTypes;
    }
}
