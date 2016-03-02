package QuizApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Taylor on 2/24/16.
 */

@Entity
@Table(name="answer")
public class Answer {

    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String text;

    @NotNull
    private int question_id;

    public Answer(){

    }

    public Answer(int ID, String text, int question_id) {
        this.ID = ID;
        this.text = text;
        this.question_id = question_id;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }
}
