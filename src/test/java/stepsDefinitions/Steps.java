package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;

	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");

	//	WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		lp = new LoginPage(driver);


	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) 
	{
		driver.get(url);
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) 
	{
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@And("Click on Login")
	public void click_on_Login() 
	{
		lp.clickLogin();

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title)
	{
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();

			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {

		lp.clickLogOut();

		Thread.sleep(5000);
	}

	@And("Close browser")
	public void close_browser() 
	{
		driver.quit();
	}

}
