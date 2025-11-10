package org.maveric_systems_dot_com;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MavericSystemsDotCom {

	public MavericSystemsDotCom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='sub-menu']/preceding-sibling::a[text()='AI@Scale']")
	private WebElement ai_at_scale_menu;

	@FindBy(xpath = "//a[text()='AI@Scale']/following-sibling::ul/li/a")
	private List<WebElement> ai_at_scale_subMenu;

	@FindBy(xpath = "//a[text()='Domain']")
	private WebElement domain_menu;

	@FindBy(xpath = "//a[text()='Domain']/following-sibling::ul/li/a")
	private List<WebElement> domain_subMenu;

	@FindBy(xpath = "//a[text()='Solutions']")
	private WebElement solutions_menu;

	@FindBy(xpath = "//a[text()='Solutions']/following-sibling::ul/li/a")
	private List<WebElement> solutions_subMenu;

	@FindBy(xpath = "//a[text()='Service Lines']")
	private WebElement serviceLines_menu;

	@FindBy(xpath = "//a[text()='Service Lines']/following-sibling::ul/li/a")
	private List<WebElement> serviceLines_subMenu;

	@FindBy(xpath = "//a[text()='Insights']")
	private WebElement insights_menu;

	@FindBy(xpath = "//a[text()='Insights']/following-sibling::ul/li/a")
	private List<WebElement> insights_subMenu;

	@FindBy(xpath = "//a[text()='About Maveric']")
	private WebElement aboutMaveric_menu;

	@FindBy(xpath = "//a[text()='About Maveric']/following-sibling::ul/li/a")
	private List<WebElement> aboutMaveric_subMenu;

	public WebElement getAi_at_scale_menu() {
		return ai_at_scale_menu;
	}

	public List<WebElement> getAi_at_scale_subMenu() {
		return ai_at_scale_subMenu;
	}

	public WebElement getDomain_menu() {
		return domain_menu;
	}

	public List<WebElement> getDomain_subMenu() {
		return domain_subMenu;
	}

	public WebElement getSolutions_menu() {
		return solutions_menu;
	}

	public List<WebElement> getSolutions_subMenu() {
		return solutions_subMenu;
	}

	public WebElement getServiceLines_menu() {
		return serviceLines_menu;
	}

	public List<WebElement> getServiceLines_subMenu() {
		return serviceLines_subMenu;
	}

	public WebElement getInsights_menu() {
		return insights_menu;
	}

	public void setInsights_menu(WebElement insights_menu) {
		this.insights_menu = insights_menu;
	}

	public List<WebElement> getInsights_subMenu() {
		return insights_subMenu;
	}

	public void setInsights_subMenu(List<WebElement> insights_subMenu) {
		this.insights_subMenu = insights_subMenu;
	}

	public void setAi_at_scale_menu(WebElement ai_at_scale_menu) {
		this.ai_at_scale_menu = ai_at_scale_menu;
	}

	public void setAi_at_scale_subMenu(List<WebElement> ai_at_scale_subMenu) {
		this.ai_at_scale_subMenu = ai_at_scale_subMenu;
	}

	public void setDomain_menu(WebElement domain_menu) {
		this.domain_menu = domain_menu;
	}

	public void setDomain_subMenu(List<WebElement> domain_subMenu) {
		this.domain_subMenu = domain_subMenu;
	}

	public void setSolutions_menu(WebElement solutions_menu) {
		this.solutions_menu = solutions_menu;
	}

	public void setSolutions_subMenu(List<WebElement> solutions_subMenu) {
		this.solutions_subMenu = solutions_subMenu;
	}

	public void setServiceLines_menu(WebElement serviceLines_menu) {
		this.serviceLines_menu = serviceLines_menu;
	}

	public void setServiceLines_subMenu(List<WebElement> serviceLines_subMenu) {
		this.serviceLines_subMenu = serviceLines_subMenu;
	}

	public WebElement getAboutMaveric_menu() {
		return aboutMaveric_menu;
	}

	public void setAboutMaveric_menu(WebElement aboutMaveric_menu) {
		this.aboutMaveric_menu = aboutMaveric_menu;
	}

	public List<WebElement> getAboutMaveric_subMenu() {
		return aboutMaveric_subMenu;
	}

	public void setAboutMaveric_subMenu(List<WebElement> aboutMaveric_subMenu) {
		this.aboutMaveric_subMenu = aboutMaveric_subMenu;
	}

}