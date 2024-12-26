package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@name='search']")
	WebElement searchField;

	

	@FindBy(xpath = "//input[@name='search']")
	WebElement SearchParticularitem;


	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement SearchButton;
	


	public void clickSearchField() {
		searchField.click();
	}
	
	
	public void SearchParticularitem(String item) {
		SearchParticularitem.sendKeys(item);
	}
	
	
	public void clickSearchButton() {
		SearchButton.click();
	}
	

}
	