package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver driver;

	public AddCustomerPage(WebDriver rdriver) 
	{
		driver = rdriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	// By linkCustomers_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	
	By linkCustomers_menu = By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[4]/a/p[contains(text(),'Customer')]");
	
	
//	By linkCustomers_menuItem = By.xpath("//span[@class='menu-item-title'][contains(text(),'Customer')]");
	
	By linkCustomers_menuItem = By.xpath("//a[@href='/Admin/Customer/List']/p[contains(text(),'Customer')]");
	
	By btnAddNew = By.xpath("//a[@class='btn btn-primary' and @href='/Admin/Customer/Create']"); 
	
//	By txtEmail = By.xpath("//input[@id='Email']");
	
//	By txtPassword = By.xpath("//input[@id='Password']");
	
	By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	
	By lstitemAdministrators = By.xpath("//li[contains(text(),'Administrators')]");
	
	By listitemRegistered = By.xpath("//li[contains(text(),'Registered')]");
	
	By listitemGuests = By.xpath("//li[contains(text(),'Guests')]");
	
	By listitemVendors = By.xpath("//li[contains(text(),'Vendors')]");
	
	By dropmgrofVendor = By.xpath("//*[@id='VendorId']");
	
	By radioMaleGender = By.id("Gender_Male");
			
	By radioFemaleGender = By.id("Gender_Female");
	
	By txtFirstName = By.xpath("//input[@id='FirstName']");
	
	By txtLastName = By.xpath("//input[@id='LastName']");
	
	By txtDob = By.xpath("//input[@id='DateOfBirth']");
	
	By txtCompanyName = By.xpath("//input[@id='Company']");
	
	By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");
	
	By btnSave = By.xpath("//button[@name='save']");
	
	
	// Actions Methods
	
	
	public String getPageTitle() 
	{
		return driver.getTitle();
	}
	
	public void clickOnCustomersMenu()
	{
		driver.findElement(linkCustomers_menu).click();
	}
	
	public void clickOnCustomersMenuItem()
	{
		driver.findElement(linkCustomers_menuItem).click();
	}
	
	public void clickOnAddnew()
	{
		driver.findElement(btnAddNew).click();
	}
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.clear();
		
		txtPassword.sendKeys(password);
	}
	
	public void setCustomerRoles(String role) throws InterruptedException
	{
		if(!role.equals("Vendors"))
		{
//			driver.findElement(By.xpath("//id=\"SelectedCustomerRoleIds_taglist\"]/li/span))
		}
		
		driver.findElement(txtCustomerRoles).click();
		
		WebElement listItem;
		
		Thread.sleep(3000);
		
		
	}
	
	public void setManagerOfVendor(String vendor)
	{
	//	driver.findElement(txtPassword).sendKeys(password);
	}
}
