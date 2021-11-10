package qa;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft_Hard {
	@Test
	public void soft() {

		SoftAssert softassert = new SoftAssert();
		System.out.println("Test 1 Started");
		softassert.assertEquals(15, 12);
		System.out.println("Test 1 Completed");
		softassert.assertAll();
	}

	@Test
	public void hard() {

		System.out.println("Test 2 Started");
		Assert.assertEquals(12, 12);
		System.out.println("Test 2 Completed");
	}

}
