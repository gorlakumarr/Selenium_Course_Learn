package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// get the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// check for frame

		// WebElement fraresult =driver.findElementById("iframeResult");
		// enter into frame

		driver.switchTo().frame("iframeResult");

		// get the element to to click on the frame andclick

		driver.findElementByXPath("/html/body/button").click();

		// alert swtiching
		// String namealert =

		// enter text on alert fr prompt dialogue
		driver.switchTo().alert().sendKeys("GK-SURESH");

		// taking action on alert accpet or reject

		driver.switchTo().alert().accept();

		boolean name = driver.findElementById("demo").getText().contains("GK-SURESH");

		System.out.println(name);

	}

}
