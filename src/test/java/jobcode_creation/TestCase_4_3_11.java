package jobcode_creation;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4_3_11 {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 11)
	public void verifySignInButton() throws Exception {

		driver.get("http://localhost:8080/");

		Jobcode_Creation_JC jobcode = new Jobcode_Creation_JC(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		jobcode.setUsername("admin");
		jobcode.setPassword("admin");
		jobcode.clickSignIn();
		Thread.sleep(2000);
		jobcode.clickJobCodes();
		jobcode.clickCreatejobcode();
		Thread.sleep(2000);
		jobcode.enterCodeName("OQFL");
		jobcode.clickDepartments();
		jobcode.selectDepartment();
		Thread.sleep(2000);
		jobcode.enterResponsibility1("OQ FL Responsibility1");
		jobcode.clickAddbutton1();
		jobcode.enterResponsibility2("OQ FL Responsibility2");
		jobcode.clickAddbutton2();
		jobcode.enterResponsibility3("OQ FL Responsibility3");
		Thread.sleep(1000);
		jobcode.clickCreatebutton();
		jobcode.enterPassword("admin");
		Thread.sleep(1000);
		jobcode.clickSignInButton();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom = '70%' ");
		

		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage bufferedimage = robot.createScreenCapture(rectangle);
		String destinationpath = System.getProperty("user.dir")
				+ "//Screenshots//JobcodeScreenshorts//verifySignInButton.png";
		ImageIO.write(bufferedimage, "png", new File(destinationpath));

	}

	@AfterMethod
	public void Close() {
		if (driver != null) {
			driver.quit();

		}

	}

}
