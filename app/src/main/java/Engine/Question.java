package Engine;

import java.util.ArrayList;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Question {

    protected String text;
    protected Difficulty difficulty;
    protected String rightAnswer;
    protected ArrayList<String> answerOptions;
    protected QuestionType questionType;
    protected Category category;

    public Question(String text, Difficulty difficulty, String rightAnswer, ArrayList answerOptions, QuestionType questionType) {
        this.text = text;
        this.difficulty = difficulty;
        this.rightAnswer = rightAnswer;
        this.answerOptions = answerOptions;
        this.questionType = questionType;
    }

    public Question(String text, Difficulty difficulty, String rightAnswer, ArrayList answerOptions, Category category) {
        this.text = text;
        this.difficulty = difficulty;
        this.rightAnswer = rightAnswer;
        this.answerOptions = answerOptions;
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Difficulty getDifficulty() {
        return this.difficulty;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    protected boolean checkAnswer(String answer) {
        return answer.equals(this.rightAnswer);
    }
}
