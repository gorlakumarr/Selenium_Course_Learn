package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		// driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the driver

		ChromeDriver web = new ChromeDriver();

		// launch the URL

		web.get("http://www.leaftaps.com");

		// Maximize the browser
		web.manage().window().maximize();

		// UserName and Password

		web.findElementById("username").sendKeys("DemoSalesManager");

		web.findElementById("password").sendKeys("crmsfa");

		// Click on login button

		web.findElementByClassName("decorativeSubmit").click();

		// Click on CRM/SFA

		web.findElementByLinkText("CRM/SFA").click();

		// Click on Create Lead

		web.findElementByLinkText("Create Lead").click();

		// enter details

		web.findElementById("createLeadForm_companyName").sendKeys("HCL");
		web.findElementById("createLeadForm_firstName").sendKeys("Kumar");
		web.findElementById("createLeadForm_lastName").sendKeys("Gk");
		web.findElementById("createLeadForm_firstNameLocal").sendKeys("Gk");
		web.findElementById("createLeadForm_lastNameLocal").sendKeys("GKkk");
		web.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		web.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		web.findElementById("createLeadForm_departmentName").sendKeys("Software Engg");
		web.findElementById("createLeadForm_annualRevenue").sendKeys("300000");
		web.findElementById("createLeadForm_sicCode").sendKeys("123456");
		web.findElementById("createLeadForm_tickerSymbol").sendKeys("IT");
		web.findElementById("createLeadForm_description")
				.sendKeys("G.Kumar.HCL Technologies,Sholzilinganallur,Chennai");
		web.findElementById("createLeadForm_importantNote").sendKeys("GKumar Test leaf");
		web.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600119");
		web.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9550755485");
		web.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("04458");
		web.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Owner");
		web.findElementById("createLeadForm_generalToName").sendKeys("Raj");
		web.findElementById("createLeadForm_generalAttnName").sendKeys("Ravi");
		web.findElementById("createLeadForm_generalAddress1").sendKeys("OMR");
		web.findElementById("createLeadForm_generalAddress2").sendKeys("Sholinganllur");
		web.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		web.findElementById("createLeadForm_generalPostalCode").sendKeys("600100");

		Select dropdown = new Select(web.findElement(By.id("createLeadForm_generalCountryGeoId")));
		dropdown.selectByVisibleText("India");

		web.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("60011");
		web.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("60019");

		// Create Lead
		web.findElementByClassName("smallSubmit").click();

		web.close();

	}
}
