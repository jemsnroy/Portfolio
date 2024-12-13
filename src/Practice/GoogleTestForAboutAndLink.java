package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTestForAboutAndLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		driver.findElement(By.linkText("About")).click();

		Thread.sleep(3000);

		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("TestPassed.");
		}
		else {
			System.out.println("TestFailed");
		}
	}
}
