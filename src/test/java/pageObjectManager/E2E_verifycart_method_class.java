package pageObjectManager;

import org.openqa.selenium.By;

import Locators.VerifyCart;
import Locators.VerifyCartMethod;
import driverinstance.Base;

public class E2E_verifycart_method_class extends Base {

	public void login(String userName, String password) {
		click(VerifyCartMethod.log());
		EnterText(VerifyCartMethod.username(), userName);
		EnterText(VerifyCartMethod.password(), password);
		click(VerifyCartMethod.logbtn());

	}

	public void selectAndAddProduct(String book) {
		EnterText(VerifyCartMethod.booksearch(), book);
		click(VerifyCartMethod.bookclick());

	}

	public void verifyProduct() {
		click(VerifyCartMethod.MatIcon());
		click(VerifyCartMethod.verify());
	}

}
