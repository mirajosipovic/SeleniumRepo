package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAuthenticationPage {
	WebDriver driver;

	WebElement emailAddress1ForAccountField;
	WebElement createAnAccountButton;
	WebElement mrsCheckBox;
	WebElement firstName1Field;
	WebElement lastName1Field;
	WebElement password1Field;
	
	Select selectDayOfBirth;
	Select selectMonthOfBirth;
	Select selectYearOfBirth;
	
	WebElement address1Field;
	
	Select selectState1CheckBox;
	
	WebElement city1Field;
	WebElement zip1Field;
	WebElement mobilePhone1Field;
	WebElement assignInAddress1Field;
	WebElement registerButton1;
	WebElement succesfulRegisterLabel;

	public MyAuthenticationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailAddressFor1AccountField() {
		return driver.findElement(By.id("email_create"));
	}

	public WebElement getCreateAnAccountButton() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	}

	public WebElement getMrsCheckBox() {
		return driver.findElement(By.id("id_gender2"));
	}

	public WebElement getFirstName1Field() {
		return driver.findElement(By.id("customer_firstname"));
	}

	public WebElement getLastName1Field() {
		return driver.findElement(By.id("customer_lastname"));
	}

	public WebElement getPassword1Field() {
		return driver.findElement(By.id("id=\"passwd\""));
	}

	public Select getSelectDayOfBirth() {
		selectDayOfBirth = new Select(driver.findElement(By.id("days")));
		return selectDayOfBirth;
	}

	public Select getSelectMonthOfBirth() {
		selectMonthOfBirth = new Select(driver.findElement(By.id("months")));
		return selectMonthOfBirth;
	}

	public Select getSelectYearOfBirth() {
		selectYearOfBirth = new Select(driver.findElement(By.id("years")));
		return selectYearOfBirth;
	}

	public WebElement getAddress1Field() {
		return driver.findElement(By.id("address1"));
	}
	
	public Select getSelectState1CheckBox() {
		return selectState1CheckBox = new Select(driver.findElement(By.id("id_state")));
	}
	
	public WebElement getCity1Field() {
		return driver.findElement(By.id("city"));
	}

	public WebElement getZip1Field() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getMobilePhone1Field() {
		return driver.findElement(By.id("phone_mobile"));
	}

	public WebElement getAssignInAddress1Field() {
		return driver.findElement(By.id("alias"));
	}

	public WebElement getRegisterButton1() {
		return driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
	}

	public WebElement getSuccesfulRegisterLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	}

	public void emailAddress1ForAccount(String emailAddress1) {
		this.getEmailAddressFor1AccountField();
		this.getEmailAddressFor1AccountField().sendKeys(emailAddress1);
	}

	public void accountButton() {
		this.getCreateAnAccountButton().click();
	}

	public void mrsCheckBox() {
		this.getMrsCheckBox().click();
	}

	public void firstName1(String firstName1) {
		this.getFirstName1Field().sendKeys(firstName1);
	}

	public void lastName1(String lastName1) {
		this.getLastName1Field().sendKeys(lastName1);
	}

	public void password1Field(String password1) {
		this.getPassword1Field().sendKeys(password1);
	}

	public void selectDayOfBirth(String day) {
		this.getSelectDayOfBirth().selectByVisibleText(day);
	}

	public void selectMonthOfBirth(String month) {
		this.getSelectMonthOfBirth().selectByVisibleText(month);
	}

	public void selectYearOfBirth(String year) {
		this.getSelectYearOfBirth().selectByVisibleText(year);
	}

	public void address1Field(String address1) {
		this.getAddress1Field().sendKeys(address1);
	}
	
	public void selectState1ChecBox(String state1) {
		this.getSelectState1CheckBox().selectByVisibleText(state1);
	}

	public void city1Field(String city1) {
		this.getCity1Field().sendKeys(city1);
	}

	public void zip1Field(String zip1) {
		this.getZip1Field().sendKeys(zip1);
	}

	public void mobilePhone1(String mobile1) {
		this.getMobilePhone1Field().sendKeys(mobile1);
	}

	public void assignAddress(String assignAddress) {
		this.getAssignInAddress1Field().sendKeys(assignAddress);
	}

	public void registerButton() {
		this.getRegisterButton1().click();
	}

	public void succesRegister() {
		this.getSuccesfulRegisterLabel().getText();
	}

}
