package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://onlinebanking.tdbank.com/#/authentication/login");
		
		driver.findElement(By.name("psudoUsername")).sendKeys("jsdjhsd");
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("dhjkshdjk");
		
		//Thread.sleep(3000);
		//driver.findElement(By.tagName("label")).click();
		
		Thread.sleep(4000);
		WebElement we = driver.findElement(By.xpath("//button[@td-ui-margin='0']"));
		we.click();
	
	}

}
