package step_definationpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.Loginpage;

public class TC_LF_001 {
public  static WebDriver driver;
 Loginpage lb;
 @Given("User has opened the browser and launched  application")
 public void user_has_opened_the_browser_and_launched_application()throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	  lb = new Loginpage(driver);
	  Hooks.driver=driver;
	}

 @When("User enters the valid Email ID")
 public void user_enters_the_valid_email_id() {
	   lb.emailID();
	}

 @When("User enters the valid Password")
 public void user_enters_the_valid_password() {
	    lb.eassword();
	}

 @When("User clicks on the Login button")
 public void user_clicks_on_the_login_button() {
	    lb.loginbutton();
	}

 @Then("User should be logged the successfully")
 public void user_should_be_logged_the_successfully() {
		 Assert.assertEquals(driver.getTitle(),"My Account");
		 driver.close();
	}


}
