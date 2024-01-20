package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedSearchLink_Steps {
	@Given("I am on Advanced Search Page")
	public void i_am_on_advanced_search_page() {
	  System.out.println("I am on Advanced Search Page");
	}

	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() {
		 System.out.println("I click on Ebay logo");
	}

	@Then("I navigate to Home Page")
	public void i_navigate_to_home_page() {
		 System.out.println("I navigate to Home Page");
	}
}
