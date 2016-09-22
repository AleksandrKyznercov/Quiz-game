package Engine;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/**
 * Created by illestboy on 22.09.16.
 */

public class QuestionsParserSQL {

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
        Cursor cursor = sdb.query("questions", query, "category=" + category.getName() + "and difficulty=" + difficulty.name(), null, null, null, null);
        while (cursor.moveToNext()) {
            String text = cursor.getString(cursor.getColumnIndex("text"));
            Difficulty newDifficulty;
            String rightAnswer = cursor.getString(cursor.getColumnIndex("rightAnswer"));
            ArrayList<String> answerOptions = new ArrayList<>();
            String answerOptionsString = cursor.getString(cursor.getColumnIndex("answerOptions"));
            String[] answerOptionsArr = answerOptionsString.split(";");
            for (int i = 0; i < answerOptionsArr.length; i++) {
                answerOptions.add(answerOptionsArr[i]);
            }
            String questionType = cursor.getString(cursor.getColumnIndex("type"));

            questions.add(new Question(text, difficulty, rightAnswer, answerOptions, category, new QuestionType(questionType)));
        }
        cursor.close();
        return questions;
    }
}


