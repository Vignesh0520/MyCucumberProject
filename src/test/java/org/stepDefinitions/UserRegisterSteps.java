package org.stepDefinitions;

import java.io.IOException;

import org.base.BaseClass;
import org.demo_automationtesting_in.pages.RegisterPage;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisterSteps extends BaseClass {

	private RegisterPage registerPage;

	@Given("the user should be using browser {string} to navigate to url {string}")
	public void the_user_should_be_using_browser_to_navigate_to_url(String string, String string2) {
		browserLaunch(string, string2);
		implicitlyWait("seconds", 10);
		registerPage = new RegisterPage(getDriver());
	}

	@When("the user enters first name {string} and last name {string}")
	public void the_user_enters_first_name_and_last_name(String string, String string2) {
		registerPage.getFirstName().sendKeys(string);
		registerPage.getLastName().sendKeys(string2);
	}
	
	@When("the user enters address, email address {string} and phone number {string}")
	public void the_user_enters_address_email_address_and_phone_number(String string, String string2) {
		String address = "3/282, Mariyamman Kovil Theru, Manavalanallur, Eravancheri";
		registerPage.getAddress().sendKeys(address);
		registerPage.getEmailAddress().sendKeys(string);
		registerPage.getPhone().sendKeys(string2);
	}

	@When("the user select gender and hobbies")
	public void the_user_select_gender_and_hobbies() {
		registerPage.getMaleGenderRadioBtn().click();
		registerPage.getHobbyCricketCheckbox().click();
		registerPage.getHobbyMoviesCheckbox().click();
		registerPage.getHobbyHockeyCheckbox().click();
	}

	@When("the user select the languages and skill")
	public void the_user_select_the_languages_and_skill() throws InterruptedException {
		registerPage.getLanguageMultiSelectBox().click();
		Thread.sleep(500);
		registerPage.getLanguageEnglish().click();
		registerPage.getLanguageUrdu().click();
		WebElement skillsSelect = registerPage.getSkillsSelect();
		selectOptionByValue(skillsSelect, "Java");
	}

	@When("the user selects the country {string} and date of birth Year {string} Month {string} Day {string}")
	public void the_user_selects_the_country_and_date_of_birth_year_month_day(String string, String string2,
			String string3, String string4) {
		selectOptionByValue(registerPage.getCountrySelect(), string);
		selectOptionByValue(registerPage.getYearSelect(), string2);
		selectOptionByValue(registerPage.getMonthSelect(), string3);
		selectOptionByValue(registerPage.getDaySelect(), string4);
	}

	@When("the user sets the password {string} and confirm password {string}")
	public void the_user_sets_the_password_and_confirm_password(String string, String string2) {
		registerPage.getPassword().sendKeys(string);
		registerPage.getConfirmPassword().sendKeys(string2);
		registerPage.getSubmitBtn().click();
	}

	@Then("take screenshot after taking all input")
	public void take_screenshot_after_taking_all_input() throws IOException, InterruptedException {
		String filepath = "C:\\Users\\vigneshraja\\eclipse-workspace\\MyCucumberProject\\target\\screenshots";
		scrollToTop();
		Thread.sleep(500);
		screenshot("Screenshot_1", filepath);
		scrollToBottom();
		Thread.sleep(500);
		screenshot("Screenshot_2", filepath);
		closeAllBrowserWindow();
	}

}
