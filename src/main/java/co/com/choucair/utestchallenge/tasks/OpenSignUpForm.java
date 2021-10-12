package co.com.choucair.utestchallenge.tasks;

import co.com.choucair.utestchallenge.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenSignUpForm implements Task {

    public static OpenSignUpForm theButton() { return Tasks.instrumented(OpenSignUpForm.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestHomePage.SIGNUP_BUTTON));
    }
}
