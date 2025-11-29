package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchpage {
	WebDriver driver;
	public searchpage(WebDriver driver){
		this.driver=driver;
	}
	
	By sec=By.xpath("//input[@id='input-search']");
	By secb=By.xpath("//input[@id='button-search']");
	
	public void searchbox() {
		driver.findElement(sec).sendKeys("macbook");
		
	}
	public void searchbutton() {
		
		driver.findElement(secb).click();
	}
	
}
