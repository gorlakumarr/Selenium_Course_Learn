package sample;

import org.testng.annotations.Test;

public class HelloWorld {
	@Test
	public void printHello() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hai GK :" + i);
		}
	}
}
