package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// Step 2: Then set property.
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		// Step 1: First Write this line. For opening firefox We don't need to create
		// any method.
		FirefoxDriver driver = new FirefoxDriver(); // This object class is used to open Firefox.

		// Step 3: Use get() method for opening specific web-site.
		driver.get("https://www.facebook.com/"); // This get method used to open specific web-site.

		// Step 4: This step will insert the value at the place where you want to add.
		driver.findElement(By.id("email")).sendKeys("jenekfnfnefjsl");// Type email.
		driver.findElement(By.id("pass")).sendKeys("ffbskjdfbjh"); // Type Password.
		driver.findElement(By.name("login")).click(); // click on login button.

	}

}