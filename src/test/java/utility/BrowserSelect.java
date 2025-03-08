package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserSelect {

	static WebDriver driver;

	@Parameters({ "browser", "url" })
	@Test(enabled = false)
	public static WebDriver getBrowser(String browser, String url){

		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Invalid browser");
			return null;

		}

		driver.get(url);
		return driver;

	}
	
	@Test(dataProvider = "getData")
	public void test(String username, String password) throws InterruptedException {
		System.out.println("Username: " + username + " Password: " + password + " Thread ID: " + Thread.currentThread().threadId());
		getBrowser("chrome", "http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[2][0] = "user3";
		data[2][1] = "pass3";
		return data;
	}

}
