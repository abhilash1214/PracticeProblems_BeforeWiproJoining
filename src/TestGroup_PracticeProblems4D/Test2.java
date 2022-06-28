package TestGroup_PracticeProblems4D;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

	@Test(dataProvider = "credentials")
	public void TC1(String id) {
		System.out.println(id);
	}

	@DataProvider(name = "credentials")
	public Object[] getData() {
		return new Object[] { "id1", "id2" };
	}
}
