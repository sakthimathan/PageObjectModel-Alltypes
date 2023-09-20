package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;

import driverinstance.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Base implements ITestListener  {

	
	public int time = 20;
	public long maxtime = 20;
	public static  String subfloder;

	@Before
	public void lanuch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxtime));
		driver.get("https://bookcart.azurewebsites.net/");

	}

	@After
	public void close() {
		driver.quit();
	}

	
	public void AnyFailure (Scenario scen, String Filename) throws IOException {
		boolean failed = scen.isFailed();
		if (failed) {
			
			File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File des = new File("./ScreenShot/orh.jpg");
			FileHandler.copy(screenshotAs, des);
		}
	}
	
	
//	@After("@cleanUp")
//	public void Cleancar(Scenario scenario ,String Filename) {
//		LocalDateTime myDateObj = LocalDateTime.now();
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		subfloder = myDateObj.format(myFormatObj);
//		byte[] screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		File desti = new File("./ScreenShot/"+"subfloder"+"/"+Filename);
//		scenario.attach(screenshotAs, ".png", "testone");
//	}
}
