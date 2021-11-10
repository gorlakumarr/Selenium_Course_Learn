package jenkinsSample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleJenkins {
	@Test
	public void sampleProgram() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://google.in");
		String Expectedtitle = "Google";
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");

		driver.quit();
	}

}
