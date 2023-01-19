package hookStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;




public class HooksBasedSteps{


	public WebDriver driver;

	public LoginPage lp;

	public AddCustomerPage acp;
	
	
	
	@Before
	public void browserSetup()
	{
		System.out.println("Inside browser setup");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
	//	WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		lp = new LoginPage(driver);
		
		acp = new AddCustomerPage(driver);

	}
	
	

	@Given("User opens URL {string}")
	public void user_opens_URL(String url) 
	{
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) 
	{
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@And("Click on Login")
	public void click_on_Login() throws InterruptedException 
	{
		lp.clickLogin();

		Thread.sleep(2000);
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

	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {

	//	acp = new AddCustomerPage(driver);

		Assert.assertEquals("Dashboard / nopCommerce administration", acp.getPageTitle());
		
	}

	
	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {

		lp.clickLogOut();

		Thread.sleep(5000);
	}
	
	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {

		Thread.sleep(3000);

		acp.clickOnCustomersMenu();
	}

	@And("click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws InterruptedException {

		Thread.sleep(3000);

		acp.clickOnCustomersMenuItem();
	}

	@And("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException 
	{
		Thread.sleep(3000);
		
		acp.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() 
	{
	   Assert.assertEquals("Add a new customer / nopCommerce administration", acp.getPageTitle());
	   
	   
	}

	@After
	public void tearDown()
	{
		System.out.println("Inside teardown");
		
		driver.quit();
	}
}