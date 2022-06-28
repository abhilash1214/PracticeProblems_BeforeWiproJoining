package TestGroup_PracticeProblems4D;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A42_XpathIdentification {

	@FindBy(xpath="//h3[contains(text(),'Online Shopping Site')]")
	public static WebElement element1;
	
	@FindBy(xpath="//div[@class='GyAeWb']/div/child::div[@id='res']")
	public static WebElement element2;
}
