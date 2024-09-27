package scroll;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class ScrollUpDown {

	public void scrollUpDwon() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");

		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		driver.close();
		driver.quit();
	}
}