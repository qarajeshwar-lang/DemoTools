package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By elementsCard = By.xpath("//h5[text()='Elements']");
    private final By formsCard = By.xpath("//h5[text()='Forms']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isElementsCardDisplayed() {
        return isDisplayed(elementsCard);
    }

    public ElementsPage clickElements() {
        click(elementsCard);
        return new ElementsPage(driver);
    }
}
