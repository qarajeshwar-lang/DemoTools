package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {

    private final By yesRadio = By.cssSelector("label[for='yesRadio']");
    private final By impressiveRadio = By.cssSelector("label[for='impressiveRadio']");
    private final By resultText = By.cssSelector(".text-success");

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public void selectYes() {
        click(yesRadio);
    }

    public void selectImpressive() {
        click(impressiveRadio);
    }

    public String getResultText() {
        return getText(resultText);
    }
}