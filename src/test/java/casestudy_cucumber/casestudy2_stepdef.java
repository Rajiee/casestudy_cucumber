package casestudy_cucumber;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_package.UtilityClass;

public class casestudy2_stepdef {
	WebDriver driver;
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		//driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
		System.out.println("user must be registered..");
		//driver.findElement(By.partialLinkText("SignIn")).click();
	    
	   
	}

	@When("^User enters the below credentials$")
	public void user_enters_the_below_credentials(DataTable dt) throws Throwable {
		 List<Map<String,String>> credential=dt.asMaps(String.class, String.class);
		    for(int i=0;i<credential.size();i++)
		    {
		    	driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
		    	driver.findElement(By.partialLinkText("SignIn")).click();
		    	 driver.findElement(By.name("userName")).sendKeys(credential.get(i).get("username"));
		    	 driver.findElement(By.id("password")).sendKeys(credential.get(i).get("password"));
		    	 driver.findElement(By.name("Login")).click();
		    }
	   
	}

	@Then("^User must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		//driver.findElement(By.name("Login")).click();
		System.out.println("logged in.....");
	    
	}



}
