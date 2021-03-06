package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By signIn=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("div[class='pull-left'] h2");
	By popup=By.xpath("//button[contains(text(),'NO THANKS')]");
	public LandingPage(WebDriver driver) {
	
		this.driver=driver;
	}

	public WebElement getLogin() {
		
		return  driver.findElement(signIn);
		
		 
		}
public WebElement getTitle() {
		
		return driver.findElement(title);
	}

public WebElement getpopup() {
	
	return driver.findElement(popup);
}

public List<WebElement> getPopUpSize() {
	
	return driver.findElements(popup);
}
}
