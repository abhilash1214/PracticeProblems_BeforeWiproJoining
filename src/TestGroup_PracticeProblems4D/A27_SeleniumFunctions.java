package TestGroup_PracticeProblems4D;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A27_SeleniumFunctions {

	WebDriver driver;
	WebElement ele = driver.findElement(By.xpath("hh"));

	// 1. Type of Waits
	public void typeOfWaits() {
		System.setProperty("webDriver.chrome.driver", "ChromeDriver.exe");
		driver = new ChromeDriver();

		// 1A. Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 1B.Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(ele));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		wait.until(ExpectedConditions.stalenessOf(ele));

		// 1C.Fluent Wait
		Wait wait2 = new FluentWait(driver);
		wait.withTimeout(10, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}

	// 2. FRAMES
	void frames() {
		driver.switchTo().frame(0);
		driver.switchTo().frame(ele);
		driver.switchTo().frame("framename");

		// Print all Frames
		List<WebElement> allFrames = driver.findElements(By.tagName("iFrame"));
		for (int i = 0; i < allFrames.size(); i++) {
			System.out.println(allFrames.get(i).getText());
			System.out.println(allFrames.get(i).getAttribute("name"));
		}
	}

	// 3. Example Common of EXCEPTIONS
	void ExceptionExamples() {
		// TimeOutException
		// NoSuchElementFountException
		// ElementNotVisiableException
		// StaleElementException
		// NoSuchWindowException
		// NoSuchFrameException
	}

	// 4. Page Factory Model

	@FindBy(xpath = "jhhh")
	public static WebElement elementName;

	// 4B. Element Initialization
	void m1() {
		PageFactory.initElements(driver, elementName);
		// PageFactory.initElements(driver, A27_SeleniumFunctions.class);

		// 5. Scroll down in page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		js.executeScript("argument[0].scrollIntoView(true);", elementName);

		// 5. Drag and Drop
		Actions a = new Actions(driver);
		// a.dragAndDrop(elementName, ele);
		a.clickAndHold(elementName).moveToElement(ele).release(elementName).build().perform();

		// 6. Right click
		a.contextClick(ele).build().perform();

		// 7. Alerts
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("aa");
		driver.switchTo().alert().getText();

		// 8. Select dropdown
		WebElement eleDropdown = driver.findElement(By.xpath("fff"));
		Select s = new Select(eleDropdown);
		// s.getFirstSelectedOption();
		// s.selectByValue("milk");
		// s.selectByIndex(0);
		// s.selectByVisibleText("5 Adults");

		List<WebElement> dropdd = s.getOptions();
		for (int i = 0; i < dropdd.size(); i++) {
			// System.out.println(dropdd.get(i).getAttribute("value"));
			System.out.println(dropdd.get(i).getText());
		}

		
		/*public void clickOp(WebElement e) {
			try {
				e.click();
			}catch(Exception e) {
				try {
				Actions a= new Actions(driver) {
					a.click(e);
				}catch(Exception e) {
					try {
						WebDriverWait wait = new WebDriverWait(10, TimeUnit.SECONDS);
						wait.until(ExpectedConditions.stalenessOf(e));
						e.clck();
					}catch(Exception e) {
						try{
							JavascriptException js= (JavascriptException)driver;
							js.exe..a.build()..a;
						}catch(Exception e) {
							
						}
					}
				}
				}
			}
		}*/
	}
}
