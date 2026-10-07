package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TextBox {
	@Parameters({"Fullname","Email","CurrentAddress","PermanentAddress"})
	@Test
	public void enterText(String fullname,String email,String currentAddress,String permanentAddress) {
		WebDriver driver = new ChromeDriver();
		//open the browser and navigate to the URL
		driver.get("https://demoqa.com/text-box");
		//enter the full name in the text box
		driver.findElement(By.id("userName")).sendKeys(fullname);
		driver.manage().window().maximize();
		//System.out.println("Entered Name: " + fullname);
		
		//enter the email in the text box
		driver.findElement(By.id("userEmail")).sendKeys(email);
		//System.out.println("Entered Email: " + email);
		
		//enter the current address in the text box
		driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
		//System.out.println("Entered Current Address: " + currentAddress);
		//enter the permanent address in the text box
		driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
		//System.out.println("Entered Permanent Address: " + permanentAddress);
		
		//click on the submit button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement submitBtn = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", submitBtn);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();
		//driver.findElement(By.id("submit")).click();
		
		//Now we will do assertion to verify that the text has been entered correctly
		String name = driver.findElement(By.id("name")).getText();
		Assert.assertEquals(name, "Name:" + fullname);
		System.out.println(name);
		String emailText = driver.findElement(By.id("email")).getText();
		Assert.assertEquals(emailText, "Email:" + email);
		System.out.println(emailText);
		String currentAddressText = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		Assert.assertEquals(currentAddressText, "Current Address :" + currentAddress);
		System.out.println(currentAddressText);
		String permanentAddressText = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		Assert.assertEquals(permanentAddressText, "Permananet Address :" + permanentAddress);
		System.out.println(permanentAddressText);
		driver.quit();
	}

}
