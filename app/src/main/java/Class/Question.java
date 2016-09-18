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
        this.rightAnswer = this.new Answer(rightAnswer);
        this.answerOptions = answerOptions;
        this.questionType = questionType;

    }

    public class Answer {

        @Getter @Setter private String text;

        public Answer(String text) {
            this.text = text;
        }
    }

}
