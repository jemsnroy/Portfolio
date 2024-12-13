package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	//Learn about how to maximize the execution window.
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
	
	driver.manage().window().maximize();
	}

}
