package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepdef {
	
	public WebDriver driver;
	
	@Given("^I want to navigate to amazon home page$")
	public void i_want_to_navigate_to_amazon_home_page() throws Throwable {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mdvp/Desktop/SELENIUM/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	}


	@When("^click hello sign in button$")
	public void click_hello_sign_in_button() throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^enter \"([^\"]*)\" username$")
	public void enter_username(String arg1) throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^click continue button$")
	public void click_continue_button() throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^enter \"([^\"]*)\" password$")
	public void enter_password(String arg1) throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^sign in button$")
	public void sign_in_button() throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should navigate to amazon home screen after login$")
	public void user_should_navigate_to_amazon_home_screen_after_login() throws Throwable {
		System.out.println("I am on amazon page");
	    // Write code here that turns the phrase above into concrete actions
	}

}
