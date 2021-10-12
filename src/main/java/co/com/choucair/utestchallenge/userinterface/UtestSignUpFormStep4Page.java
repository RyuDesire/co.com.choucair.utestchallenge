package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpFormStep4Page extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where to type the password")
                                                        .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where to type again the password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("check to receive newsletter via email")
            .located(By.name("newsletterOptIn"));
    public static final Target CHECK_ACCEPT_TERMS = Target.the("check to accept the terms of use")
            .located(By.name("termOfUse"));
    public static final Target CHECK_PRIVACY_SECURITY_POLICY = Target.the("check to accept the privacy and security policies")
            .located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("click to register user")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target H1_WELCOME = Target.the("message after the registrations is complete")
            .located(By.xpath("//div[@class='image-box-header']//h1"));
}
