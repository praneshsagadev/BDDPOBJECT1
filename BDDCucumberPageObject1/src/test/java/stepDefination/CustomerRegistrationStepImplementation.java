package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CustomerRegPageObject;

public class CustomerRegistrationStepImplementation {
	
 	static WebDriver driver;

 
 	
	@Given("^I load the url \"(.+)\"$")

	public void loadTheUrl(String url) throws IOException {
		WebDriverManager.chromedriver().setup();
		 if(driver==null)
		 driver = new ChromeDriver();
		 new CustomerRegPageObject(driver);
		 

		driver.get(url);
	}
	
	@Then("^I enter name (.*)$")
	public void enterUsername(String NAME) {
		CustomerRegPageObject.enterName(NAME);
	}
	@And("^I enter age (.+)$")
	public void enterAge(String AGE) {
		CustomerRegPageObject.enterAge(AGE);
	}
	@And("^I enter address (.*)$")
	public void enterAddress(String ADDRESS) {
		CustomerRegPageObject.enterAddress(ADDRESS);
	}
	@And("^I enter number (.*)$")
	public void enterNumber(String NUMBER) {
		CustomerRegPageObject.enterNumber(NUMBER);
		
	}
	@And("^I enter email (.*)$")
	public void enterEmail(String EMAIL) {
		CustomerRegPageObject.enterEmail(EMAIL);
	}
	@And("^I click submit button$")
	public void clickButton() {
		

		CustomerRegPageObject.clickTheButton();
	}

}
