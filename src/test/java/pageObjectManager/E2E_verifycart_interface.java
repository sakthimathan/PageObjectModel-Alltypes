package pageObjectManager;

import org.openqa.selenium.By;

import Locators.VerifyCart;
import driverinstance.Base;

public class E2E_verifycart_interface extends Base implements VerifyCart{
	
	public void login(String userName,String password) {
		click(driver.findElement(By.xpath(VerifyCart.logxpath)));
		EnterText(driver.findElement(By.id(VerifyCart.logiduser)), userName);
		EnterText(driver.findElement(By.id(VerifyCart.logidpass)), password);
		click(driver.findElement(By.xpath(VerifyCart.Logxpathbtn)));
		
		
	}
	
	public void selectAndAddProduct(String book) {
		EnterText(driver.findElement(By.xpath(VerifyCart.logxpathbook)), book);
		click(driver.findElement(By.xpath(VerifyCart.logxpathclick)));
		

	}
	
	public int verifyCart() {
		click(driver.findElement(By.xpath(VerifyCart.logxpathmaticon)));
		String text = getText(driver.findElement(By.xpath(VerifyCart.logxpathverify)));	
		int count = Integer.parseInt(text);
		return count;
		
	}
	

}
