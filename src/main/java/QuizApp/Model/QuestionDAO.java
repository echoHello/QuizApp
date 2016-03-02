package QuizApp.Model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Taylor on 2/24/16.
 */
public interface QuestionDAO extends CrudRepository<Question,Integer>{
}
