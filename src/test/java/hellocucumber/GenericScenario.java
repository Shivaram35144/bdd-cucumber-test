package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GenericScenario{
    private String name;
    private String ask;
    //Generic Name
    @Given("my name is {string}")
    public void givenName(String name){
        this.name=name;
    }

    @When("I ask if it is {string}")
    public void checknames(String ask){
        this.ask=ask;
    }

    @Then("Failure")
    public void passFail() {
        System.out.println(name.equals(ask) ? "Success": "Fail");
    }
}