package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	//Learn About Keys of KeyBoard.
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // Open Firefox
		driver.get(
				"https://auth.scotiaonline.scotiabank.com/online?oauth_key=VZx0LwJP8kw&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiVlp4MEx3SlA4a3ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2MTcxNzM3NywiaWF0IjoxNjYxNzE2MTc3LCJqdGkiOiJiZDMzNmRlYi1jMjFlLTQwNzgtOGE4MS0yMmI5YmVjYzEwMWMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.uWA5oZbMlBY0BueQVk8g4zd_zkWi2DncTw1DJO-DF5zpTia5NyboA-Am5-cmO6SlAlyFGuFSht8ekD-DfprzY8q4qx-L1t4ZFo03Faafy79dgZo7Gqv8EaASU1tZyLVFti0KlzArOck4yvWVevPiMakbfOljuOanc03uZEUAc05Vldo0DOzhr0nyiQqwFG39jDZIWPGu7i-stYnire6cSCprp4lj4sc6G22BSWHmMx5_jb4UXFttieD7vBhM_ZgZjaJWpzz4F91s5tg2wz9JAgd_BBqtUFju9AvjYYiB87Fmo_0NzPorYe4LhaFWLdmAkXu8dvZluOm5DdmzTn6VIw&preferred_environment="); // Open
		driver.findElement(By.id("usernameInput-input")).sendKeys("jhsfjsdhf@3#$");
		driver.findElement(By.name("password")).sendKeys("fjhsdfkh@#$");
		//driver.findElement(By.id("signIn")).click(); is similar to driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		String expectedErrorMessage = "Please enter a username or card number without special characters.";

		// This is a method for getting Actual error message from the html.
		String actualErrorMessage = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErrorMessage);
		if (expectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("Pass.");

		} else {
			System.out.println("Fail.");
		}
	}

}
