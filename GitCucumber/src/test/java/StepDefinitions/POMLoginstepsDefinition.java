/*package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pageObject.Loginpage;

public class POMLoginstepsDefinition {
	
	static WebDriver driver;
	Loginpage login;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/v1/"); 
	}
	
    
	//@When("user enters valid username and password")
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws Exception {
	//public void user_enters_valid_username_and_password() {
		
		login= new Loginpage(driver);
		login.enterusername(username);
		login.enterpassword(password);
		//login.enterusername(standard_user);
		//login.enterpassword(secret_sauce);
		
	    
	//	driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		//Thread.sleep(2000);
		
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		//driver.findElement(By.id("login-button")).click();
		login.ClickLogin();
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		login.isLogoDisplayed();
	   //Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"user is navigated to home page");
	}

	@And("Close the browser")
	public void close_the_brower() {
	   driver.quit();
	}




}*/
