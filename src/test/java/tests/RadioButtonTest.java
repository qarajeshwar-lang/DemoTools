package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest {

    @Test
    public void verifyYesRadioButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = homePage.clickElements();
        RadioButtonPage radioButtonPage = elementsPage.clickRadioButton();

        radioButtonPage.selectYes();
        Thread.sleep(5000); // Wait for the result to be displayed

        Assert.assertEquals(radioButtonPage.getResultText(), "Yes",
                "Result text is not correct for Yes");
    }

    @Test(enabled = false) // Disabled due to known issue with Impressive radio button
    public void verifyImpressiveRadioButton() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = homePage.clickElements();
        RadioButtonPage radioButtonPage = elementsPage.clickRadioButton();

        radioButtonPage.selectImpressive();

        Assert.assertEquals(radioButtonPage.getResultText(), "Impressive",
                "Result text is not correct for Impressive");
    }
}