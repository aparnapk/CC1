package codingchallenge1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import codingchallenge1.base.Base;

public class PropertyPage extends Base {

	@FindBy(xpath="//h4[@class='ui-agent__name']")
	WebElement name;
	
	@FindBy(xpath="//h2[contains(@class,'address')]")
	WebElement address;
	
	@FindBy(xpath="//div[contains(@class,'logo')]/img")
	WebElement logo;
	
	@FindBy(xpath="//span[text( )='Call ']//ancestor::a")
	WebElement phon;

	public PropertyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void printPropertyDetails() {
	System.out.println("Agent name- "+name.getText());
	System.out.println("Agent address- "+address.getText());
	System.out.println("Agent imglogo- "+name.getAttribute("alt"));
	System.out.println("Agent mob- "+phon.getAttribute("href").replace("tel:",""));
	
	}

	public void clickOnAgentName() {
		name.click();
	}
}
