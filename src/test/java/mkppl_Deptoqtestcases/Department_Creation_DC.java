package mkppl_Deptoqtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Department_Creation_DC {
	WebDriver driver;
	WebDriverWait wait;

	Department_Creation_DC(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}
	
	By txt_username         = By.xpath("//input[@id='username']");
	By txt_password         = By.xpath("//input[@id='password']");
	By clk_signin           = By.xpath("//button[@type='submit']");
	By clk_departments      = By.xpath("//ul[@id ='accordion']/li[3]");
	By clk_createdepartment = By.xpath("//a[normalize-space()='Create Department']");
	By txt_deptname         = By.xpath("//input[@id='field_name']");
	By txt_title            = By.xpath("//input[@id='field_title']");
	By clk_cancel           = By.xpath("//button[@id='cancel-save']");
	By clk_save             = By.xpath("//button[@id='save-entity']");
	By txt_authpassword     = By.xpath("//input[@id='password']")  ; 
	By clk_authsignin       = By.xpath("//button[@class='btn btn-primary']");
	By clk_username         = By.xpath("//div[@id='more-details']");
	By clk_logout           = By.xpath("//ul[@class='list-unstyled']//li[3]");
	
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
	 public void clickdepartments() {
		 WebElement departmentsbutton = driver.findElement(clk_departments);
		 departmentsbutton.click();
	 }
	 public void clickcreatedepartment() {
		 WebElement createdepartment = driver.findElement(clk_createdepartment);
		 createdepartment.click();
	 }
	 public void Enterdepartmentname() {
		 WebElement departmentname = driver.findElement(txt_deptname);
		departmentname.sendKeys("OQ Department1");
	 }
	 public void Enterdepartmenttitle() {
		 WebElement departmenttitle = driver.findElement(txt_title);
		 departmenttitle.sendKeys("OQ Department1");
	 }
	 public void Clickcancelbutton() {
		 WebElement clickcancelbutton = driver.findElement(clk_cancel);
		 clickcancelbutton.click();
	 }
	 public void Clicksavebutton() {
		 WebElement clicksavebutton = driver.findElement(clk_save);
		 clicksavebutton.click();
	 }
	 public void Enterpassword() {
		 WebElement enterpassword = driver.findElement(txt_authpassword);
		 enterpassword.sendKeys("admin");
	 }
	 public void Clickauthsigninbutton() {
		 WebElement clickauthsigninbutton = driver.findElement(clk_authsignin);
		 clickauthsigninbutton.click();
	 }
	 public void Clickusername() {
		 WebElement clickusername = driver.findElement(clk_username);
		 clickusername.click();
	 }
	 public void Clicklogout() {
		 WebElement clicklogoutbutton = driver.findElement(clk_logout);
		 clicklogoutbutton.click();
	 }
}
