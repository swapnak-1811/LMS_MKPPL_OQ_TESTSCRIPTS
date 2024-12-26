package mkppl_oqtestcases;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4_1_1 {
	WebDriver driver;

	@BeforeMethod
	public void launchGoogleWindow() {

		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void EnterApplicationURL() throws IOException, Exception {

		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		WebElement searchBox = driver.findElement(By.name("q"));
		String AppUrl = "http://192.168.0.110:8080/";
		searchBox.sendKeys(AppUrl);
		Thread.sleep(3000);

		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage bufferedimage = robot.createScreenCapture(rectangle);
		String destinationpath = System.getProperty("user.dir") + "//Screenshots//EnterAppURL.png";
		ImageIO.write(bufferedimage, "png", new File(destinationpath));

	}

	@AfterMethod
	public void Close() {
		driver.quit();
	}

}
