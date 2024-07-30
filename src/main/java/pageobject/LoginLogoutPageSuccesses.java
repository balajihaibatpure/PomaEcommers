package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPageSuccesses {

    WebDriver driver;

    // Constructor
    public LoginLogoutPageSuccesses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbutton1;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberField;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordField;
  
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
     
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton1;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbutton2;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberField1;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordField1;
  
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton1;
    //@FindBy(xpath = "")
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButtonA;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbuttonB;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberFieldC;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordFieldD;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButtonE;
    
    @FindBy(xpath = "//span[@class='ps-2 cart ng-star-inserted']")
     private WebElement profilebutton;
    
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logoutbutton;
    
    
    public void clickAlertButton() {
    	alertButton.click();
    }
    public void clickonlogin() {
		loginbutton1.click();
	}
    public void enterMobileNumber(String number) {
        mobileNumberField.sendKeys(number);
    }
    
    public void enterPassword(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButton() {
        submitButton.click(); 
    }
    public void clickonalertbutton1() {
		alertButton1.click();
	}
    public void clickonlogin1() {
		loginbutton2.click();
	}
    public void enterMobileNumber1(String number) {
        mobileNumberField.sendKeys(number);
    }
    
    public void enterPassword1(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButton1() {
        submitButton.click(); 
    }
    public void clickAlertButtonA() {
    	alertButton.click();
    }
    public void clickonloginB() {
		loginbutton1.click();
	}
    public void enterMobileNumberC(String number) {
        mobileNumberField.sendKeys(number);
    }
    
    public void enterPasswordD(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButtonC() {
        submitButton.click(); 
    }
    public void Clickonprofile() {
		profilebutton.click();
	}
    public void Clickonlogout() {
		logoutbutton.click();
	}
    
}
