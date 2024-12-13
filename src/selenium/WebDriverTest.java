package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		// Two syntax for creating an object:
		// SYNTAX 1: className objName = new className();
		// FirefoxDriver driver = new FirefoxDriver();

		// SYNTAX 2: parentClassName(InterfaceName) objName = new className();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("jenekfnfnefjsl");
		driver.findElement(By.id("pass")).sendKeys("ffbskjdfbjh");
		driver.findElement(By.name("login")).click();
	}

}
