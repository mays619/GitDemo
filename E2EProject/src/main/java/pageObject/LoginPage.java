package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By username=By.cssSelector("input#user_email");
	By password=By.cssSelector("input#user_password");
	By login=By.cssSelector("input[type='submit']");
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement username() {
		
		return driver.findElement(username);
	}
public WebElement password() {
		
		return driver.findElement(password);
		
	}
public WebElement login() {
	
	return driver.findElement(login);
}
}

