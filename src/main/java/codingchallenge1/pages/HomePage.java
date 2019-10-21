package codingchallenge1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import codingchallenge1.base.Base;

public class HomePage extends Base {
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement location;

	@FindBy(id="search-submit")
	WebElement search;

	

	public HomePage() {
	PageFactory.initElements(driver, this);
	
	}
	
	public SearchPage searchLocation() {
		location.sendKeys("London");
		search.click();
		return new SearchPage();
	}
}
