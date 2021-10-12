package co.com.choucair.utestchallenge.stepdefinitions;

import co.com.choucair.utestchallenge.tasks.OpenSignUpForm;
import co.com.choucair.utestchallenge.tasks.OpenUp;
import co.com.choucair.utestchallenge.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class UtestStepDefinitions {

    @Before
    public void setStaget() { OnStage.setTheStage(new OnlineCast()); }
    @Given("^than Jeanne wants to register herself at the Utest website$")
    public void thanJeannewantstoregisterherselfattheUtestwebsite() {
        OnStage.theActorCalled("Jean").wasAbleTo(OpenUp.thePage(), OpenSignUpForm.theButton());
    }

    @When("^she fulfills all the information in the regitration form at the Utest platform$")
    public void shefulfillsalltheinformationintheregitrationformattheUtestplatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.firstStep());
    }

    @Then("^she creates her new user at Utest platform$")
    public void she_creates_her_new_user_at_Utest_platform() {
    }
}
