package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AllcategoriesPageSuccesses;

public class Allcategoriespagestep {

	static WebDriver driver;
    private AllcategoriesPageSuccesses allcategoriesPageSuccesses;
        @Given("User is on the home page1")
        public void user_is_on_the_home_page1() {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
        // Initialize Chrome driver
        driver = new ChromeDriver();
        // Navigate to the webpage 
        driver.get("http://pumobeauty.com/master/home");
        // Maximize the window
        driver.manage().window().maximize();
        // Initialize HomepageSuccess instance
        allcategoriesPageSuccesses =new AllcategoriesPageSuccesses(driver);
      
    }
        @Then("user click on alert1")
        public void user_click_on_alert1() throws InterruptedException {
        	Thread.sleep(2000);
          allcategoriesPageSuccesses.clickAlertButton();
        }


     @Given("User click on allcategoriespage")
      public void user_click_on_allcategoriespage() throws InterruptedException{
    	 Thread.sleep(2000);
    allcategoriesPageSuccesses.clickOnAllcategories();
}

@Given("User click on makeup")
public void user_click_on_makeup() throws InterruptedException {
	Thread.sleep(2000);
    allcategoriesPageSuccesses.ClickonMakeup();
}
//@When("open the makeup page")
//public void open_the_makeup_page() {
//    allcategoriesPageSuccesses.ClickonMakeupImage();
//}

@When("user select lips categories product")
public void user_select_lips_categories_product() throws InterruptedException {
	Thread.sleep(2000);
    allcategoriesPageSuccesses.ClickomLips();
}

@When("user click on product")
public void user_click_on_product() throws InterruptedException {
	Thread.sleep(2000);
    allcategoriesPageSuccesses.ClickonSUGARPOPMatte();
}

@When("user click on buy button")
public void user_click_on_buy_button() throws InterruptedException {
	Thread.sleep(3000);
    allcategoriesPageSuccesses.clickOnBuy();
}
@When("User fill mobile number1 {string}")
public void user_fill_mobile_number1(String mobilenumber) throws InterruptedException {
	Thread.sleep(3000);
    allcategoriesPageSuccesses.enterMobileNumber(mobilenumber);
}

@When("User fill password1 {string}")
public void user_fill_password1(String password) throws InterruptedException {
	Thread.sleep(3000);
    allcategoriesPageSuccesses.enterPassword(password);
}

@When("User enter on the submit button1")
public void user_enter_on_the_submit_button1() {
    allcategoriesPageSuccesses.clickSubmitButton();
}
 @Then("user create his account successesfully")
 public void user_create_his_account_successesfully() {
   System.out.println("created");
}

 @Given("User click  again on aalcategoriespage")
 public void user_click_again_on_aalcategoriespage() throws InterruptedException {
	 Thread.sleep(3000);
   allcategoriesPageSuccesses.clickOnAllcategories();
}

 @Given("User click on again makeup")
 public void user_click_on_again_makeup() throws InterruptedException {
	 Thread.sleep(3000);
	 allcategoriesPageSuccesses.ClickonMakeup();
    }
//
// @When("open the again makeup page")
// public void open_the_again_makeup_page() {
//   
//}

 @When("user select agian lips categories product")
 public void user_select_agian_lips_categories_product() throws InterruptedException {
	 Thread.sleep(3000);
    allcategoriesPageSuccesses.ClickomLips();
}
 

@When("User click on buy button")
public void user_click_on_buy_button1() throws InterruptedException {
	Thread.sleep(3000);
    allcategoriesPageSuccesses.clickOnBuy();
}



@When("user select palceorder button")
public void user_select_palceorder_button() {
    allcategoriesPageSuccesses.clioknplace();
}

@When("user filled all form")
public void user_filled_all_form() {
	allcategoriesPageSuccesses.enterCity("pune");
    allcategoriesPageSuccesses.enterCountry("india");
    allcategoriesPageSuccesses.enterEmail("balajihaibatpure@gmail.com");
    allcategoriesPageSuccesses.enterMobile("9730079029");
    allcategoriesPageSuccesses.enterName("balaji");
    allcategoriesPageSuccesses.enterState("maharashtra");
    allcategoriesPageSuccesses.enterZipCode("413517");
}

@When("user select save address button")
public void user_select_save_address_button() {
   allcategoriesPageSuccesses.saveAddress();
}


@When("user select cheak box")
public void user_select_cheak_box() throws InterruptedException {
	Thread.sleep(3000);
    allcategoriesPageSuccesses.clickRadioButton();
}



@When("user click on select payment Method")
public void user_click_on_select_payment_method() throws InterruptedException {
	Thread.sleep(4000);
    WebElement selectwebelement = driver.findElement(By.xpath("//select[@class='form-select']"));
    Select sc =new Select(selectwebelement);
    sc.selectByVisibleText("Cash on delivery");
}

@When("user click on cash on delivery")
public void user_click_on_cash_on_delivery() {
	allcategoriesPageSuccesses.checkout();
    
}

@Then("user purchess the cusumize product sccessefully")
public void user_purchess_the_cusumize_product_sccessefully() {
    System.out.println("successfully checkout");
}



}  