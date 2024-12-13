package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListOfFooterForGoogle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		List<WebElement> totalLinkList = footer.findElements(By.tagName("a"));
		System.out.println(totalLinkList.size());
		System.out.println(totalLinkList.get(0).getText());
		
		for(int i = 0; i <= totalLinkList.size()-1;i++) {
			System.out.println(totalLinkList.get(i).getText());
		}
	}

}
