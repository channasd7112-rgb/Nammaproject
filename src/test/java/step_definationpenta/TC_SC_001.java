package step_definationpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.searchpage;

public class TC_SC_001 {
	WebDriver driver;
	searchpage sc;
	@Given("User has logged in")
	public void user_has_logged_in() throws InterruptedException {
	    
		driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=product/search");
		driver.manage().window().maximize();
	Thread.sleep(5000);
	 sc = new searchpage(driver);
	}

	@When("User enters a valid product name in the search box")
	public void user_enters_a_valid_product_name_in_the_search_box() {
	   sc.searchbox();
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	   sc.searchbutton();
	}

	@Then("User should see the searched product displayed")
	public void user_should_see_the_searched_product_displayed() {
	    Assert.assertEquals(driver.getTitle(), "Search - macbook");
	    driver.close();
	}
}
