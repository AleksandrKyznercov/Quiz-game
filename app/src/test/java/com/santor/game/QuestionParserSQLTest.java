package com.santor.game;

/**
 * Created by illestboy on 23.09.16.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.*;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

import engine.Category;
import engine.Difficulty;
import engine.Question;
import engine.QuestionsParserSQL;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class QuestionParserSQLTest {

    @Test
    public void gettingQuestionIsCorrect() throws Exception {
        GameActivity activity = Robolectric.setupActivity(GameActivity.class);
        QuestionsParserSQL parserSQL = new QuestionsParserSQL(activity);
        ArrayList<Question> questions = parserSQL.getQuestions(new Category("category"), Difficulty.low);
        assertEquals(questions.get(0).getRightAnswer(), "4");
        assertEquals(questions.get(0).getText(), "Сколько колёс у машины?");
        assertEquals(questions.get(0).getAnswerOptions().get(0), "1");
        assertEquals(questions.get(0).getAnswerOptions().get(1), "2");
        assertEquals(questions.get(0).getAnswerOptions().get(2), "3");
        assertEquals(questions.get(0).getQuestionType().getName(), "0");
        assertEquals(questions.get(0).getCategory().getName(), "category");
        assertEquals(questions.get(0).getDifficulty(), Difficulty.low);
        questions = parserSQL.getQuestions(new Category("category"), Difficulty.medium);
        assertEquals(questions.get(0).getRightAnswer(), "1950");
        assertEquals(questions.get(0).getText(), "В каком году состоялся первый чемпионат Формулы-1?");
        assertEquals(questions.get(0).getAnswerOptions().get(0), "1950");
        assertEquals(questions.get(0).getAnswerOptions().get(1), "1996");
        assertEquals(questions.get(0).getAnswerOptions().get(2), "1974");
        assertEquals(questions.get(0).getAnswerOptions().get(3), "1940");
        assertEquals(questions.get(0).getQuestionType().getName(), "0");
        assertEquals(questions.get(0).getCategory().getName(), "category");
        assertEquals(questions.get(0).getDifficulty(), Difficulty.medium);
    }

}
