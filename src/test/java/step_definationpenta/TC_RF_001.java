package step_definationpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.Registartionpage;



public class TC_RF_001 {
	public static WebDriver driver;
	Registartionpage rg;
	@Given("User has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() throws InterruptedException {
	    
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		rg = new Registartionpage(driver);
		Hooks.driver=driver;
	}

	@When("User enters valid First name")
	public void user_enters_valid_first_name() {
		rg.Firstname();
	}

	@When("User enters valid Last name")
	public void user_enters_valid_last_name() {
	  rg.Lastname();
	}

	@When("User enters valid Email ID")
	public void user_enters_valid_email_id() {
	  rg.EmailID();
	}

	@When("User enters valid Telephone")
	public void user_enters_valid_telephone() {
	   rg.Telephone();
	}

	@When("User enters valid Password")
	public void user_enters_valid_password() {
	   rg.Password();
	}

	@When("User enters valid Confirm Password")
	public void user_enters_valid_confirm_password() {
	  rg.ConfirmPassword();
	}

	@When("User clicks on radion button no")
	public void user_clicks_on_radion_button_no() {
	    rg.radionbuttonno();
	}

	@When("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
	  rg.privacypolicycheckbox();
	}

	@When("User cliks on continue button")
	public void user_cliks_on_continue_button() {
	   rg.continuebutton();
	}

	@Then("User should be Registered")
	public void user_should_be_registered() {
	Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
		driver.close();
	}


}
