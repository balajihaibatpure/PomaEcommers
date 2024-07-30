 package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageSuccess {

    WebDriver driver;

    // Constructor
    public HomepageSuccess(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//a[@class='nav-link'])[4]")
    private WebElement homePageLink;
    
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton;


    @FindBy(xpath = "//*[@placeholder='Search your product']")
    private WebElement searchTextElement;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/diutessme/image/upload/v1711711468/file_oskgjv.webp']")
    private WebElement powderPlateImage;

    @FindBy(xpath = "//button[@class='cart ng-star-inserted']")
    private WebElement addToCartButton;
 
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "(//div[@class='image col-md-4 col-6 ng-star-inserted'])[1]")
    private WebElement spectrumImage;
    
    @FindBy(xpath = "(//button[@class='buy'])[1]")
    private WebElement buyButton;
    
    @FindBy(xpath = "//button[@class='ajax-btn primary-btn w-100']")
    private WebElement placeorder;
    
    @FindBy(xpath = "//input[@data-placeholder='country']")
    private WebElement countryField;

    @FindBy(xpath = "//input[@data-placeholder='state']")
    private WebElement stateField;
    
    @FindBy(xpath = "//input[@data-placeholder='email']")
    private WebElement emailField;
    
    @FindBy(xpath = "//input[@data-placeholder='name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@data-placeholder='mobile number']")
    private WebElement mobileField;

    @FindBy(xpath = "//input[@data-placeholder='address 1']")
    private WebElement addressField;
    
    @FindBy(xpath = "//input[@data-placeholder='city']")
    private WebElement cityField;
    
    @FindBy(xpath = "//input[@data-placeholder='zip code']")
    private WebElement zipCodeField;
    
    @FindBy(xpath ="//button[@class='this ng-star-inserted']")
    private WebElement saveAddressButton;
    
    @FindBy(xpath  ="//input[@id='flexRadioDefault1']")
    private WebElement radioButton;
    
    @FindBy(xpath = "select[aria-label='Default select example']")
    private WebElement selectbutton;
   
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement selectpaclorder;
    
    // Methods
    public void clickOnHomePageLink() {
        homePageLink.click();
    }

    public void clickOnAlertButton() {
        alertButton.click();
    }

    public void searchForProduct(String productName) {
        searchTextElement.sendKeys(productName);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnPowderPlateImage() {
        powderPlateImage.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileNumberInput.sendKeys("9730079029");
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys("BAla@123");
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void clickOnSpectrumImage() {
     	spectrumImage.click();
    }
    
    public void clickOnBuy() {
     	buyButton.click();
     	
 	}
    public void clickonplace() {
    	placeorder.click();
    }
    
    public void enterCountry(String country) {
     	countryField.sendKeys("india");
    }
    
    public void enterState(String state) {
 		stateField.sendKeys("maharastra");
 	}
    
    public void enterEmail(String email) {
 		emailField.sendKeys("balajihaibatpure@gmail.com");
 	}
    
    public void enterName(String name) {
 		nameField.sendKeys("raju");
 	}
    
    public void enterMobile(String mobile) {
 		mobileField.sendKeys("9730079039");
 	}
    
    public void enterAddress(String address) {
 		addressField.sendKeys("pune");
 	}
    
    public void enterZipCode(String zip) {
 		zipCodeField.sendKeys("413517");
 	}
    
    public void enterCity(String city) {
     	cityField.sendKeys("pune");	
 	}
    
    public void saveAddress() {
 		saveAddressButton.click();
 	}
    
    public void clickRadioButton() {
		radioButton.click();
	}
    public void clickonselectbutton() {
		selectbutton.click();
	}
    public void palceorder2() {
		selectpaclorder.click();
	}
}