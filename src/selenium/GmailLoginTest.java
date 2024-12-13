 
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	// HOME WORK
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S436683117%3A1662522897516701&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmWzxiU6ggLUVLUdpy_OxDFZrMBoxTjEKSRY8wuIXG24ceuLi3OyzqlBA1Fi4XvQZwjo8dOdAA");
		
		// Enter Wrong Email
		// Click on Next Button
		driver.findElement(By.id("identifierId")).sendKeys("kjfhsddjkfhs@jhsdkfj");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		Thread.sleep(3000);

		// Verify the Error Message:
		String expectedEM = "Enter a valid email or phone number";

		String actualEM = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(actualEM);

		if (expectedEM.equals(actualEM)) {
			System.out.println("Test Passed.");
		} else {
			System.out.println("Test Failed");
		}

	}

}
