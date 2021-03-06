package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;

import resources.base;

public class validateTitle extends base {
	public WebDriver  driver;
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@Test
	public void basepage2() {

		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "Featured Courses123");
		Log.info("successfully validated text message");
	}

	@AfterTest
	public void windowClose() {

		driver.close();
	}

	@BeforeTest
	public void browserOpen() throws IOException {
		driver = browserInitialize();
		Log.info("driver is initialized");
		driver.get(p.getProperty("url"));
		Log.info("Navigated to homepage");
		
	}

}
