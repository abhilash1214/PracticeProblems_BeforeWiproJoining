package TestGroup_PracticeProblems4D;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A25_TestNGAnnotationsB {

	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("Before Suite2");
	}

	@BeforeTest
	public void beforeTest2() {
		System.out.println("Before Test2");
	}

	@BeforeClass
	public void beforeClass2() {
		System.out.println("Before Class2");
	}

	@BeforeMethod
	public void beforeMethod2B() {
		System.out.println("Before Method2B");
	}

	@Parameters("inputName")
	@Test
	public void TC3(String inputName) {
		System.out.println("TEST3: " + inputName);
	}

	@Parameters({ "userName", "password" })
	@Test
	public void TC4(String userName, String password) {
		System.out.println("TEST4_Username: " + userName);
		System.out.println("TEST4_Password: " + password);
	}

}