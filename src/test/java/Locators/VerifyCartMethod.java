package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverinstance.Base;

public class VerifyCartMethod extends Base{
	
	public static WebElement log() {
 WebElement findElement = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-button mat-but')]/child::span[text()='Login']"));
	return findElement;
	}
	
	public static WebElement username() {
		 WebElement findElement = driver.findElement(By.id("mat-input-0"));
			return findElement;
			}
	public static WebElement password() {
		 WebElement findElement = driver.findElement(By.id("mat-input-1"));
			return findElement;
			}
	public static WebElement logbtn() {
		 WebElement findElement = driver.findElement(By.xpath("//mat-card-actions[@class='mat-card-actions']/button/span[text()='Login']"));
			return findElement;
			}
	
	public static WebElement booksearch() {
		 WebElement findElement = driver.findElement(By.xpath("//input[@type='search']"));
			return findElement;
			}
	public static WebElement bookclick() {
		 WebElement findElement = driver.findElement(By.xpath("//span[@class='mat-option-text']"));
			return findElement;
			}
	
	public static WebElement AddToCart() {
		 WebElement findElement = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/span/mat-icon[text()='shopping_cart']"));
			return findElement;
			}
	
	public static WebElement MatIcon() {
		 WebElement findElement = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon[text()='shopping_cart']"));
			return findElement;
			}
	
	public static WebElement verify() {
		 WebElement findElement = driver.findElement(By.xpath("//div[@class='div-quantity'][text()='1']"));
			return findElement;
			}
	

}
