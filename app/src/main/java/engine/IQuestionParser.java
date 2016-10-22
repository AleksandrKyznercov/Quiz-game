package engine;

import java.util.List;

/**
 * Created by illestboy on 22.10.16.
 */

public interface IQuestionParser {

    public List<Question> getQuestionsCount(Category category, Difficulty difficulty);

    public List<Question> getQuestionsCount(Difficulty difficulty);

    public List<Question> getQuestionsCount(Category category);

    public List<Question> getAllQuestions(Category category, Difficulty difficulty);

    public List<Question> getAllQuestions(Difficulty difficulty);

    public List<Question> getAllQuestions(Category category);

    public List<Question> getQuestions(Category category, Difficulty difficulty, int count);

}
