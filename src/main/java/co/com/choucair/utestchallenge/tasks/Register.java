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
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Register implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strInputLanguage;
    private String strCity;
    private String strZip;
    private String strComputerOS;
    private String strComputerOSVersion;
    private String strComputerOSLanguage;
    private String strMobileBrand;
    private String strMobileModel;
    private String strMobileOS;
    private String strPassword;

    public Register(
            String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay,
            String strBirthYear, String strInputLanguage, String strCity, String strZip, String strComputerOS,
            String strComputerOSVersion, String strComputerOSLanguage, String strMobileBrand, String strMobileModel,
            String strMobileOS, String strPassword
                    )
    {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strInputLanguage = strInputLanguage;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strComputerOS = strComputerOS;
        this.strComputerOSVersion = strComputerOSVersion;
        this.strComputerOSLanguage = strComputerOSLanguage;
        this.strMobileBrand = strMobileBrand;
        this.strMobileModel = strMobileModel;
        this.strMobileOS = strMobileOS;
        this.strPassword = strPassword;
    }

    public static Register user(
            String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay,
            String strBirthYear, String strInputLanguage, String strCity, String strZip, String strComputerOS,
            String srtComputerOSVersion, String strComputerOSLanguage, String strMobileBrand, String strMobileModel,
            String strMobileOS, String strPassword)
    {
        return Tasks.instrumented
                (
                Register.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear,
                        strInputLanguage, strCity, strZip, strComputerOS, srtComputerOSVersion, strComputerOSLanguage,
                        strMobileBrand, strMobileModel, strMobileOS, strPassword
                );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Fist step: Personal
                Enter.theValue(strFirstName).into(UtestSignUpFormStep1Page.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UtestSignUpFormStep1Page.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestSignUpFormStep1Page.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UtestSignUpFormStep1Page.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UtestSignUpFormStep1Page.SELECT_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UtestSignUpFormStep1Page.SELECT_YEAR),
                Enter.theValue(strInputLanguage).into(UtestSignUpFormStep1Page.INPUT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(UtestSignUpFormStep1Page.BUTTON_NEXT_LOCATION),
                //Second step: Address
                Clear.field(UtestSignUpFormStep2Page.INPUT_CITY),
                Enter.theValue(strCity).into(UtestSignUpFormStep2Page.INPUT_CITY),
                Click.on(UtestSignUpFormStep2Page.SPAN_CITY.of(strCity)),
                Enter.theValue(strZip).into(UtestSignUpFormStep2Page.INPUT_ZIP),
                Click.on(UtestSignUpFormStep2Page.BUTTON_NEXT_DEVICES),
                //Third step: Devices - Computer
                Click.on(UtestSignUpFormStep3Page.LIST_OS),
                Click.on(UtestSignUpFormStep3Page.DIV_OS.of(strComputerOS)),
                Click.on(UtestSignUpFormStep3Page.LIST_OS_VERSION),
                Click.on(UtestSignUpFormStep3Page.DIV_OS_VERSION.of(strComputerOSVersion)),
                Click.on(UtestSignUpFormStep3Page.LIST_OS_LANGUAGE),
                Click.on(UtestSignUpFormStep3Page.DIV_OS_LANGUAGE.of(strComputerOSLanguage)),
                //Third step: Devices - Mobile
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_BRAND),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_BRAND.of(strMobileBrand)),
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_MODEL),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_MODEL.of(strMobileModel)),
                Click.on(UtestSignUpFormStep3Page.LIST_MOBILE_OS),
                Click.on(UtestSignUpFormStep3Page.DIV_MOBILE_OS.of(strMobileOS)),
                Click.on(UtestSignUpFormStep3Page.BUTTON_NEXT_DEVICES),
                //Fourth step: Last step
                Enter.theValue(strPassword).into(UtestSignUpFormStep4Page.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestSignUpFormStep4Page.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestSignUpFormStep4Page.CHECK_STAY_INFORMED),
                Click.on(UtestSignUpFormStep4Page.CHECK_ACCEPT_TERMS),
                Click.on(UtestSignUpFormStep4Page.CHECK_PRIVACY_SECURITY_POLICY),
                Click.on(UtestSignUpFormStep4Page.BUTTON_COMPLETE_SETUP)
        );
    }
}
