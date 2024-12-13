package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewConfig {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

	}

}
