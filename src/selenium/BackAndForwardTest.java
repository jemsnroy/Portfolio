package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	//Learn New Method:
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.className("MV3Tnb")).click();
		
		//Thread.sleep(3000);
		ew.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		//Thread.sleep(3000);
		ew.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		//Thread.sleep(3000);
		ew.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
	}

}
