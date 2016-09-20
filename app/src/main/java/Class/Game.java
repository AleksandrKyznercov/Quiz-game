package Class;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SANTOR_user on 17.09.2016.
 */

public class Game {

    @Getter @Setter private static Diffucilty difficulty;
    @Getter @Setter private static Integer score;
    @Getter @Setter private static Integer questionsCount;
    @Getter @Setter private static Integer currentQuestionNumber;
    @Getter @Setter private static Player player;
    @Getter @Setter private static Integer lives;
    @Getter @Setter private static ArrayList questions;

    public Game(Player player, Diffucilty difficulty, Integer questionsCount, Integer lives) {
        this.player = player;
        this.difficulty = difficulty;
        this.questionsCount = questionsCount;
        this.score = 0;
        this.currentQuestionNumber = 0;
        this.lives = lives;
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
