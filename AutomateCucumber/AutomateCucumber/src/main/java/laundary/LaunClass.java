package laundary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunClass {
	
	public WebDriver driver;
	
	By loun=By.xpath("//div[@class='header-main-menu']/div[3]/a");
	
	By loan=By.xpath("//a[@data-action-detail='How to Do Laundry']");
	
	public LaunClass(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement lound()
	{
		return driver.findElement(loun);
	}
	
	public WebElement loundar()
	{
		return driver.findElement(loan);
	}
}
