package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeadDef {
	WebDriver driver;
	@Given("^: we are  in login page$")
	public void we_are_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^: we enter the below credentials$")
	public void we_enter_the_below_credentials(DataTable dataTable) throws Throwable {
		List<Map<String, String>> keyValue= dataTable.asMaps(String.class, String.class);
			String userName=keyValue.get(0).get("userName");
			String password=keyValue.get(0).get("password");
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);	
	}

	@When("^: We click on the submit button$")
	public void we_click_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	    
	}

}
