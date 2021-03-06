package StepDefinations;

//import org.junit.Assert;
//import org.testng.asserts.SoftAssert;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
//import pageObject.portalHomePage;
import resources.base;

public class stepDefination extends base {

	@Given("Initalize the browser with chrome")
	public void initalize_the_browser_with_chrome() throws Throwable {

		driver = browserInitialize();
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {

		driver.get(string);
	}

	@Given("Click on Login link in home page to land on secure sign in Page")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {

		LandingPage l = new LandingPage(driver);
		if (l.getPopUpSize().size() > 0) {
			l.getpopup().click();
		}
		l.getLogin().click();

	}

	@When("User enters (.+) and (.+) and logs in")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {

		LoginPage lp = new LoginPage(driver);
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.login().click();
	}

	@Then("close the browser")
	public void close_the_browser() throws Throwable {
		driver.quit();

	}

}
