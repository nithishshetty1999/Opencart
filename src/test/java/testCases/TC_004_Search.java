package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass {
    @Test(groups = {"Sanity", "Master"})
    public void verify_Search() {
        // Login
      

        // Search
        SearchPage se = new SearchPage(driver);
        se.clickSearchField();
        se.SearchParticularitem(p.getProperty("item")); // Ensure 'item' exists in the properties file
        se.clickSearchButton();
    }
}
