package Practice;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidadListLoginANDErrorTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium_WorkSpace\\MySeleniumBatch66\\src\\Practice\\Driver Folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/men");

		/*WebElement footer = driver.findElement(By.xpath("//div[@class='glass-header-bottom-desktop-white___38y1Y']"));
		List<WebElement> total = footer.findElements(By.tagName("a"));
		System.out.println(total.size());
		System.out.println(total.get(1).getText());*/
	}
}
