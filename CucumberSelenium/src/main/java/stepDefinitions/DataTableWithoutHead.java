package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithoutHead {
	WebDriver driver;
	@Given("^: You are  on login page$")
	public void you_are_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("^: You enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable dataTable) throws Throwable {
		
		List<String> credentials=dataTable.asList(String.class);
		String userName = credentials.get(0);
		String password = credentials.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);	
	  
	    
	}

	@When("^: You Click on the submit button$")
	public void you_Click_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}

}
