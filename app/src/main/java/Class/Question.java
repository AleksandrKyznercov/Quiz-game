package Class;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SANTOR_user on 18.09.2016.
 */
public class Question {

    protected String _text;
    protected Diffucilty _difficulty;
    protected String _rightAnswer;
    protected List<String> _answerOptions;
    protected QuestionType _questionType;
    protected String _category;

    public Question(String text, Diffucilty difficulty, String rightAnswer, ArrayList answerOptions, QuestionType questionType) {
        _text = text;
        _difficulty = difficulty;
        //this.rightAnswer = this.new Answer(rightAnswer);
        _answerOptions = answerOptions;
        _questionType = questionType;
    }

    public Question(String text, Diffucilty difficulty, String rightAnswer, List answerOptions, String category) {
        _text = text;
        _difficulty = difficulty;
        _rightAnswer = rightAnswer;
        _answerOptions = answerOptions;
        _category = category;
    }

    protected void setQuestText(String textQuest){
        _text = textQuest;
    }

    protected void setRightAnswer(String rightAns){
        _rightAnswer = rightAns;
    }

    protected void setDifficulty(Diffucilty diffucilty){
        _difficulty = diffucilty;
    }

    protected void setAnswerOptions(List<String> options){
        _answerOptions = options;
    }

    protected String getQuestText(){
        return _text;
    }

    protected String getRightAnswer() {
        return _rightAnswer;
    }

    protected String getCategory() {
        return _category;
    }

    protected void setCategory(String category){
        _category = category;
    }

    protected Diffucilty getDifficulty() {
        return _difficulty;
    }

    protected List<String> getAnswerOptions() {
        return _answerOptions;
    }
}
