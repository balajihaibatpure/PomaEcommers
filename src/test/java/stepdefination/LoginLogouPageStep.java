package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginLogoutPageSuccesses;

public class LoginLogouPageStep {
	 static WebDriver driver;
	  private LoginLogoutPageSuccesses loginLogoutPageSuccesses;


      @Given("User is on the home pageA")
      public void user_is_on_the_home_pageA() {
      // Set Chrome driver path
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
      // Initialize Chrome driver
      driver = new ChromeDriver();
      // Navigate to the webpage
      driver.get("http://pumobeauty.com/master/home");
      // Maximize the window
      driver.manage().window().maximize();
      // Initialize HomepageSuccess instance
      loginLogoutPageSuccesses = new LoginLogoutPageSuccesses(driver);
     
    
  }  
  

@Then("user click on alertB")
public void user_click_on_alert_B() throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.clickAlertButton();
}

@When("User clicks on the login sectionA")
public void user_clicks_on_the_login_section_a() throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.clickonlogin();
}



@When("User logs in with username {string}")
public void user_logs_in_with_username(String username) throws InterruptedException {
	Thread.sleep(2000);
	loginLogoutPageSuccesses.enterMobileNumber(username);
    
}

@When("User enter password {string}")
public void user_enter_password(String password) throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.enterPassword(password);
}

@Then("User should be successfully logged")
public void user_should_be_successfully_logged() throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.clickSubmitButton();
    
}
@When("User clicks on the login sectionB")
public void user_clicks_on_the_login_section_b() throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.clickonlogin1();
    }
@Then("user click on alertB1")
public void user_click_on_alert_B1() throws InterruptedException {
	Thread.sleep(2000);
    loginLogoutPageSuccesses.clickonalertbutton1();
}
@When("User logs in with username1 {string}")
public void user_logs_in_with_username1(String username) throws InterruptedException {
	Thread.sleep(3000);
   loginLogoutPageSuccesses.enterMobileNumber1(username);
}

@When("User enter password1 {string}")
public void user_enter_password1(String password) throws InterruptedException {
	Thread.sleep(3000);
    loginLogoutPageSuccesses.enterPassword1(password);
    
}
@Then("User should be unsuccessfully logged")
public void user_should_be_unsuccessfully_logged() {
    System.out.println("unsuccessfully");
}
@When("User clicks on the login sectionC")
public void user_clicks_on_the_login_section_c() {
   loginLogoutPageSuccesses.clickonloginB();
}



@Given("User click on his profile name")
public void user_click_on_his_profile_name() throws InterruptedException {
	Thread.sleep(3000);
    loginLogoutPageSuccesses.Clickonprofile();
}

@Given("User select the logout button")
public void user_select_the_logout_button() {
    loginLogoutPageSuccesses.Clickonlogout();
}

}


