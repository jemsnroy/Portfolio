package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		//Here We read the data from the properties file:
		FileInputStream f = new FileInputStream("C:\\testing\\prop.properties"); // This class will juat hold the file.
		Properties prop = new Properties();
		prop.load(f);
		
		String a = prop.getProperty("browser"); // chrome; safari; //We'll read this value from data file like Excel, Properties:
		System.out.println(a);
		if(a.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(a.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\safaridriver.exe");
			 driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sjdfhksf");
		driver.findElement(By.name("pass")).sendKeys("dsgsadhgasdgsadhgsd");
		driver.findElement(By.name("login")).click();
	}

}
