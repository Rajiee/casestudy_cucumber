package casestudy_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_package.UtilityClass;

public class casestudy1_stepdef {
	WebDriver driver;
	@Given("^User must not be logged in$")
	public void user_must_not_be_logged_in() throws Throwable {
		driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	    System.out.println("user must not be logged in");
	}

	@When("^user clicks on the signup button$")
	public void user_clicks_on_the_signup_button() throws Throwable {
		driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String arg1) throws Throwable {
		 driver.findElement(By.id("userName")).sendKeys(arg1);
	    
	}

	@When("^user enters the firstname as \"([^\"]*)\"$")
	public void user_enters_the_firstname_as(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^user enters the lastname as \"([^\"]*)\"$")
	public void user_enters_the_lastname_as(String arg1) throws Throwable {
		 driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^user enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String arg1) throws Throwable {
		 driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^user enters the confirm password as \"([^\"]*)\"$")
	public void user_enters_the_confirm_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("pass_confirmation")).sendKeys(arg1);
	}

	@When("^user enters the gender as \"([^\"]*)\"$")
	public void user_enters_the_gender_as(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("^user enters the emailid as \"([^\"]*)\"$")
	public void user_enters_the_emailid_as(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^user enters the phoneno as \"([^\"]*)\"$")
	public void user_enters_the_phoneno_as(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^user enters the dob as \"([^\"]*)\"$")
	public void user_enters_the_dob_as(String arg1) throws Throwable {
		 driver.findElement(By.id("dob")).sendKeys(arg1);
	}

	@When("^user enters the address as \"([^\"]*)\"$")
	public void user_enters_the_address_as(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^user selects the security question \"([^\"]*)\"$")
	public void user_selects_the_security_question(String arg1) throws Throwable {
		driver.findElement(By.name("securityQuestion")).sendKeys(arg1);
	}

	@When("^user enters the answer as \"([^\"]*)\"$")
	public void user_enters_the_answer_as(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(arg1);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
	}

	@Then("^Thus user has registered successfully$")
	public void thus_user_has_registered_successfully() throws Throwable {
	   System.out.println("Successfully registered...");
	}


}
