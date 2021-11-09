package Search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerTab {
	
	public WebDriver driver;
	
	By srtab=By.xpath("//div[@class='input-wrap']/input");
	
	By srIcon=By.xpath("//div[@class='input-wrap']/button");
	
	By txt=By.xpath("//div[@class='product-preview-content']");
	
	public SerTab(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement srch()
	{
		return driver.findElement(srtab);
	}
	
	public WebElement ico()
	{
		return driver.findElement(srIcon);
	}
	
	public List<WebElement> Testure()
	{
		List<WebElement> name=driver.findElements(srIcon);
		return name;
	}

}
