package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		//Add common io jar file to the project(in library):
		File screenshotFile = driver.getScreenshotAs(OutputType.FILE); //This is for FirefoxDriver, chromeDriver or any class Driver.
		FileUtils.copyFile(screenshotFile, new File("C:\\testing\\screenshot.png"));

	}

}
