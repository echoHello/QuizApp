package QuizApp.Controller;

import QuizApp.Model.Question;
import QuizApp.Model.QuestionDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Taylor on 2/24/16.
 */

@Controller
public class QuestionController {

    @Autowired //hey spring, take this reference and instantiate it for us
    private QuestionDAO questionDAO;

    @ResponseBody
    @RequestMapping(value = "/question/create", method = RequestMethod.GET) //when someone makes a request to GET, do this method
    // routing for backend, available to call in url
    public void createQuestion(Question question) { //create inside database so its void
        questionDAO.save(question); //save a question obj to database
    }

    @ResponseBody
    @RequestMapping(value="/question/findOne", method= RequestMethod.GET)
    public Question readQuestion(int ID) { // id for reading a question
        return questionDAO.findOne(ID);
    }
}
