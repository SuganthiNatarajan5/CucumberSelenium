package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookDefinition {

	@Given("^Mon and chan wants to get married$")
	public void mon_and_chan_wants_to_get_married() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Mon and chan wants to get married");
	}

	@When("^Mon and chan happily married and wanted to have baby$")
	public void mon_and_chan_happily_married_and_wanted_to_have_baby() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Mon and chan happily married and wanted to have baby");
	}

	@Then("^Mon and chan adopted baby$")
	public void mon_and_chan_adopted_baby() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Mon and chan adopted baby");
	}
}
