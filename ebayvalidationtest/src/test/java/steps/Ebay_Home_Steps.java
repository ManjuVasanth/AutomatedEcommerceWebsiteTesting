package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Home_Steps {
	
	WebDriver driver;
	
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
	    //System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver-win64/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.partialLinkText("ebayadvsearch")).click();
		
	}

	@Then("I navigate to Advanced Search Page")
	public void i_navigate_to_advanced_search_page() {
		 String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		 String actualUrl = driver.getCurrentUrl();
		 if(!expUrl.equals(actualUrl)) {
			 fail("Page doesnot navigate to expected page");
		 }
	}
   @When("I search for {string}")
   public void i_search_for_iphone_11(String str) {
	   driver.findElement(By.id("gh-ac")).sendKeys(str);
	   driver.findElement(By.id("gh-btn")).click();
	   
   }
   @Then("I validate atleast 1000 items are present")
   public void i_validate_atleast_1000_items_are_present() {
	   
   }
}
