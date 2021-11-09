package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Products.product;
import Search.SerTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import intro.Base;
import laundary.LaunClass;

public class stepDefination extends Base {



	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver=setthings();

	}

	@Given("^User will land to Home page \"([^\"]*)\" and need to hover on Shop Products$")
	public void user_will_land_to_Home_page_and_need_to_hover_on_Shop_Products(String arg1) throws Throwable {
		driver.get(arg1);
		product pro=new product(driver);
		Actions act=new Actions(driver);
		WebElement po=pro.name();
		act.moveToElement(po).perform();
		Thread.sleep(8000L);
		pro.password().click();
		if(pro.clicked().isDisplayed())
		{
			System.out.println("Present");
		}

	}


	@Then("^User will land to Home page \"([^\"]*)\"$")
	public void user_will_land_to_Home_page(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^Enter \"([^\"]*)\" in Search Tab and Verify it$")
	public void enter_in_Search_Tab_and_Verify_it(String arg1) throws Throwable {
		SerTab tb=new SerTab(driver);
		tb.srch().sendKeys(arg1);
		tb.ico().click();
		Thread.sleep(5000L);
		if(tb.Testure().contains(arg1))
		{
			System.out.println("Antibacterial is present on page");
		}

	}
	
	@Then("^User will land to Home page given \"([^\"]*)\"$")
	public void user_will_land_to_Home_page_given(String arg1) throws Throwable {
		driver.get(arg1);
	}



	@Then("^Click on How to do loundary then verify if How to Read Laundry Symbol is present$")
	public void click_on_How_to_do_loundary_then_verify_if_How_to_Read_Laundry_Symbol_is_present() throws Throwable {
		LaunClass lc=new LaunClass(driver);
		Actions act=new Actions(driver);
		WebElement por=lc.lound();
		act.moveToElement(por).perform();
		Thread.sleep(8000L);
		lc.loundar().click();
	}


}
