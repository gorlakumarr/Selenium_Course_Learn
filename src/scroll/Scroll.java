package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Scroll {

	public void scroll() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("(//p[text()='End of content.'])[1]"));

		je.executeScript("arguments[0].scrollIntoView(true);", ele);

		System.out.println(ele.getText());
		String text = ele.getText();

		Assert.assertEquals(text, "End of content.");

		driver.close();
	}
}
