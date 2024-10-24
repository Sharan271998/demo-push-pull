package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Tc1_Login {
	static WebDriver driver;

	@Given("user is in bank login page")
	public void user_is_in_bank_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	}

	@When("user perform login using {string} and {string}")
	public void user_perform_login_using_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		;
		driver.findElement(By.name("password")).sendKeys(password);
		;
	}

	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	@Then("user validate the successful msg {string} with {string}")
	public void user_validate_the_successful_msg_with(String string, String string2) {
		string="Welcome dharsha g";
		Assert.assertEquals("verify", string, string2);
	}



	@Then("user validate the {string} with {string}")
	public void user_validate_the_with(String string, String string2) {
		//String text = driver.findElement(By.xpath("//p[@class=\"smallText\"]")).getText();
		Assert.assertEquals("verify", string, string2);
	}

}
