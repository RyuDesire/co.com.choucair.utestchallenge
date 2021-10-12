package co.com.choucair.utestchallenge.tasks;

import co.com.choucair.utestchallenge.userinterface.UtestSignUpFormStep1Page;
import co.com.choucair.utestchallenge.userinterface.UtestSignUpFormStep2Page;
import co.com.choucair.utestchallenge.userinterface.UtestSignUpFormStep3Page;
import co.com.choucair.utestchallenge.userinterface.UtestSignUpFormStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Register implements Task {

    public static Register user() { return Tasks.instrumented(Register.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Fist step: Personal
                Enter.theValue("Fake").into(UtestSignUpFormStep1Page.INPUT_FIRSTNAME),
                Enter.theValue("Account").into(UtestSignUpFormStep1Page.INPUT_LASTNAME),
                Enter.theValue("fakeaccount@email.com").into(UtestSignUpFormStep1Page.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(UtestSignUpFormStep1Page.SELECT_MONTH),
                SelectFromOptions.byVisibleText("1").from(UtestSignUpFormStep1Page.SELECT_DAY),
                SelectFromOptions.byVisibleText("2000").from(UtestSignUpFormStep1Page.SELECT_YEAR),
                Enter.theValue("French").into(UtestSignUpFormStep1Page.INPUT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(UtestSignUpFormStep1Page.BUTTON_NEXT_LOCATION),
                //Second step: Address
                Enter.theValue("Toronto").into(UtestSignUpFormStep2Page.INPUT_CITY),
                Click.on(UtestSignUpFormStep2Page.SPAN_CITY),
                Enter.theValue("55017").into(UtestSignUpFormStep2Page.INPUT_ZIP),
                Click.on(UtestSignUpFormStep2Page.BUTTON_NEXT_DEVICES),
                //Third step: Devices - Computer
                Click.on(UtestSignUpFormStep3Page.LIST_OS),
                Click.on(UtestSignUpFormStep3Page.DIV_OS),
                Click.on(UtestSignUpFormStep3Page.LIST_OS_VERSION),
                Click.on(UtestSignUpFormStep3Page.DIV_OS_VERSION),
                Click.on(UtestSignUpFormStep3Page.LIST_OS_LANGUAGE),
                Click.on(UtestSignUpFormStep3Page.DIV_OS_LANGUAGE),
                //Third step: Devices - Mobile
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_BRAND),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_BRAND),
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_MODEL),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_MODEL),
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_OS),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_OS),
                Click.on(UtestSignUpFormStep3Page.BUTTON_NEXT_DEVICES),
                //Fourth step: Last step
                Enter.theValue("aA123456789!").into(UtestSignUpFormStep4Page.INPUT_PASSWORD),
                Enter.theValue("aA123456789!").into(UtestSignUpFormStep4Page.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestSignUpFormStep4Page.CHECK_STAY_INFORMED),
                Click.on(UtestSignUpFormStep4Page.CHECK_ACCEPT_TERMS),
                Click.on(UtestSignUpFormStep4Page.CHECK_PRIVACY_SECURITY_POLICY),
                Click.on(UtestSignUpFormStep4Page.BUTTON_COMPLETE_SETUP)
        );
    }
}
