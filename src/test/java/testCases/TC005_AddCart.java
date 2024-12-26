package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AddCart;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC005_AddCart extends BaseClass {

    @Test(groups = {"Sanity", "Master"})
    public void Add_Cart() {
        
        // Search for the item
        SearchPage se = new SearchPage(driver);
        se.clickSearchField();
        se.SearchParticularitem(p.getProperty("item")); // Ensure 'item' exists in the properties file
        se.clickSearchButton();
        
        // Scroll down by a specific amount of pixels (for example, 500px)
        scrollDown(driver, 500);
        
        // Add item to cart
        AddCart ac = new AddCart(driver);
        ac.AddtoCart();
    }

    // Scroll down by a specific number of pixels
    private void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }
}
