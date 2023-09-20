package driverinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static  WebDriver driver =null;
	public static WebDriverWait wait=null;
	
	public void click(WebElement element) {
element.click();
	}
public void EnterText(WebElement element, String text) {
	element.click();
	element.clear();
    element.sendKeys(text);
}
public String getText(WebElement element) {
String text = element.getText();

return text;
}

}
