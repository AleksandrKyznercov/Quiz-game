package engine;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by SANTOR_user on 17.09.2016.
 */

public abstract class AbstractMatch {

    private Difficulty difficulty;
    private Integer score;
    private Integer questionsCount;
    private Integer currentQuestionNumber;
    private final Player player;
    private Integer lives;
    private ArrayList questions;

    public AbstractMatch(Player player, Difficulty difficulty, Integer questionsCount, Integer lives, ArrayList<Question> questions) {
        this.player = player;
        this.difficulty = difficulty;
        this.questionsCount = questionsCount;
        this.score = 0;
        this.currentQuestionNumber = 0;
        this.lives = lives;
        this.questions = questions;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public Integer getCurrentQuestionNumber() {
        return currentQuestionNumber;
    }

    public void setCurrentQuestionNumber(Integer currentQuestionNumber) {
        this.currentQuestionNumber = currentQuestionNumber;
    }

    public Player getPlayer() {
        return player;
    }

    public Integer getLives() {
        return lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    public ArrayList getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
       this.questions.add(question);
    }

    public Question getQuestion(int number){
        return (Question)this.questions.get(number);
    }

    public void incLives(){
        this.lives++;
    }

    public void decLives(){
        this.lives--;
    }

    public void NextQuestion(){
        this.currentQuestionNumber++;
    }

    public void prevQuestion(){
        this.currentQuestionNumber--;
    }

    public abstract void start();

    public abstract void stop();

}
