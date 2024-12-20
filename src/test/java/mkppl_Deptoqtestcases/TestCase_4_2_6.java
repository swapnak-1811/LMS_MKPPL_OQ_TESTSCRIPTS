package mkppl_Deptoqtestcases;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4_2_6 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Clickcreatedepartment() throws Exception {
		
		driver.get("http://localhost:8080/");
		Department_Creation_DC dc = new Department_Creation_DC(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		dc.setusername("admin"); // replace with actual username

		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		dc.setpassword("admin");
	
		dc.clicksignin();
		Thread.sleep(1000);
		dc.clickdepartments();
		Thread.sleep(1000);
		dc.clickcreatedepartment();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom = '70%' ");

		Robot robot = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage bufferedimage = robot.createScreenCapture(rectangle);
		String destinationpath = System.getProperty("user.dir") + "//Screenshots//DepartmentScreenshorts//ClickCreateDepartment.png";
		ImageIO.write(bufferedimage, "png", new File(destinationpath));

	}

	@AfterClass
	public void Close() {
		if (driver != null) {
			driver.quit();

		}

	}

		
	}



