package hellocucumber;

import com.sun.org.apache.xpath.internal.operations.Bool;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private String name;
    private String ask;
    //First Scenario
    @Given("my name is Shivaram")
    public void anExampleScenario() {
        name="Shivaram";
    }

    @When("I ask if it is Shivaram")
    public void allStepDefinitionsAreImplemented() {
        ask = "Shivaram";
    }

    @Then("Success")
    public String theScenarioPasses() {
        return "Success";
    }

}
