package org.demo_automationtesting_in.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
		
	public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@ng-model='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@ng-model='LastName']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailAddress;
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@value='Male']")
	private WebElement maleGenderRadioBtn;
	
	@FindBy(xpath = "//input[@value='FeMale']")
	private WebElement femaleGenderRadioBtn;
	
	@FindBy(xpath = "//input[@value='Cricket']")
	private WebElement hobbyCricketCheckbox;
	
	@FindBy(xpath = "//input[@value='Movies']")
	private WebElement hobbyMoviesCheckbox;
	
	@FindBy(xpath = "//input[@value='Hockey']")
	private WebElement hobbyHockeyCheckbox;
	
	@FindBy(xpath = "//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
	private WebElement languageMultiSelectBox;
	
	@FindBy(xpath = "//a[text()='English']")
	private WebElement languageEnglish;
	
	@FindBy(xpath = "//a[text()='Urdu']")
	private WebElement languageUrdu;
	
	@FindBy(xpath = "//select[@id='Skills']")
	private WebElement skillsSelect;
	
	@FindBy(xpath = "//select[@id='country']")
	private WebElement countrySelect;
	
	@FindBy(xpath = "//select[@ng-model='yearbox']")
	private WebElement yearSelect;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement monthSelect;
	
	@FindBy(xpath = "//select[@placeholder='Day']")
	private WebElement daySelect;
	
	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	private WebElement submitBtn;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
	}

	public WebElement getMaleGenderRadioBtn() {
		return maleGenderRadioBtn;
	}

	public void setMaleGenderRadioBtn(WebElement maleGenderRadioBtn) {
		this.maleGenderRadioBtn = maleGenderRadioBtn;
	}

	public WebElement getHobbyCricketCheckbox() {
		return hobbyCricketCheckbox;
	}

	public void setHobbyCricketCheckbox(WebElement hobbyCricketCheckbox) {
		this.hobbyCricketCheckbox = hobbyCricketCheckbox;
	}

	public WebElement getHobbyMoviesCheckbox() {
		return hobbyMoviesCheckbox;
	}

	public void setHobbyMoviesCheckbox(WebElement hobbyMoviesCheckbox) {
		this.hobbyMoviesCheckbox = hobbyMoviesCheckbox;
	}

	public WebElement getLanguageMultiSelectBox() {
		return languageMultiSelectBox;
	}

	public void setLanguageMultiSelectBox(WebElement languageMultiSelectBox) {
		this.languageMultiSelectBox = languageMultiSelectBox;
	}

	public WebElement getLanguageEnglish() {
		return languageEnglish;
	}

	public void setLanguageEnglish(WebElement languageEnglish) {
		this.languageEnglish = languageEnglish;
	}

	public WebElement getLanguageUrdu() {
		return languageUrdu;
	}

	public void setLanguageUrdu(WebElement languageUrdu) {
		this.languageUrdu = languageUrdu;
	}

	public WebElement getSkillsSelect() {
		return skillsSelect;
	}

	public void setSkillsSelect(WebElement skillsSelect) {
		this.skillsSelect = skillsSelect;
	}

	public WebElement getCountrySelect() {
		return countrySelect;
	}

	public void setCountrySelect(WebElement countrySelect) {
		this.countrySelect = countrySelect;
	}

	public WebElement getYearSelect() {
		return yearSelect;
	}

	public void setYearSelect(WebElement yearSelect) {
		this.yearSelect = yearSelect;
	}

	public WebElement getMonthSelect() {
		return monthSelect;
	}

	public void setMonthSelect(WebElement monthSelect) {
		this.monthSelect = monthSelect;
	}

	public WebElement getDaySelect() {
		return daySelect;
	}

	public void setDaySelect(WebElement daySelect) {
		this.daySelect = daySelect;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public WebElement getFemaleGenderRadioBtn() {
		return femaleGenderRadioBtn;
	}

	public void setFemaleGenderRadioBtn(WebElement femaleGenderRadioBtn) {
		this.femaleGenderRadioBtn = femaleGenderRadioBtn;
	}

	public WebElement getHobbyHockeyCheckbox() {
		return hobbyHockeyCheckbox;
	}

	public void setHobbyHockeyCheckbox(WebElement hobbyHockeyCheckbox) {
		this.hobbyHockeyCheckbox = hobbyHockeyCheckbox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}
	
}
