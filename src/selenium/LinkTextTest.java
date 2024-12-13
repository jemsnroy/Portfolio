package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // Open Firefox
		driver.get("https://www.google.com/"); // Open google

		// driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();

		Thread.sleep(3000);// This is purely java code here compilation will stopped for 3 secs = 3000 mili
							// seconds.

		// This command is for checking that we opened the expected URL or not.
		
		String actualURL = driver.getCurrentUrl(); // this getCurrentUrl method used to get the current Url which we
													// opened.
		String expectedURL = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		System.out.println(actualURL);

		//We can check through title also:
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

}
