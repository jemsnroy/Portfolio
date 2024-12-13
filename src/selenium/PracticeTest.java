package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tests.com/login");
		
	}

}
