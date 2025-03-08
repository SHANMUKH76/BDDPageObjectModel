package utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	WebDriver driver;
	public void getErrorScrnShot(WebDriver driver) {
		this.driver = driver;
		
		try {
			
			File x = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
			File y = new File("src/main/resources/Screenshots/" + LocalDateTime.now().format(myFormatObj) + ".png");
			Files.copy(x.toPath(), y.toPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
