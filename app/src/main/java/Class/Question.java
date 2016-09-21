package Class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Question {

    protected String text;
    protected Difficulty difficulty;
    protected String rightAnswer;
    protected List<String> answerOptions;
    protected QuestionType questionType;
    protected String category;

    public Question(String text, Difficulty difficulty, String rightAnswer, ArrayList answerOptions, QuestionType questionType) {
        this.text = text;
        this.difficulty = difficulty;
        //this.rightAnswer = this.new Answer(rightAnswer);
        this.answerOptions = answerOptions;
        this.questionType = questionType;
    }

    public Question(String text, Difficulty difficulty, String rightAnswer, List answerOptions, String category) {
        this.text = text;
        this.difficulty = difficulty;
        this.rightAnswer = rightAnswer;
        this.answerOptions = answerOptions;
        this.category = category;
    }

    protected void setQuestText(String textQuest){
        text = textQuest;
    }

    protected void setRightAnswer(String rightAns){
        rightAnswer = rightAns;
    }

    protected void setDifficulty(Difficulty diffucilty){
        difficulty = diffucilty;
    }

    protected void setAnswerOptions(List<String> options){
        answerOptions = options;
    }

    protected String getQuestText(){
        return text;
    }

    protected String getRightAnswer() {
        return rightAnswer;
    }

    protected String getCategory() {
        return category;
    }

    protected void setCategory(String category){
        this.category = category;
    }

    protected Difficulty getDifficulty() {
        return difficulty;
    }

    protected List<String> getAnswerOptions() {
        return answerOptions;
    }

    protected boolean checkAnswer(String answer) {
        return answer.equals(this.rightAnswer);
    }
}
