package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomepageSuccess;

public class Pomahomestep {

    static WebDriver driver;
    private HomepageSuccess homepageSuccess;

        @Given("User is on the home page")
        public void user_is_on_the_home_page() {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
        // Initialize Chrome driver
        driver = new ChromeDriver();
        // Navigate to the webpage 
        driver.get("http://pumobeauty.com/master/home");
        // Maximize the window
        driver.manage().window().maximize();
        // Initialize HomepageSuccess instance
        homepageSuccess = new HomepageSuccess(driver);
      
    }

    @When("user click on hompage link")
    public void user_click_on_hompage_link() {
        homepageSuccess.clickOnHomePageLink();
    }

    @Then("user click on alert")
    public void user_click_on_alert() {
        homepageSuccess.clickOnAlertButton();
    }

    @When("User searches for {string}")
    public void user_searches_for(String product) throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.searchForProduct(product);
        Actions actions = new Actions(driver);
		actions.perform();
		actions.sendKeys(Keys.ENTER).build().perform();
    }

    @When("user click on searchproduct")
    public void user_click_on_searchproduct() throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.clickOnSearchButton();
    }

    @Then("User clicks on a product photo")
    public void user_clicks_on_a_product_photo() throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.clickOnPowderPlateImage();
    }

    @When("user click on cart")
    public void user_click_on_cart() throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.clickOnAddToCartButton();
    }

    @When("User enters mobile number {string}")
    
    public void user_enters_mobile_number(String mobilenumber) throws InterruptedException {
    	Thread.sleep(4000);
        homepageSuccess.enterMobileNumber(mobilenumber);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.enterPassword(password);
    }

    @When("User clicks on the submit button")
    public void user_clicks_on_the_submit_button() throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.clickOnSubmitButton();
    }
    
    

    @Given("User click on spectrumimg product")
    public void user_click_on_spectrumimg_product() throws InterruptedException{
    	Thread.sleep(4000);
        homepageSuccess.clickOnSpectrumImage();
    }

    @When("User click on buy")
    public void user_click_on_buy() {
        homepageSuccess.clickOnBuy();
    }
  

    @When("User fill mobile number {string}")
    public void user_fill_mobile_number(String mobilenumber) throws InterruptedException {
    	Thread.sleep(4000);
    	homepageSuccess.enterMobileNumber(mobilenumber);
    }
    @When("User fill password {string}")
    public void user_fill_password(String password) throws InterruptedException {
    	Thread.sleep(2000);
        homepageSuccess.enterPassword(password);
    }

    @When("User enter on the submit button")
    public void user_enter_on_the_submit_button() throws InterruptedException {
    	Thread.sleep(2000);
        
       homepageSuccess.clickOnSubmitButton();
    }

    @Then("User click on a spectrumimg product photo")
    public void user_click_on_a_spectrumimg_product_photo() throws InterruptedException {
    	Thread.sleep(4000);
        homepageSuccess.clickOnSpectrumImage();
    }

    @Then("User again Click on buy")
    public void user_again_click_on_buy() throws InterruptedException {
    	Thread.sleep(3000);
       homepageSuccess.clickOnBuy();
    }

    @When("User click on palce order button")
    public void user_click_on_palce_order_button() throws InterruptedException {
    	Thread.sleep(3000);
        homepageSuccess.clickonplace();
    }

    @Then("User filled all form")
    public void user_filled_all_form() {
        homepageSuccess.enterCity("pune");
        homepageSuccess.enterCountry("india");
        homepageSuccess.enterEmail("balajihaibatpure@gmail.com");
        homepageSuccess.enterMobile("9730079029");
        homepageSuccess.enterName("balaji");
        homepageSuccess.enterState("maharashtra");
        homepageSuccess.enterZipCode("413517");
    }

    @Then("User click on saveaddress button")
    public void user_click_on_saveaddress_button() throws InterruptedException {
    	Thread.sleep(3000);
        homepageSuccess.saveAddress();
    }

    @When("User click on radio button")
    public void user_click_on_radio_button() throws InterruptedException {
    	Thread.sleep(5000);
    	 homepageSuccess.clickRadioButton();
    }
        @When("user click on select payment Method1")
        public void user_click_on_select_payment_method1() throws InterruptedException {
            Thread.sleep(5000);
        WebElement selectwebelement = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select sc =new Select(selectwebelement);
        sc.selectByVisibleText("Online");
    
        }
    @Then("User click on place order 2")
    public void user_click_on_place_order() throws InterruptedException {
    	Thread.sleep(3000);
    	
        homepageSuccess.palceorder2();  
    }

    }        