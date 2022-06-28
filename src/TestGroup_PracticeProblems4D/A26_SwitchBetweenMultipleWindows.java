package TestGroup_PracticeProblems4D;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26_SwitchBetweenMultipleWindows {
	WebDriver driver;

	// Switch Between Multiple Windows
	public void switchBetweenWindows(String windowName) {
		System.getProperty("webDriver.chrome.driver", "chromeDriver.exe");
		driver = new ChromeDriver();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			if (driver.getTitle().equals(eachWindow));
			break;
		}
	}

	// Switch between Multiple Tabs
	public void switchBetweenTabs(int tabNo) {
		System.getProperty("webDriver.chrome.driver", "chromeDriver.exe");
		driver = new ChromeDriver();
		Set<String> allTabs = driver.getWindowHandles();
		ArrayList<String> eachTab = new ArrayList<String>(allTabs);
		driver.switchTo().window(eachTab.get(tabNo));
	}

	//Switch to a particular window
	public void knowWindow() {
		String windowToSwitch= driver.getWindowHandle();
		driver.switchTo().window(windowToSwitch);
	}
}
