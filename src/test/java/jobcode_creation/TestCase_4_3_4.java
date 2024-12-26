package jobcode_creation;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4_3_4 {
	WebDriver driver;

	@Test(priority = 4)

	public void ClickSigninButton() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");

		Jobcode_Creation_JC jobcode = new Jobcode_Creation_JC(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		jobcode.setUsername("admin");
		jobcode.setPassword("admin");
		jobcode.clickSignIn();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom = '70%' ");
		Thread.sleep(3000);

		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage bufferedimage = robot.createScreenCapture(rectangle);
		String destinationpath = System.getProperty("user.dir")
				+ "//Screenshots//JobcodeScreenshorts//ClicksigninButton.png";
		ImageIO.write(bufferedimage, "png", new File(destinationpath));

	}

	@AfterClass
	public void Close() {
		if (driver != null) {
			driver.quit();

		}

	}

}