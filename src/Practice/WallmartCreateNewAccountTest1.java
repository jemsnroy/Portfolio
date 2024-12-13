package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WallmartCreateNewAccountTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.walmart.ca/sign-in?from=%2Fen"); // DONE

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click(); // DONE

		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("GDKJSGkfhg"); // DONE
		driver.findElement(By.id("lastName")).sendKeys("aksfjkg"); // DONE
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890"); // DONE
		driver.findElement(By.id("email")).sendKeys("faskdjfhskfjh@kjfshdkfj"); // Done
		driver.findElement(By.id("password")).sendKeys("fhaskhgdfhjg@D"); // Done

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TAndC']")).click(); // Done

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='css-vfxkzw edzik9p0']")).click(); // Done

		Thread.sleep(3000);

		String ActualEM = driver.findElement(By.xpath("//span[@class='css-1lliris erl5ymg4']")).getText();
		System.out.println(ActualEM);
		String ExpectedEM = "Please enter a valid email address.";

		if (ActualEM.equals(ExpectedEM)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
