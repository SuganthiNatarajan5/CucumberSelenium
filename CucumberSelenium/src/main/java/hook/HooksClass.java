package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {

	@Before(order=1)
	public void beforeMarriage() {
		System.out.println("Mon had control issues and chan was gay");
		
	}
	 @After(order=1)
	public void afterMarriage() {
		 System.out.println("They both loved each other");
		
	}
	 
	 @Before (order=0)
		public void beforetobeforeMarriage() {
			System.out.println("Mon and chan are good friends");
			
		}
		 @After(order=0)
		public void aftetoafterrMarriage() {
			 System.out.println("They grow old together");
			
		}
}
