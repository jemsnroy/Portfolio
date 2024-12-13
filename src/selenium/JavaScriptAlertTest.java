package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	//Learn New About Java Script Alert:
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");

		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept(); // click on selected Button (OK)
		// al.dismiss(); //click on other Button (Cancel) or Close the Pop-up.

		Thread.sleep(3000);
		
		driver.findElement(By.name("B3")).click();
		
		//Click on Prompt Box.
		//Selenium
		//Press Okay
		 al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.sendKeys("Selenium");
		Thread.sleep(2000);
		al.accept();
	}

}
