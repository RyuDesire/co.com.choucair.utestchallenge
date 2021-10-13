package co.com.choucair.utestchallenge.stepdefinitions;

import co.com.choucair.utestchallenge.model.UtestData;
import co.com.choucair.utestchallenge.questions.Answer;
import co.com.choucair.utestchallenge.tasks.OpenSignUpForm;
import co.com.choucair.utestchallenge.tasks.OpenUp;
import co.com.choucair.utestchallenge.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {


    @Before
    public void setStaget() { OnStage.setTheStage(new OnlineCast()); }
    @Given("^than Jeanne wants to register herself at the Utest website$")
    public void thanJeannewantstoregisterherselfattheUtestwebsite() {
        OnStage.theActorCalled("Jean").wasAbleTo(OpenUp.thePage(), OpenSignUpForm.theButton());
    }

    @When("^she fulfills all the information in the registration form at the Utest platform$")
    public void shefulfillsalltheinformationintheregistrationformattheUtestplatform(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.user(
                utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrBirthMonth(),
                utestData.get(0).getStrBirthDay(),
                utestData.get(0).getStrBirthYear(),
                utestData.get(0).getStrInputLanguage(),
                utestData.get(0).getStrCity(),
                utestData.get(0).getStrZip(),
                utestData.get(0).getStrComputerOS(),
                utestData.get(0).getStrComputerOSVersion(),
                utestData.get(0).getStrComputerOSLanguage(),
                utestData.get(0).getStrMobileBrand(),
                utestData.get(0).getStrMobileModel(),
                utestData.get(0).getStrMobileOS(),
                utestData.get(0).getStrPassword()
        ));
    }

    @Then("^she creates her new user at Utest platform$")
    public void shecreateshernewuseratUtestplatform() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));
    }
}
