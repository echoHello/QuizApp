package QuizApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Taylor on 2/24/16.
 */

//models reflect what mySql tables look like
@Entity
@Table(name="question")
public class Question {

    @NotNull //because I specified not null in table
    @GeneratedValue(strategy = GenerationType.AUTO) //for auto increment
    private int ID;
    private String text;

    public Question() {

    }

    //also difined here so there is no possible way not null
    public Question(int ID, String text) {
        this.ID = ID;
        this.text = text;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
