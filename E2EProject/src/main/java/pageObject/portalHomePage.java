package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {

	
	public WebDriver driver;
	
	By searchbox=By.name("query");
	
	
	
	public portalHomePage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getSearchBox() {
	
		return driver.findElement(searchbox);
	}
	}
	

