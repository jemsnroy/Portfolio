package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	//Learn New Things
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//type canada:
		driver.findElement(By.name("q")).sendKeys("canada");
		
		Thread.sleep(2000);
		
		//size -10
		//get Text:
		ew.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='OBMEnb']//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());
		
		/*for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).getText());
		}*/
		
		for(WebElement a : list) {
			System.out.println(a.getText());
		}
		
	}

}
