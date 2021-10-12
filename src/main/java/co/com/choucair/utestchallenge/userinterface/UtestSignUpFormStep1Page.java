package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpFormStep1Page extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("Where to type the firstname")
                                                .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Where to type the lastname")
                                                .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where to type the email")
                                                .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("List to select the month of birth")
                                                .located(By.name("birthMonth"));
    public static final Target SELECT_DAY = Target.the("List to select the day of birth")
                                                .located(By.name("birthDay"));
    public static final Target SELECT_YEAR = Target.the("List to select the year of birth")
                                                .located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("Where to type a language to be added")
                                                .located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to go to step 2 of the form")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
