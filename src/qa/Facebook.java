package qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void allmethods() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().getSize();
		System.out.println("Current Size :" + driver.manage().window().getSize());

		Dimension dimension = new Dimension(500, 600);
		driver.manage().window().setSize(dimension);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		((JavascriptExecutor) driver).executeScript("window.resizeTo(1050,708);");
		System.out.println("resized");

		WebElement element = driver.findElement(By.xpath("//span[text()=' Facebook © 2017']"));

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("scroll(0,500)");
		System.out.println("Scroled to 500");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// ignore
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("Scroled to " + element);

		WebElement email = driver.findElement(By.name("email"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", email);

		Actions actions = new Actions(driver);
		actions.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("sanjeevkumar984@gmail.com").keyUp(Keys.SHIFT)
				.build();

		driver.close();
	}
}
