package day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		// set driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// launch the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		// storing the elememt

		WebElement list = driver.findElementById("userRegistrationForm:securityQ");
		// cereating the obj with the instance of cotruct

		Select dropdown = new Select(list);
		dropdown.selectByIndex(5);

		// System.out.println("Values=" +dropdown.getFirstSelectedOption().getText());

		Thread.sleep(500);

		dropdown.selectByValue("5");

		Thread.sleep(500);

		dropdown.selectByVisibleText("What is your pet name?");
		System.out.println("Sleectd values=" + dropdown.getFirstSelectedOption().getText());
//			
//			//store ing i the collections
//			
//			List<WebElement> options = dropdown.getOptions();
//			
//			for (int i = 0; i < options.size(); i++) {
//				System.out.println(options.get(i).getText());
//				
//			}
////			
////			dropdown.getOptions().size();
////			System.out.println(dropdown.getOptions().size());
////			
//			//List<WebElement> options=
////					for (WebElement webElement : options) {
////				System.out.println(webElement.getText());
////			}
////			
////			for (int i = 0; i < options.size(); i++) {
////				System.out.println(options.get(i).getText());
////			}
////			
////			System.out.println();
////			

	}

}
