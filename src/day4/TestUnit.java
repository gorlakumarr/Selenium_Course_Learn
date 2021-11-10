package day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUnit {

	@BeforeSuite
	public void createlead() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void createlead2() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void createlead3() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void createlead4() {
		System.out.println("BeforeMethod");
	}

	@Test
	public void createlead5() {
		System.out.println("Test1");
	}

	@Test
	public void dreatelead5() {
		System.out.println("Test2");

	}

	@AfterMethod
	public void createlead6() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void createlead7() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void createlead8() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void createlead9() {
		System.out.println("AfterSuite");
	}
}
