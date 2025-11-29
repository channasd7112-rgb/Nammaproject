package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	  public Loginpage(WebDriver driver){
			this.driver=driver;
		}
	  
	 By mail= By.xpath("//input[@id='input-email']");
	 By pass= By.xpath("//input[@id='input-password']");
	 By lb= By.xpath("//input[@value='Login']");
	  
	  
	  
	  public void emailID() {
		  driver.findElement(mail).sendKeys("channasd7112@gmail.com");
	  }
	public void eassword() {
		driver.findElement(pass).sendKeys("Channa@112");
	  }
	public void loginbutton() {
		driver.findElement(lb).click();
	}
	  
	
}
