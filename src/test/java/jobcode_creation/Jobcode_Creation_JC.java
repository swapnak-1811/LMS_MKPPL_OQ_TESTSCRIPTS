package jobcode_creation;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jobcode_Creation_JC {

	WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialize WebDriver and WebDriverWait

	public Jobcode_Creation_JC(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Locators

	By txt_username                   = By.xpath("//input[@id='username']");
	By txt_password                   = By.xpath("//input[@id='password']");
	By clk_signin                     = By.xpath("//button[@type='submit']");
	By clk_jobcodes                   = By.xpath("//ul[@id ='accordion']/li[4]");
	By clk_createjobcode              = By.xpath("//a[normalize-space()='Create Jobcode']");
	By txt_code                       = By.xpath("//input[@placeholder='code']");
	By clk_departments                = By.xpath("//div[@class='c-btn']");
	By slct_department                = By.xpath("//ul[@class='lazyContainer']/li[2]");
	By txt_responsibility1            = By.xpath("//textarea[@placeholder='Responsibility']");
	By clk_addbutton                  = By.xpath("//button[normalize-space()='Add']");
	By txt_responsibility2            = By.xpath("//div[@class='card-body']//div//div[2]//div[1]//div[1]//div[1]//div[1]//textarea[1]");
	By clk_addbutton2                 = By.xpath("//button[normalize-space()='Add']");
	By txt_responsibility3            = By.xpath("(//textarea[@placeholder='Responsibility'])[3]");
	By clk_createbutton               = By.xpath("//button[normalize-space()='Create']");
	By text_password                  = By.xpath("//input[@id='password']");
	By clk_signinbtn                  = By.xpath("//button[@type='submit']");
	By clk_jobcodelist                = By.xpath("//a[normalize-space()='Jobcode List']");
	By search_code                    = By.xpath("//input[@placeholder='code']");
	By search_department              = By.xpath("//div[@class='c-btn']");
	By select_department              = By.xpath("//ul[@class='lazyContainer']/li[2]");
	By clk_submitbutton               = By.xpath("//button[normalize-space()='Submit']");
	By clk_actionbutton               = By.xpath("//i[@class='fa fa-cog size-16']");
	By clk_viewbutton                 = By.xpath("//button[normalize-space()='View']");
	By clk_backbutton                 = By.xpath("//button[normalize-space()='Back']");
	By clk_editbutton                 = By.xpath("//button[normalize-space()='Edit']");
	By edit_responsibility1           = By.xpath("//textarea[@class='form-control input-name ng-pristine ng-valid ng-touched']");
	By edit_responsibility2           = By.xpath("//div[@class='card-body']//div//div[2]//div[1]//div[1]//div[1]//div[1]//textarea[1]");
	By edit_responsibility3           = By.xpath("//textarea[@placeholder='Responsibility'])[3]");
	By clk_updatebutton               = By.xpath("//button[normalize-space()='Update']");
	By txt_authenticationpassword     = By.xpath("//input[@id='password']");
	By clk_authenticationsignin       = By.xpath("//button[normalize-space()='Sign in']");
	By clk_username                   = By.xpath("//div[@id='more-details']");
	By clk_logout                     = By.xpath("//a[normalize-space()='Logout']");

	// Methods to interact with elements

	public void setUsername(String username) {
		WebElement usernameField = driver.findElement(txt_username);
		usernameField.sendKeys(username);

	}

	public void setPassword(String password) {
		WebElement passwordField = driver.findElement(txt_password);
		passwordField.sendKeys(password);
	}

	public void clickSignIn() {
		WebElement loginButton = driver.findElement(clk_signin);
		loginButton.click();

	}

	public void clickJobCodes() {
		WebElement clickjobcodes = driver.findElement(clk_jobcodes);
		clickjobcodes.click();

	}

	public void clickCreatejobcode() {
		WebElement clickCreatejobcode = driver.findElement(clk_createjobcode);
		clickCreatejobcode.click();
	}

	public void enterCodeName(String codeName) {
		WebElement codeNameField = driver.findElement(txt_code);
		codeNameField.sendKeys(codeName);
	}

	public void clickDepartments() {
		WebElement clickDepartment = driver.findElement(clk_departments);
		clickDepartment.click();
	}

	public void selectDepartment() {
		WebElement selectDepartment = driver.findElement(slct_department);
		selectDepartment.click();
	}

	public void enterResponsibility1(String responsibility1) {
		WebElement responsibilityField1 = driver.findElement(txt_responsibility1);
		responsibilityField1.sendKeys(responsibility1);
	}

	public void clickAddbutton1() {
		WebElement addButton = driver.findElement(clk_addbutton);
		addButton.click();
	}

	public void enterResponsibility2(String responsibility2) {
		WebElement responsibilityField2 = driver.findElement(txt_responsibility2);
		responsibilityField2.sendKeys(responsibility2);
	}

	public void clickAddbutton2() {
		WebElement addButton = driver.findElement(clk_addbutton);
		addButton.click();
	}

	public void enterResponsibility3(String responsibility3) {
		WebElement responsibilityField3 = driver.findElement(txt_responsibility3);
		responsibilityField3.sendKeys(responsibility3);
	}

	public void clickCreatebutton() {
		WebElement createButton = driver.findElement(clk_createbutton);
		createButton.click();
	}

	public void enterPassword(String password) {
		WebElement enterPassword = driver.findElement(text_password);
		enterPassword.sendKeys(password);
	}

	public void clickSignInButton() {
		WebElement signinButton = driver.findElement(clk_signinbtn);
		signinButton.click();
	}

	public void clickJobcodeList() {
		WebElement jobcodeList = driver.findElement(clk_jobcodelist);
		jobcodeList.click();
	}

	public void searchCode(String code) {
		WebElement searchCode = driver.findElement(search_code);
		searchCode.sendKeys(code);
	}

	public void searchDepartment() {
		WebElement searchDepartment = driver.findElement(search_department);
		searchDepartment.click();
	}

	public void selectSearchDepartment() {
		WebElement sltDepartment = driver.findElement(select_department);
		sltDepartment.click();
	}

	public void clickSubmit() {
		WebElement clickSubmitButton = driver.findElement(clk_submitbutton);
		clickSubmitButton.click();
	}

	public void clickAction() {
		WebElement clickActionIcon = driver.findElement(clk_actionbutton);
		clickActionIcon.click();
	}

	public void clickViewButton() {
		WebElement clickViewButton = driver.findElement(clk_viewbutton);
		clickViewButton.click();
	}

	public void clickBackButtonInViewPage() {
		WebElement clickBackButtonInViewPage = driver.findElement(clk_backbutton);
		clickBackButtonInViewPage.click();

	}

	public void clickEditButton() {
		WebElement clickEditButton = driver.findElement(clk_editbutton);
		clickEditButton.click();
	}

	public void editResponsibility1(String newResponsibility1) {

		// Locate the responsibilityField1 element
		WebElement responsibilityField1 = driver.findElement(txt_responsibility1);

		// Retrieve the current value
		String currentResponsibility = responsibilityField1.getAttribute("value");
	    System.out.println("Current Responsibility Field 1: " + currentResponsibility);



		// Clear the field
		responsibilityField1.clear();

		// Set the new responsibility value
		responsibilityField1.sendKeys(newResponsibility1);
	}

	public void editResponsibility2(String newResponsibility2) {

		// Locate the responsibilityField1 element
		WebElement responsibilityField2 = driver.findElement(txt_responsibility2);

		// Retrieve the current value
		String currentResponsibility = responsibilityField2.getAttribute("value");
	    System.out.println("Current Responsibility Field 2: " + currentResponsibility);


		// Clear the field
		responsibilityField2.clear();

		// Set the new responsibility value
		responsibilityField2.sendKeys(newResponsibility2);
	}

	public void editResponsibility3(String newResponsibility3) {
	    WebElement responsibilityField3 = driver.findElement(txt_responsibility3);
	    
	    // Retrieve current value (optional)
	    String currentResponsibility = responsibilityField3.getAttribute("value");
	    System.out.println("Current Responsibility Field 3: " + currentResponsibility);

	    // Clear the field
	    responsibilityField3.clear();

	    // Set the new value
	    responsibilityField3.sendKeys(newResponsibility3);
	}
	public void updateButton() {
		WebElement clickupdateButton = driver.findElement(clk_updatebutton);
		clickupdateButton.click();
	}
	public void enterAuthenticationPassword(String newpassword) {
		WebElement authenticationPassword = driver.findElement(txt_authenticationpassword);
		authenticationPassword.sendKeys(newpassword);
	}
	public void clickAuthenticationSignIn() {
		WebElement authenticationSignin = driver.findElement(clk_authenticationsignin);
		authenticationSignin.click();
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


