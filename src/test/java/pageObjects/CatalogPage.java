package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {

	public WebDriver driver;

	public CatalogPage(WebDriver rdriver) 
	{
		driver = rdriver;
		
		PageFactory.initElements(driver, this);
	}
	
	By linkCatalog_menu = By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[2]/a/p[contains(text(),'Catalog')]");
	
	By linkCatalog_menuItem = By.xpath("//a[@href='/Admin/Product/List']/p[contains(text(),'Products')]");
	
	
	public String getPageTitle() 
	{
		return driver.getTitle();
	}
	
	public void clickOnCatalogMenu()
	{
		driver.findElement(linkCatalog_menu).click();
	}
	
	public void clickOnCatalogMenuItem()
	{
		driver.findElement(linkCatalog_menuItem).click();
		
	}
}
