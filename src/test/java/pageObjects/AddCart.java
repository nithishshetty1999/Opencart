package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddCart extends BasePage{

	public AddCart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement AddCart;
	
	
	public void AddtoCart() {
	    AddCart.click(); // Perform the click action
	}
}
