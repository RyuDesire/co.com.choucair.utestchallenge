package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpFormStep2Page extends PageObject{
    public static final Target INPUT_CITY = Target.the("Where to input the type the current city")
                                                        .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where to type the Postal code")
                                                        .located(By.id("zip"));
    public static final Target SELECT_COUNTY = Target.the("Where to input the country")
                                                        .located(By.name("countryId"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Button to go to step 3 of the form")
                                                        .located(By.className("btn btn-blue pull-right"));

}
