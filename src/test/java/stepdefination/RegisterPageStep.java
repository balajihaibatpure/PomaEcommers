package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.RegisterPageSuccess;

public class RegisterPageStep {
    static WebDriver driver;
    private RegisterPageSuccess registerPageSuccess;
    @Given("user on pumo home page")
    public void user_on_pumo_home_page() {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://pumobeauty.com/master/home");
        driver.manage().window().maximize();
        registerPageSuccess = new RegisterPageSuccess(driver);
    }

    @And("user enter on alert")
    public void user_enter_on_alert() throws InterruptedException {
    	Thread.sleep(2000);
        registerPageSuccess.clickAlertButton();
    }

    @When("User click on register")
    public void user_clicks_on_register() throws InterruptedException {
    	Thread.sleep(3000);
        registerPageSuccess.clickregisterButton();
        
    }

    @When("User Enter the name {string}")
    public void user_enter_the_name(String username) throws InterruptedException {
    	Thread.sleep(3000);
        registerPageSuccess.ClickUsername(username);
    }

    @When("User Enter the number {string}")
    public void user_enter_the_number(String mobile) throws InterruptedException {
    	Thread.sleep(3000);
        registerPageSuccess.clickmobile(mobile);
    }

    @When("User Enter the mail {string}")
    public void user_enter_the_mail(String mail) throws InterruptedException {
    	Thread.sleep(3000);
        registerPageSuccess.ClickOnmail(mail);
    }

    @When("User Enter the password {string}")
    public void user_enter_the_password(String password) throws InterruptedException {
    	Thread.sleep(3000);
        registerPageSuccess.clickonpassword(password);
    }
    @When("User Enter the conformpassword\"BAla@{int}\"")
    public void user_enter_the_conformpassword_b_ala(Integer int1) {
        registerPageSuccess.clickonconfrim(int1);
    }

   

    @When("User click on submit button")
    public void user_clicks_on_submit_button() {
        registerPageSuccess.clickonsubmit();
    }

    @Then("User complete his registration jurany successfully")
    public void user_complete_his_registration_jurany_successfully() {
        
    }
}
