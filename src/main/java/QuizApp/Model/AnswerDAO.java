package QuizApp.Model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Taylor on 2/24/16.
 */
public interface AnswerDAO extends CrudRepository<Answer,Integer> {
    //object and corresponding int identifier
    //DataAccessObject for letting me use crud
    //interpreting what the controller tells it to
    //crud request methods flow through accessobject
    //crud for database one
    //only create read update delete
    //beans are pojos that are specific to spring
}
