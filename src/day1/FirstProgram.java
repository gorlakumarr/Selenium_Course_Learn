package day1;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {

		// driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		Thread.sleep(5000);
		// launch the URL
		driver.get("http://www.leaftaps.com/control/main");
		pageLoad.stop();

		long timegap = pageLoad.getTime();
		System.out.println(timegap);
		// maximize the browser
		// driver.manage().window().maximize();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.body.style.zoom='70%'");
//
//		// user name
//		driver.findElementById("username").sendKeys("DemoSalesManager");
//		// password
//		driver.findElementById("password").sendKeys("crmsfa");
//		// login button
//		driver.findElementByClassName("decorativeSubmit").click();
//
//		// click on crm/sfa
//		driver.findElementByLinkText("CRM/SFA").click();
//		// driver.findElementByXPath("//*[@id='label']/a").click();
//
//		// click on leads
//
//		// driver.findElementByLinkText("Leads").click();
//
//		// create leads
//
//		driver.findElementByLinkText("Create Lead").click();
//		// enter company name
//
//		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
//
//		// enter first name
//		driver.findElementById("createLeadForm_firstName").sendKeys("Arun");
//
//		// last name
//		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");
//
//		// click on create lead
//
//		driver.findElementByClassName("smallSubmit").click();
		driver.quit();
		driver.close();
	}

}
