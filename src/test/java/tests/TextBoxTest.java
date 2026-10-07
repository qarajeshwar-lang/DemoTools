package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void verifyTextBoxFormSubmission() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = homePage.clickElements();
        TextBoxPage textBoxPage = elementsPage.clickTextBox();

        textBoxPage.enterFullName("Rajeshwar Kamble");
        textBoxPage.enterEmail("john.smith@example.com");
        textBoxPage.enterCurrentAddress("Pune, Maharashtra");
        textBoxPage.enterPermanentAddress("Mumbai, Maharashtra");
        textBoxPage.clickSubmit();

        Assert.assertTrue(textBoxPage.getOutputName().contains("John Smith"),
                "Name is not shown correctly in the output");
        Assert.assertTrue(textBoxPage.getOutputEmail().contains("john.smith@example.com"),
                "Email is not shown correctly in the output");
    }
}