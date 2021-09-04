package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import initializer.PropertyIntializer;

public class CustomerRegPageObject extends PropertyIntializer {
	
	static WebDriver driver;
	
	
	public  CustomerRegPageObject(WebDriver driv) throws IOException {
		driver=driv;
		
		PropertyIntializer.initialize();

		
	}
	
	
	public static void enterName(String name) {
		
		driver.findElement(By.name(prop.getProperty("Name"))).sendKeys(name);
	}
	
	public static void enterAge(String age) {
		driver.findElement(By.name(prop.getProperty("Age"))).sendKeys(age);
	}
	
	public static void enterAddress(String address) {
		driver.findElement(By.name(prop.getProperty("Address"))).sendKeys(address);
		
	}
	public static void enterNumber(String number) {
		driver.findElement(By.name(prop.getProperty("PhoneNumber"))).sendKeys(number);
	}
	
	public static void enterEmail(String email) {
		driver.findElement(By.name(prop.getProperty("Email"))).sendKeys(email);
	}
	
	public static void clickTheButton() {
		driver.findElement(By.id(prop.getProperty("Submitbutton"))).click();;
		
	}

}
