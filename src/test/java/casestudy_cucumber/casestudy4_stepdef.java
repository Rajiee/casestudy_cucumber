package casestudy_cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class casestudy4_stepdef {
	 public static WebDriver driver;
	   public static WebDriverWait wait;
	@Given("^Open the TestMeApp$")
	public void open_the_TestMeApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2B.02.14\\Documents\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver() ;
	     driver.get("http://10.232.237.143:443/TestMeApp");
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	       
	       wait=new WebDriverWait(driver,120);
	}

	@Given("^Login to the TestMeApp$")
	public void login_to_the_TestMeApp() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      
	      driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("^Inputs \"([^\"]*)\" and \"([^\"]*)\"$")
	public void inputs_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	       driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^Click On login button$")
	public void click_On_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	}

	@Given("^Alex has registered to the TestMeApp$")
	public void alex_has_registered_to_the_TestMeApp() throws Throwable {
	   System.out.println("registration successful....");
	}

	@When("^Alex searches for a particular product like headphones$")
	public void alex_searches_for_a_particular_product_like_headphones() throws Throwable {
		  driver.findElement(By.name("products")).sendKeys("HeadPhone");
		     driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();
	}

	@When("^try to proceed to payment without adding to the cart$")
	public void try_to_proceed_to_payment_without_adding_to_the_cart() throws Throwable {
		   driver.findElement(By.partialLinkText("Add to cart")).click();
		    driver.findElement(By.partialLinkText("Cart")).click();
		    
		    driver.findElement(By.xpath("//input[@value='Remove']")).click();
		  
		    
	}

	@Then("^the TestMeApp doesnot show the cart item$")
	public void the_TestMeApp_doesnot_show_the_cart_item() throws Throwable {
		 if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
		      driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		      System.out.println("user can proceed to payment");
		       }
		     else {
		      System.out.println("cart icon not found");
		       }  
		  
	}


	}



