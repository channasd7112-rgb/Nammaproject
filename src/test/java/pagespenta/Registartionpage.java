package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registartionpage {
//constructor
	WebDriver driver;
	public Registartionpage(WebDriver driver)
	{
		this.driver=driver;
	}
		//locator
	By fname=By.xpath("//input[@id='input-firstname']");
	By lname=By.xpath("//input[@id='input-lastname']");
	By email=By.xpath("//input[@id='input-email']");
	By tel= By.xpath("//input[@id='input-telephone']");
	By pass= By.xpath("//input[@id='input-password']");
	By cpass=By.xpath("//input[@id='input-confirm']");
	By rb=By.xpath("//label[normalize-space()='Yes']");
	By ppc=By.xpath("//input[@name='agree']");
	By contiueb=By.xpath("//input[@value='Continue']");
	
	
	
	
	//action methods
	
 public  void Firstname() {
		driver.findElement(fname).sendKeys("channabasav");
		
	}
public  void Lastname() {
    	driver.findElement(lname).sendKeys("SD");
	}
public   void EmailID() {
    	driver.findElement(email).sendKeys("channa" + System.currentTimeMillis() + "@gmail.com");
    }
public   void Telephone() {
    	driver.findElement(tel).sendKeys("7676831325");
    }
public   void Password() {
    	driver.findElement(pass).sendKeys("Channa@7112");
    }
public   void ConfirmPassword() {
    	driver.findElement(cpass).sendKeys("Channa@7112");
    }
public   void radionbuttonno() {
    	driver.findElement(rb).click();
    }
public  void privacypolicycheckbox() {
    	driver.findElement(ppc).click();
    }
public  void continuebutton() {
    	driver.findElement(contiueb).click();
    }
    
}
