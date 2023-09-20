package pageObjectManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverinstance.Base;

public class E2E_VerifyCart_page_Object_Model extends Base {

	public E2E_VerifyCart_page_Object_Model() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator mat-button mat-but')]/child::span[text()='Login']")
	private WebElement Log;

	@FindBy(id = "mat-input-0")
	private WebElement userName;

	@FindBy(id = "mat-input-1")
	private WebElement Password;

	@FindBy(xpath = "//mat-card-actions[@class='mat-card-actions']/button/span[text()='Login']")
	private WebElement Logbtn;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement BookSearch;

	@FindBy(xpath = "//span[@class='mat-option-text']")
	private WebElement BookClick;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']/span/mat-icon[text()='shopping_cart']")
	private WebElement AddToCart;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']/mat-icon[text()='shopping_cart']")
	private WebElement MatIcon;

	@FindBy(xpath = "//div[@class='div-quantity'][text()='1']")
	private WebElement Verification;

	public WebElement getLog() {
		return Log;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogbtn() {
		return Logbtn;
	}

	public WebElement getBookSearch() {
		return BookSearch;
	}

	public WebElement getBookClick() {
		return BookClick;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getMatIcon() {
		return MatIcon;
	}

	public WebElement getVerification() {
		return Verification;
	}

//	public void login(String userName,String password) {
//		click(getLog());
//		EnterText(getUserName(), userName);
//		EnterText(getPassword(), password);
//		click(getLogbtn());
//		
//	}
	public void login(String userName, String password) {
		getLog().click();
		getUserName().sendKeys(userName);
		getPassword().sendKeys(password);
		getLogbtn().click();

	}

	public void selectAndAddProduct(String book) {

		EnterText(getBookSearch(), book);
		click(getBookClick());
		click(getAddToCart());

	}

	public int verifyCart() {
		click(getMatIcon());
		String text = getText(getVerification());
		int count = Integer.parseInt(text);
		return count;

	}

}
