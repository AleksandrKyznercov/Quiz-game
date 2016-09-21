package Class;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SANTOR_user on 17.09.2016.
 */

public class Game {

    private Difficulty difficulty;
    private Integer score;
    private Integer questionsCount;
    private Integer currentQuestionNumber;
    private Player player;
    private Integer lives;
    private ArrayList questions;

    public Game(Player player, Difficulty difficulty, Integer questionsCount, Integer lives) {
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

    public void setPlayer(Player player) {
        this.player = player;
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

    public void startGame(){

    }

    public void stopGame(){

    }

    public void addQuestion(/*Параметры*/){
       // questions.add(/*new Question(Параметры)*/)
    }

    public void getQuestion(){

    }

    public void incLives(){
        this.lives++;
    }

    public void decLives(){
        this.lives--;
    }

    public void NextQuestion(){

    }

    public void prevQuestion(){

    }

}
