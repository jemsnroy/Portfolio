package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	//Learn about how to click on option lick gender in facebook.
	
	public static void main(String[] args) throws InterruptedException {
//
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> rb = driver.findElements(By.name("group1"));
		System.out.println(rb.size());
		for(WebElement a : rb) {
			System.out.println(a.getAttribute("value")+"---------->"+a.isSelected());
		}
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		rb.get(2).click();
		for(WebElement a : rb) {
			System.out.println(a.getAttribute("value")+"---------->"+a.isSelected());
		}
	
	}

}
