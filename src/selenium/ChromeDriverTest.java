package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys("jenekfnfnefjsl");// Type email.
		driver.findElement(By.id("pass")).sendKeys("ffbskjdfbjh"); // Type Password.
		driver.findElement(By.name("login")).click();
	}

}
