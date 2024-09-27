package depends;

import org.junit.Test;

public class depends {

	@Test(enabled = true, priority = 0)
	public void tc01() {
		System.out.println("TC 01 Passed");
	}

	@Test(enabled = true, priority = 1)
	public void tc02() {
		Assert.assertTrue(false);
		System.out.println("TC 02 Passed");
	}

	@Test(dependsOnMethods = { "tc02" }, priority = 2)
	public void tc03() {
		System.out.println("TC 03 Passed");
	}
}
