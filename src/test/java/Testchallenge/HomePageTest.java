package Testchallenge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import codingchallenge1.base.Base;
import codingchallenge1.pages.HomePage;
import codingchallenge1.pages.PropertyPage;
import codingchallenge1.pages.SearchPage;

public class HomePageTest extends Base{
	HomePage home;
	SearchPage searchpa;
	PropertyPage prope;
	HomePageTest (){
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		home = new HomePage();
		searchpa=new SearchPage();
		prope=new PropertyPage();
	}
	
	@Test()
	public void step1() throws InterruptedException {
		home.searchLocation();
		searchpa.printPrice();
		searchpa.clickOnProperty();
		Thread.sleep(3000);
		prope.printPropertyDetails();
		prope.clickOnAgentName();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
