package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage {

    // Input fields
    private final By fullNameField = By.id("userName");
    private final By emailField = By.id("userEmail");
    private final By currentAddressField = By.id("currentAddress");
    private final By permanentAddressField = By.id("permanentAddress");
    private final By submitButton = By.id("submit");

    // Output shown after submit
    private final By outputName = By.cssSelector("#output #name");
    private final By outputEmail = By.cssSelector("#output #email");

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void enterFullName(String name) {
        type(fullNameField, name);
    }

    public void enterEmail(String email) {
        type(emailField, email);
    }

    public void enterCurrentAddress(String address) {
        type(currentAddressField, address);
    }

    public void enterPermanentAddress(String address) {
        type(permanentAddressField, address);
    }

    public void clickSubmit() {
        click(submitButton);
    }

    public String getOutputName() {
        return getText(outputName);
    }

    public String getOutputEmail() {
        return getText(outputEmail);
    }
}
