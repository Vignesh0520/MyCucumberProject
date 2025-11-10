package org.stepDefinitions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.maveric_systems_dot_com.MavericSystemsDotCom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MavericSubMenusSteps extends BaseClass {

	private MavericSystemsDotCom mavericSystemsDotCom;

	String filePath;

	private void writeMenuAndSubMenuToExcel(WebDriverWait wait, Sheet sheet, int columnIndex, WebElement menuElement,
			List<WebElement> subMenuElements, String menuTitle) throws InterruptedException {

		moveMouseToElement(menuElement);
		wait.until(ExpectedConditions.visibilityOfAllElements(subMenuElements));

		Row headerRow = sheet.getRow(0);
		if (headerRow == null) {
			headerRow = sheet.createRow(0);
		}
		Cell headerCell = headerRow.createCell(columnIndex);
		headerCell.setCellValue(menuTitle);
		System.out.println("Submenu size: " + subMenuElements.size());
		for (int i = 0; i < subMenuElements.size(); i++) {
			Row row = sheet.getRow(i + 1);
			if (row == null) {
				row = sheet.createRow(i + 1);
			}
			Cell cell = row.createCell(columnIndex);
			cell.setCellValue(subMenuElements.get(i).getText());
		}
	}

	@Given("the user gives the excel for input and output {string}")
	public void the_user_gives_the_excel_for_input_and_output(String string) {
		filePath = string;
	}

	@When("the user fetch the menus and sub menus from site and stores in excel")
	public void the_user_fetch_the_menus_and_sub_menus_from_site_and_stores_in_excel()
			throws IOException, InterruptedException {

		FileInputStream fileInputStream = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet input = workbook.getSheet("Browser_URL");
		Row browser_URL = input.getRow(0);
		String browser = browser_URL.getCell(0).getStringCellValue();
		String url = browser_URL.getCell(1).getStringCellValue();
		fileInputStream.close();

		Sheet sheet = workbook.getSheet("Output");
		if (sheet == null) {
			sheet = workbook.createSheet("Output");
		}

		browserLaunch(browser, url);
		implicitlyWait("seconds", 10);

		mavericSystemsDotCom = new MavericSystemsDotCom(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));

		// AI@Scale
		WebElement aiMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getAi_at_scale_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='AI@Scale']/following-sibling::ul/li/a")));
		List<WebElement> ai_at_scale_subMenu = mavericSystemsDotCom.getAi_at_scale_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 0, aiMenu, ai_at_scale_subMenu, aiMenu.getText());

		// Domain
		WebElement domainMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getDomain_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Domain']/following-sibling::ul/li/a")));
		List<WebElement> domain_subMenu = mavericSystemsDotCom.getDomain_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 1, domainMenu, domain_subMenu, domainMenu.getText());

		// Solutions
		WebElement solutionsMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getSolutions_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Solutions']/following-sibling::ul/li/a")));
		List<WebElement> solutions_subMenu = mavericSystemsDotCom.getSolutions_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 2, solutionsMenu, solutions_subMenu, solutionsMenu.getText());

		// Service Lines
		WebElement serviceLinesMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getServiceLines_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Service Lines']/following-sibling::ul/li/a")));
		List<WebElement> serviceLines_subMenu = mavericSystemsDotCom.getServiceLines_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 3, serviceLinesMenu, serviceLines_subMenu, serviceLinesMenu.getText());

		// Insights
		WebElement insightsMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getInsights_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Insights']/following-sibling::ul/li/a")));
		List<WebElement> insights_subMenu = mavericSystemsDotCom.getInsights_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 4, insightsMenu, insights_subMenu, insightsMenu.getText());

		// About Maveric
		WebElement aboutMenu = wait
				.until(ExpectedConditions.elementToBeClickable(mavericSystemsDotCom.getAboutMaveric_menu()));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='About Maveric']/following-sibling::ul/li/a")));
		List<WebElement> aboutMaveric_subMenu = mavericSystemsDotCom.getAboutMaveric_subMenu();
		writeMenuAndSubMenuToExcel(wait, sheet, 5, aboutMenu, aboutMaveric_subMenu, aboutMenu.getText());

		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		workbook.write(fileOutputStream);
		workbook.close();
		fileOutputStream.close();
		getDriver().quit();
	}

}
