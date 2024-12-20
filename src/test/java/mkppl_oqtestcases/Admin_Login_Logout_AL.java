package mkppl_oqtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_Login_Logout_AL {

	WebDriver driver;
	WebDriverWait wait;

	Admin_Login_Logout_AL(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	By txt_username = By.xpath("//input[@id='username']");
	By txt_password = By.xpath("//input[@id='password']");
	By clk_signin   = By.xpath("//button[@type='submit']");
	By clk_username = By.xpath("//div[@id='more-details']");
	By clk_profile  = By.xpath("//a[normalize-space()='Profile']");
	By clk_Logout   = By.xpath("//a[normalize-space()='Logout']");
	
	 public void setusername(String username) {
		WebElement usernameField = driver.findElement(txt_username);
		usernameField.sendKeys(username);
		 
	 }
	 public void setpassword(String password) {
		WebElement passwordField = driver.findElement(txt_password);
		passwordField.sendKeys(password);
	 }
	 public void clicksignin() {
		  WebElement loginButton = driver.findElement(clk_signin);
		  loginButton.click();
		
     }
	 public void clickusername() {
		 WebElement usernameButton = driver.findElement(clk_username);
		 usernameButton.click();
	 }
	 public void clickprofilebutton() {
		 WebElement profilebutton = driver.findElement(clk_profile);
		 profilebutton.click();
	 }
	 public void ClickLogoutbutton() {
		 WebElement logoutbutton = driver.findElement(clk_Logout);
		 logoutbutton.click();
	 }
}
