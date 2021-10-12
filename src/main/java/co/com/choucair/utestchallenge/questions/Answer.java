package co.com.choucair.utestchallenge.questions;

import co.com.choucair.utestchallenge.userinterface.UtestSignUpFormStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    private Answer(String question) { this.question = question; }

    public static Answer toThe(String question){ return new Answer(question); }
    @Override
    public Boolean answeredBy(Actor actor) {
    boolean result;
    String welcomeMessage = Text.of(UtestSignUpFormStep4Page.H1_WELCOME).viewedBy(actor).asString();
    if(question.equals(welcomeMessage)){
        result = true;
        } else {
        result = false;
        }
    return result;
    }
}
