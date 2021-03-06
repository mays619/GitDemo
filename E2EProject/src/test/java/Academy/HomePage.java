package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(HomePage.class);

@Test(dataProvider="getData")
	public void basepage1(String Username, String Password) throws InterruptedException {

		driver.get(p.getProperty("url"));
		Log.info("Navigated to homepage");
		LandingPage l = new LandingPage(driver);
		l.getLogin();
		LoginPage lp=new LoginPage(driver);
		lp.username().sendKeys(Username);
		lp.password().sendKeys(Password);
		lp.login().click();
}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "abc@gmal.com";
		data[0][1] = "123456";

		data[1][0] = "bcd@gmal.com";
		data[1][1] = "23415";

		return data;
	}

	@AfterTest
	public void windowClose() {

		driver.close();
	}

	@BeforeTest
	public void browserOpen() throws IOException {

		driver = browserInitialize();
		Log.info("Driver is initialized");

	}

}
