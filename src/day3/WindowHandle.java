package day3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// get the url
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		System.out.println("no of windows before==" + driver.getWindowHandles().size());
		driver.findElementByLinkText("Contact Us").click();

		Set<String> allwin = driver.getWindowHandles();

		System.out.println("no of windows after==" + allwin.size());
		// driver.getTitle();
		for (String eachwin : allwin) {

			// System.out.println("getting the window handeles of all ===="+allwin.size());
			driver.switchTo().window(eachwin);

		} // System.out.println("title of the control of window==="+driver.getTitle());

		driver.quit();

	}

}
//if (i==1) {
//break;
//
//
//}i++;
//