package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");

		Thread.sleep(2000);

		// Task:
		// enter wrong email
		// enter password
		// click on sign-in button.
		driver.findElement(By.name("login-email")).sendKeys("fjkshfkj3453@test.com");
		driver.findElement(By.name("login-password")).sendKeys("sjkfhsjk");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Email Log in')]")).click();

		Thread.sleep(2000);
		String expectedErrMess = "Your request timed out – please retry";
		String actualErrMess = driver
				.findElement(By.xpath("//div[@class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']"))
				.getText();
		System.out.println(actualErrMess);
		if (expectedErrMess.equals(actualErrMess)) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail");
		}
	}

}
