
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyElementsCardDisplayed() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000); 
        Assert.assertTrue(homePage.isElementsCardDisplayed(), "Elements card is not displayed.");
    }

    @Test
    public void verifyNavigationToElements() {
        HomePage homePage = new HomePage(driver);
        homePage.clickElements();
        Assert.assertTrue(driver.getCurrentUrl().contains("elements"), "Did not navigate to Elements page.");
    }
}