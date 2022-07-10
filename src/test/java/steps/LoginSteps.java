package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver; 
	loginPage LoginPage;
	@Given("Lunch the Chrome Browser")

	public void lunch_the_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		LoginPage =new loginPage(driver);
	   
	}

	@When("open url{string}")
	public void open_url(String url) {
		driver.get(url);
	   
	}

	@When("enter user name {string}")
	public void enter_user_name(String user) {
		LoginPage.enterUserId(user);
	    
	}

	@When("enter password {string}")
	public void enter_password(String password) {
		LoginPage.enterpassword(password);
	  
	}

	@When("click login button")
	public void click_login_button() {
		LoginPage.clickLogin();
	    
	}

	@Then("verify the Title {string}")
	public void verify_the_Title(String exceptedTitle) {
	   String actualTitle=driver.getTitle();
	   Assert.assertEquals(actualTitle, exceptedTitle);
	}


}
