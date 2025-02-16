package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenario {
    private String name;
    private String ask;
    
    //First Sccenario
    @Given("my name is Shivaram")
    public void anExampleScenario() {
        name="Shivaram";
    }

    @When("I ask if it is Shivaram")
    public void allStepDefinitionsAreImplemented() {
        ask = "Shivaram";
    }

    @Then("Success")
    public void theScenarioPasses() {
        System.out.println("Test passed successfully!");
    }

    

}