package org.stepdefinition;



import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilies.BaseClassMethods;

import io.cucumber.java.en.*;

public class FBLogin extends BaseClassMethods{
	@Given("user should launch the chrome browser")
	public void user_should_launch_the_chrome_browser() {
		launchChrome();
		
		
	 
	}

	@When("user should type the url")
	public void user_should_type_the_url() {
	    loadUrl("https:\\www.facebook.com\\");
	}

	@When("user should maximise the window")
	public void user_should_maximise_the_window() {
		windMax();
	}

	@When("user should type the invalid username and invalid password")
	public void user_should_type_the_invalid_username_and_invalid_password() throws IOException {
	   WebElement user = driver.findElement(By.id("email"));
	   passValue(user, "bharath");
	   WebElement pass = driver.findElement(By.id("pass"));
	   passValue(pass, "bharasth@123");
	
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@When("user should get the title of the incorrect credential page")
	public void user_should_get_the_title_o_fthe_incorrect_credential_page() {
		String title = driver.getTitle();
	   System.out.println(title);
	}

	


}
