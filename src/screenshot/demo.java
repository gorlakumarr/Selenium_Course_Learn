package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class demo {

	public void demo2() throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(src, new File("C:\\Test.png"));
			System.out.println("Screenshot");

		} catch (IOException e) {
			System.err.println("IOException");
		}

		driver.close();
	}
}
