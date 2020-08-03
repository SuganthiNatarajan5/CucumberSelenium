package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExampleKeywordDef {
	WebDriver driver;

	@Given("^: He is on login page$")
	public void he_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("^: He enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void he_enters_the_username_and_password(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^: He Clicks on the submit button$")
	public void he_Clicks_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	   
	}

}
