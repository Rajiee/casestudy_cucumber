package casestudy_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_package.UtilityClass;

public class casestudy3_stepdef {
	WebDriver driver;
	@Given("^User must goto login$")
	public void user_must_goto_login() throws Throwable {
	   
		driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	
	}

	@When("^User enters the valid login credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_valid_login_credentials_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		System.out.println(arg1);
		System.out.println(arg2);
		
	}

	@When("^user enters into the home page$")
	public void user_enters_into_the_home_page() throws Throwable {
	    
		driver.findElement(By.name("Login")).click();
	   
	}

 

@When("^user enters product to be bought in search tab as \"([^\"]*)\"$")
	public void user_enters_product_to_be_bought_in_search_tab_as(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.name("ShippingAdd")).sendKeys("Chennai");
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
		
	}

	@Then("^user purchases the product$")
	public void user_purchases_the_product() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		
	}
}
