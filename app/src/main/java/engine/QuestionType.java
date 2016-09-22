package engine;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class QuestionType {

    private String name;
    private String text;

    public QuestionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
