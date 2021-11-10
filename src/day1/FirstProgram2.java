package day1;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram2 {
	@Test
	public void method() throws InterruptedException {

		// driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		long starts = System.currentTimeMillis();

		// launch the URL
		driver.get("http://www.facebook.com");
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		// time of the process of navigation and page load
		double loadTime = (Double) js.executeScript(
				"return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
		System.out.print(loadTime + " seconds"); // 5.15 seconds

		long end = System.currentTimeMillis();
		long time = starts - end;
		System.out.println(time);
		System.out.println(time / 1000);

		pageLoad.stop();
		long timegap = pageLoad.getTime();
		long timegapSec = timegap / 1000;
		long timegapMin = timegapSec / 60;
		System.out.println("Time in MilliSeconds " + timegap);
		System.out.println("Time in Seconds " + timegapSec);
		System.out.println("Time in Minutes " + timegapMin);
		System.out.println("*****************************");
		pageLoad.reset();
		pageLoad.start();
		driver.get("http://www.irctc.com");

		final JavascriptExecutor js1 = (JavascriptExecutor) driver;
		double loadTime1 = (Double) js1.executeScript(
				"return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
		System.out.print(loadTime1 + " seconds"); // 5.15 seconds

		pageLoad.stop();
		long timegap1 = pageLoad.getTime();
		long timegapSec1 = timegap1 / 1000;
		long timegapMin1 = timegapSec1 / 60;
		System.out.println("Time in MilliSeconds " + timegap1);
		System.out.println("Time in Seconds " + timegapSec1);
		System.out.println("Time in Minutes " + timegapMin1);

		driver.close();
	}

}
