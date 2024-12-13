package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");

		//This is for Hover
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signIn).build().perform();

		//If we get any captch as a pop up then just increase the sleep time up-to 20000ms and add it manually then it will work. 
		
		//This is for getting list from Hover. 
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a/span"));
		System.out.println(list.size());
		for (WebElement a : list) {
			System.out.println(a.getText());
		}
	}

}
