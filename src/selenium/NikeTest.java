package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	// Home Work
	// Task:
	// Hover On Men
	// Size and Text.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");

		/*
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//div[@data-pre='DesktopLoginButtons']//button/span")).click();
		 * driver.findElement(By.name("emailAddress")).sendKeys("jemsnroy1023@gmail.com"
		 * ); driver.findElement(By.name("password")).sendKeys("Sarang123@");
		 * driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		 * driver.findElement(By.xpath("//input[@type='button']")).click();
		 */
		WebElement Men = driver.findElement(By.linkText("Men"));
		Actions hover = new Actions(driver);
		hover.moveToElement(Men).build().perform();

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("(//div[contains(@id,'DesktopMenu-0-1')]/div)/div[2]/a"));
		System.out.println(list.size());
		for (WebElement a : list) {
			System.out.println(a.getText());
		}

	}

}
