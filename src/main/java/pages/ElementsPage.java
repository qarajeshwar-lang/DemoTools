package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    private final By textBoxMenu = By.xpath("//span[text()='Text Box']");
    private final By radioButtonMenu = By.xpath("//span[text()='Radio Button']");

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public TextBoxPage clickTextBox() {
        click(textBoxMenu);
        return new TextBoxPage(driver);
    }
    public RadioButtonPage clickRadioButton() {
        click(radioButtonMenu);
        return new RadioButtonPage(driver);
    }
}