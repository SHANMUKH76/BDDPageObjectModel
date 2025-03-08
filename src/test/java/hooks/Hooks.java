package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.Base;
import utility.CaptureScreenShot;

public class Hooks {

	private Base base;

	public Hooks(Base base) {
		this.base = base;
	}

	@Before
	public void initBrowser() {
		System.out.println("Opening the browser");
		base.driver = new ChromeDriver();
	}

	@After
	public void tearBrowser(Scenario scenario) {

		if (scenario.isFailed()) {
			CaptureScreenShot screenShot = new CaptureScreenShot();
			screenShot.getErrorScrnShot(base.driver);
		}

		System.out.println("Closing the browser");
		base.driver.quit();
	}

}
