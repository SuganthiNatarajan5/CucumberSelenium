package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("^User is entering Url$")
	public void user_is_entering_Url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	
	   
	}

	@When("^user is typeing the search term \"([^\"]*)\"$")
	public void user_is_typeing_the_search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^user should see the result$")
	public void user_should_see_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean status= driver.findElement(By.partialLinkText("click")).isDisplayed();
	 if (status) {
		System.out.println("Result");
	}
	 driver.quit();
	}

}
