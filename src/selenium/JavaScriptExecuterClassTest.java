package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		driver.manage().window().maximize();

		WebElement career = driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// option 1 - Using X and Y cordinate:
		// System.out.println(career.getLocation());
		// jse.executeScript("window.scrollBy(0,5000)");
		// Thread.sleep(2000);
		// career.click();

		
		// option 2 - Scroll until the element is in the view
		//jse.executeScript("arguments[0].scrollIntoView(true);", career);
		//career.click();
	
		
		// option 3 - direct click using javaScriptExecutor:
		jse.executeScript("arguments[0].click();", career);
		
		
		
	}

}
