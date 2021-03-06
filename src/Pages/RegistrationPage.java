package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	protected WebDriver driver;
	
	By firstName = By.id("name_3_firstname");
	By lastName = By.id("name_3_lastname");
	By martialStatus = By.xpath("//input[@value='married']");
	By hobby01 = By.xpath("//input[@value='dance']");
	By hobby02 = By.xpath("//input[@value='cricket ']");
	By country = By.id("dropdown_7");
	By month = By.id("mm_date_8");
	By day = By.id("dd_date_8");
	By year = By.id("yy_date_8");
	By phoneNumber = By.id("phone_9");
	By username = By.id("username");
	By eMail = By.id("email_1");
	By profilePic = By.id("profile_pic_10");
	By description = By.id("description");
	By password = By.id("password_2");
	By confirmPassword = By.id("confirm_password_password_2");
	By submit = By.name("pie_submit");
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public RegistrationPage navigateRegistrationPage() throws InterruptedException {
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/registration/");
		Thread.sleep(2000);
		return new RegistrationPage(driver);
		
		
	}
	
	
	public RegistrationPage clearFields() {
		
		driver.findElement(firstName).clear();
		driver.findElement(lastName).clear();
		driver.findElement(phoneNumber).clear();
		driver.findElement(username).clear();
		driver.findElement(eMail).clear();
		driver.findElement(description).clear();
		driver.findElement(password).clear();
		driver.findElement(confirmPassword).clear();
		return new RegistrationPage(driver);
	}
	
	public RegistrationPage registerUser(String fName, String lName, String sCountry, String sMonth, String sDay, String sYear, String sPhoneNo, String sUsername, String sEMail, String sUploadPath, String sDescription, String sPassword, String sConfirmPass) {
		

		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		new Select(driver.findElement(country)).selectByValue(sCountry);
		new Select(driver.findElement(month)).selectByValue(sMonth);
		new Select(driver.findElement(day)).selectByValue(sDay);
		new Select(driver.findElement(year)).selectByValue(sYear);
		driver.findElement(phoneNumber).sendKeys(sPhoneNo);
		driver.findElement(username).sendKeys(sUsername);
		driver.findElement(eMail).sendKeys(sEMail);
		driver.findElement(profilePic).sendKeys(sUploadPath);
		driver.findElement(description).sendKeys(sDescription);
		driver.findElement(password).sendKeys(sPassword);
		driver.findElement(confirmPassword).sendKeys(sConfirmPass);
		return new RegistrationPage(driver);
		
	}
	
	public RegistrationPage clickOnFields() {
		
		driver.findElement(martialStatus).click();
		driver.findElement(hobby01).click();
		driver.findElement(hobby02).click();
		return new RegistrationPage(driver);
	}
	
	public RegistrationPage clickOnSubmit() {
		
		driver.findElement(submit).click();
		return new RegistrationPage(driver);
	}


}
