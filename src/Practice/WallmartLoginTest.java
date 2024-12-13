package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WallmartLoginTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // This object class is used to open Firefox.
		driver.get("https://www.walmart.ca"); // This get method used to open specific web-site.

		//Hover Test:
		WebElement button = driver.findElement(By.xpath("//span[@data-automation='sign-in-message']"));
		Actions signin = new Actions(driver);

		Thread.sleep(3000);
		signin.moveToElement(button).build().perform();

		//Login Test:
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//span[@data-automation='sign-in-message']"));
		click.click();
		WebElement we = driver.findElement(By.id("username"));
		we.sendKeys("sjkfhskfhsfk");
		WebElement we1 = driver.findElement(By.id("password"));
		we1.sendKeys("jfhsdkfjshfk");
		WebElement we2 = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/button[1]"));
		we2.click();

		//Error Test Message:
		Thread.sleep(3000);
		String ExpectedEM = "Please enter a valid email address or phone number.";
		String ActualEM = driver.findElement(By.xpath("//span[@class='css-1lliris erl5ymg4']")).getText();
		System.out.println(ActualEM);

		if (ExpectedEM.equals(ActualEM)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}
}
