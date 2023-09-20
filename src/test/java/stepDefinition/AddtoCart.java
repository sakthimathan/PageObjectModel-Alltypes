package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import PageMager.PageObjectManager;
import driverinstance.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectManager.E2E_VerifyCart_page_Object_Model;
import pageObjectManager.E2E_verifycart_interface;

public class AddtoCart extends Base {
//	E2E_VerifyCart_page_Object_Model page1 = new E2E_VerifyCart_page_Object_Model ();
//	E2E_verifycart_interface page=new E2E_verifycart_interface();
	PageObjectManager manager = new PageObjectManager();
	
	@Given("user go to the login page")
	public void user_go_to_the_login_page() {
		
		driver.findElement(By.xpath(
				"//button[contains(@class,'mat-focus-indicator mat-button mat-but')]/child::span[text()='Login']"))
				.click();
	}

	@Given("user enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		driver.findElement(By.id("mat-input-0")).sendKeys(username);
		driver.findElement(By.id("mat-input-1")).sendKeys(password);

	}

	@When("click the login button")
	public void click_the_login_button() {
		WebElement element = driver
				.findElement(By.xpath("//mat-card-actions[@class='mat-card-actions']/button/span[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOf(element)).click();

	}

	@When("user search the {string} and add to cart")
	public void user_search_the_and_add_to_cart(String book) {
//		WebElement element = driver.findElement(By.xpath("//input[@type='search']"));
//		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(book);
//		driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
//		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/span/mat-icon[text()='shopping_cart']"))
//				.click();
		//page.selectAndAddProduct(book);
		manager.getE2e_verifycart_method_class().selectAndAddProduct(book);

	}

	@Then("user verify the cart")
	public void user_verify_the_cart() {
		
//		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon[text()='shopping_cart']")).click();
//		String text = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon[text()='shopping_cart']/child::span[@id='mat-badge-content-0']"))
//				.getText();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//span[@class='mat-button-wrapper']/mat-icon[text()='shopping_cart']/child::span[@id='mat-badge-content-0']")));
//		Assert.assertEquals(Integer.parseInt(text) > 0, true);
		int actualCount = manager.getE2e_verifycart_interface().verifyCart();
		//int actualCount = page.verifyCart();
		Assert.assertEquals(actualCount, 1);

	}
	@Given("user should perform login with {string} and {string}")
	public void user_should_perform_login_with_and(String username, String password) {
	   //page1.login(username, password);
	   manager.getE2e_VerifyCart_page_Object_Model().login(username, password);
	}

}
