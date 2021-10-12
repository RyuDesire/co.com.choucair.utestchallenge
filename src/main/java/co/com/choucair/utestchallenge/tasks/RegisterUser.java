package co.com.choucair.utestchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegisterUser implements Task {

    public static RegisterUser firstStep() { return Tasks.instrumented(RegisterUser.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
