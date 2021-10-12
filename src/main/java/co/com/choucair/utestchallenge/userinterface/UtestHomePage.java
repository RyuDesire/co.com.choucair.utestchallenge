package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestHomePage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Button that redirect to the registration form page")
            .located(By.xpath("//a[@href='/signup/personal']"));
}
