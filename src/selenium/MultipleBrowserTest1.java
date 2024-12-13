package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		WebDriver driver;

		// Read the data from the excel file.

		Xls_Reader ex = new Xls_Reader("C:\\testing\\NikulTest.xlsx");

		String a = ex.getCellData("Data1", "Browser", 2);
		System.out.println(a);
		if (a.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (a.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sjdfhksf");
		driver.findElement(By.name("pass")).sendKeys("dsgsadhgasdgsadhgsd");
		driver.findElement(By.name("login")).click();
	}

}
