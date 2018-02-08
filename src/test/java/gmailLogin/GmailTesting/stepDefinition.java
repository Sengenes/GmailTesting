package gmailLogin.GmailTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import sun.security.util.PendingException;

public class stepDefinition {
	/*
	 * Feature: Gmail Testing
	 * 
	 * Scenario: Gmail Login #
	 * C:/Users/angeles.sengenes/Documents/Java/WorkspaceA/GmailTesting/src/test/
	 * java/demo.feature:3 Given url opened # null Then enter user id and click next
	 * # null Then enter password # null And click login # null
	 * 
	 * Scenario: Gmail Close #
	 * C:/Users/angeles.sengenes/Documents/Java/WorkspaceA/GmailTesting/src/test/
	 * java/demo.feature:10 Then Close browser # null
	 * 
	 * 2 Scenarios (2 undefined) 5 Steps (5 undefined) 0m0,048s
	 * 
	 * 
	 * You can implement missing steps with the snippets below:
	 */
	public WebDriver driver;

	@Given("^url opened$")
	public void url_opened() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.gecko.driver", "C:/Webdrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");

		throw new PendingException();
	}

	@Then("^enter user id and click next$")
	public void enter_user_id_and_click_next() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.id("Email")).sendKeys("user@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);

		throw new PendingException();
	}

	@Then("^enter password$")
	public void enter_password() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.id("Passwd")).sendKeys("password");

		throw new PendingException();
	}

	@Then("^click login$")
	public void click_login() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.id("signIn")).click();
		Thread.sleep(6000);

		throw new PendingException();
	}

	@Then("^Close browser$")
	public void close_browser() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.quit();

		throw new PendingException();
	}

}