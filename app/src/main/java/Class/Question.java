package Class;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Question {

    @Getter @Setter private static String text;
    @Getter @Setter private static Diffucilty difficulty;
    @Getter @Setter private static Answer rightAnswer;
    @Getter @Setter private static ArrayList answerOptions;
    @Getter @Setter private static QuestionType questionType;

    public Question(String text, Diffucilty difficulty, String rightAnswer, ArrayList answerOptions, QuestionType questionType) {
        this.text = text;
        this.difficulty = difficulty;
        this.rightAnswer = new Answer(rightAnswer);// ответ создается в конструкторе вопроса, так?
        this.answerOptions = answerOptions;
        this.questionType = questionType;
    }
}
