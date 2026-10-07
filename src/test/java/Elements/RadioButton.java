package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton {

	@Test
	public void clickRadioButton() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.findElement(By.id("yesRadio")).click();
		Assert.assertTrue(driver.findElement(By.id("yesRadio")).isSelected());
		String successmsg = driver.findElement(By.className("mt-3")).getText();
		System.out.println(successmsg);
		Assert.assertEquals(successmsg, "You have selected Yes");
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='text-success']")).isDisplayed());

	}
}
