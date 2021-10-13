package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpFormStep2Page extends PageObject{
    public static final Target INPUT_CITY = Target.the("Where to input the type the current city")
                                                        .located(By.id("city"));
    public static final Target SPAN_CITY = Target.the("Click to select the city")
                                                        .locatedBy("//div[@class='pac-container pac-logo']//span[contains(text(),{0})]");
    public static final Target INPUT_ZIP = Target.the("Where to type the Postal code")
                                                        .located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Click button to go to step 3 of the form")
                                                        .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
