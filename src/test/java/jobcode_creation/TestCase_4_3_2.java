package jobcode_creation;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4_3_2 {
	
WebDriver driver;
	
	@BeforeMethod
	 public void setupBrowser() {
	        // Set up ChromeDriver
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }


	@Test(priority = 2)
	public void LaunchLoginPage1() throws Exception {
		
        // Open the application URL

		driver.get("http://localhost:8080/login");

		Jobcode_Creation_JC jobcode = new Jobcode_Creation_JC(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		jobcode.setUsername(""); 

		jobcode.setPassword(""); 
		Thread.sleep(2000);

		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage bufferedimage = robot.createScreenCapture(rectangle);
		String destinationpath = System.getProperty("user.dir") + "//Screenshots//JobcodeScreenshorts//LaunchLoginPage1.png";
		ImageIO.write(bufferedimage, "png", new File(destinationpath));

	}

	@AfterMethod
	public void Close() {
		if (driver != null) {
			driver.quit();

		}
	}

}
