package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionDefinition {
	
	
	@Given("I have (\\d+) laptop$")
	public void I_have_1_laptop(int count) {
		System.out.println("Laptop  count" +count);
	}
	
   @Given("^I got (\\d+\\.\\d+) GPA$")
   public void I_got_GPA(float num) throws Throwable {
	   System.out.println("GPA" +num);
   }
  
    @Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
    public void elder_one(String arg1, String arg2, String arg3) throws Throwable {
    	System.out.println(arg1 +"is elder to "+ arg2 +"and"+	 arg3);
    }
}
