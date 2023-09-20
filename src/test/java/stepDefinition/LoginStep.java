package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import driverinstance.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Base {
	
	
	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6[text()='Dashboard']")).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6[text()='Dashboard']")));
		Assert.assertEquals(text, "Dashboard");

	}

}
