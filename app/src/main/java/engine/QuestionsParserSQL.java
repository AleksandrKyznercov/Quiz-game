package engine;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by illestboy on 22.09.16.
 */

public class QuestionsParserSQL implements IQuestionParser {

    private Context activity;

    public QuestionsParserSQL(Context activity) {
        this.activity = activity;
    }

    public ArrayList<Question> getQuestions(Category category, Difficulty difficulty) {
        ArrayList<Question> questions = new ArrayList();
        DatabaseHelper helper = new DatabaseHelper(activity);
        SQLiteDatabase sdb;
        sdb = helper.getReadableDatabase();
        String[] query = {"text", "rightAnswer", "answerOptions", "type"};
        Cursor cursor = sdb.query("questions", query, "category='" + category.getName() + "' and difficulty='" + difficulty.name() +"'", null, null, null, null);
        while (cursor.moveToNext()) {
            String text = cursor.getString(cursor.getColumnIndex("text"));
            String rightAnswer = cursor.getString(cursor.getColumnIndex("rightAnswer"));
            ArrayList<String> answerOptions = new ArrayList<>();
            String answerOptionsString = cursor.getString(cursor.getColumnIndex("answerOptions"));
            String[] answerOptionsArr = answerOptionsString.split(";");
            Collections.addAll(answerOptions, answerOptionsArr);
            String questionType = cursor.getString(cursor.getColumnIndex("type"));

            questions.add(new Question(text, difficulty, rightAnswer, answerOptions, category, new QuestionType(questionType)));
        }
        cursor.close();
        return questions;
    }

    public ArrayList<Question> getQuestions(Category category, Difficulty difficulty, int count) {
        ArrayList<Question> questions = new ArrayList();
        DatabaseHelper helper = new DatabaseHelper(activity);
        SQLiteDatabase sdb;
        sdb = helper.getReadableDatabase();
        String[] query = {"text", "rightAnswer", "answerOptions", "type"};
        Cursor cursor = sdb.query("questions", query, "category='" + category.getName() + "' and difficulty='" + difficulty.name() +"'", null, null, null, null);
        while ((questions.size() < count) || (cursor.moveToNext())) {
            String text = cursor.getString(cursor.getColumnIndex("text"));
            String rightAnswer = cursor.getString(cursor.getColumnIndex("rightAnswer"));
            ArrayList<String> answerOptions = new ArrayList<>();
            String answerOptionsString = cursor.getString(cursor.getColumnIndex("answerOptions"));
            String[] answerOptionsArr = answerOptionsString.split(";");
            Collections.addAll(answerOptions, answerOptionsArr);
            String questionType = cursor.getString(cursor.getColumnIndex("type"));

            questions.add(new Question(text, difficulty, rightAnswer, answerOptions, category, new QuestionType(questionType)));
        }
        cursor.close();
        return questions;
    }

    @Override
    public List<Question> getQuestionsCount(Category category, Difficulty difficulty) {
        return null;
    }

    @Override
    public List<Question> getQuestionsCount(Difficulty difficulty) {
        return null;
    }

    @Override
    public List<Question> getQuestionsCount(Category category) {
        return null;
    }

    @Override
    public List<Question> getAllQuestions(Category category, Difficulty difficulty) {
        return null;
    }

    @Override
    public List<Question> getAllQuestions(Difficulty difficulty) {
        return null;
    }

    @Override
    public List<Question> getAllQuestions(Category category) {
        return null;
    }
}


