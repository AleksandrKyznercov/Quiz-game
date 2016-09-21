package Class;

import android.app.Activity;

import com.santor.game.R;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Станислав on 19.09.2016.
 */
public class ParserQuest extends Activity {

    List<Question> questList = new ArrayList<>();
    String category,quest_text,rightAnswer = "";
    List<String> options = new ArrayList<>();
    Difficulty difficulty = null;

    /**
     * Получить все вопросы по всем категориям
     */
    public List<Question> getQuestions(){
        try {
            XmlPullParser parserFile = directoryParse();
            while (parserFile.getEventType()!= XmlPullParser.END_DOCUMENT) {
                if(parserFile.getEventType() == XmlPullParser.START_TAG && parserFile.getName().contains("question")){
                    if(parserFile.getName().equals("category"))
                        category = parserFile.getText();

                    if(parserFile.getName().equals("quest_text"))
                        quest_text = parserFile.getText();

                    if(parserFile.getName().equals("rightAnswer"))
                        rightAnswer = parserFile.getText();

                    if(parserFile.getName().equals("answerOptions")){
                        String[] word = parserFile.getText().split(";");
                        for(int k = 0; k<word.length; k++){
                            options.add(k, word[k]);
                        }
                    }

                    if(parserFile.getName().equals("Diffucilty")){
                        switch (parserFile.getText().toLowerCase()){
                            case "low" :
                                difficulty = Difficulty.Low;
                            case "medium" :
                                difficulty = Difficulty.Medium;
                            case "hard" :
                                difficulty = Difficulty.Hard;
                        }
                    }
                    questList.add(new Question(quest_text, difficulty, rightAnswer, options, category));
                }
                parserFile.next();
            }
        }catch (Exception e){
            //Написать обработчик
        }
        return questList;
    }

    /**
     * Получить вопросы по определённой категории и сложностью
     */
    public List<Question> getQuestOfParametrs(String category, Difficulty difficulty) {

        List<Question> newQuestions = new ArrayList<>();

        for (Question question : questList) {
            if (Objects.equals(question.getCategory(), category) && question.getDifficulty() == difficulty) {
                newQuestions.add(question);
            }
        }

        return newQuestions;
    }

    /**
     * Получить общее количество вопросов
     */
    public int getCountQuest(){
        return questList.size();
    }

    /**
     * директория по которой парсим
     */
    XmlPullParser directoryParse() {
        return getResources().getXml(R.xml.quest_data);
    }

}
