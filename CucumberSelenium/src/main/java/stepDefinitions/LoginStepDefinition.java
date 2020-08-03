package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^: User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("^: User enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   
	}

	@When("^: Clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
	    
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^: user should be get into the login page$")
	public void user_should_be_get_into_the_login_page() throws Throwable {
		
		boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    Assert.assertTrue(status);
	    driver.quit();
	}

}
