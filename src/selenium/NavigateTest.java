package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	//Learn New About Navigate method:
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/"); is Equals to driver.navigate().to("URL");
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
