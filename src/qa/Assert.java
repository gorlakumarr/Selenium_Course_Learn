package qa;

import org.junit.Test;

public class Assert {
	@Test
	public void assertDemo() {

		System.out.println("Test 1 Started");

		org.testng.Assert.assertEquals(1, 13, "Check Again 1");

		System.out.println("Test 2 Completed");
	}

	@Test
	public void assertDemo2() {

		System.out.println("Test 2 Started");

		org.testng.Assert.assertEquals(1, 21, "Check Again");

		System.out.println("Test 2 Completed");
	}

}
