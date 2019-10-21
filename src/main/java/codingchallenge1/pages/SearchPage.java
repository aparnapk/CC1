package codingchallenge1.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import codingchallenge1.base.Base;

public class SearchPage extends Base {
	@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']//li/descendant::a[@class='listing-results-price text-price']")
	List<WebElement> price;
	List<Integer> pricelist = new ArrayList<Integer>();

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}


	public void printPrice() {
		for(WebElement propertyPrice:price) {

			pricelist.add(Integer.parseInt(propertyPrice.getText().replaceAll("[^0-9]", "")));
		}
		System.out.println("List of the Properties Price in decreasing order---->");
		Collections.sort(pricelist, Collections.reverseOrder());
		System.out.println(pricelist);
	}
	public PropertyPage clickOnProperty() {
		for(int i=0;i<price.size();i++) {
			price.get(4).click();
			break;
		}
		return new PropertyPage();
	}
}
