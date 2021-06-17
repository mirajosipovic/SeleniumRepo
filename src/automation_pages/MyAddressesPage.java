package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class MyAddressesPage {
	WebDriver driver;

	WebElement updateButton;
	WebElement deleteButton;
	
	WebElement addNewAddressButton;
	WebElement backToYourAccountButton; 
	WebElement addressField;  
	WebElement cityField;
	
	//WebElement stateField;
	Select selectStateField;
	
	WebElement zipPostalCodeField;
	WebElement countryField;
	WebElement homePhoneField;
	WebElement mobilePhoneFieled;
	WebElement assignAnAddressField;
	WebElement saveButton;
	WebElement backToYourAddress;

	public MyAddressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUpdateButton() {
		//return driver.findElement(By.linkText("Update"));
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]/span"));
	}

	public WebElement getAddNewAddressButton() {
		//return driver.findElement(By.className("btn btn-default button button-medium"));
		//return driver.findElement(By.linkText("Add an address"));
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span"));
	}

	public WebElement getBackToYourAccountButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
	}

	public WebElement getAddressField() {
		return driver.findElement(By.id("address1"));
	}
	
	public WebElement getCityField() {
		return driver.findElement(By.id("city"));
	}

	/*public WebElement getStateField() {
		return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]"));                                     
		return driver.findElement(By.id("uniform-id_state"));
	}*/
	
	/*public Select getSelect
		selectStateField = new Select(driver.findElement(By.id("uniform-id_state")));
		//return selectStateField = new Select(driver.findElement(By.id("uniform-id_state")));
	}*/
	
	public Select getSelectStateField() {
		return selectStateField = new Select(driver.findElement(By.id("id_state")));
	
		//return selectStateField = new Select(driver.findElement(By.id("uniform-id_state"))); //probaj ovo
	}

	public WebElement getZipPostalCodeField() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getCountryField() {
		return driver.findElement(By.id("id_country"));
	}

	public WebElement getHomePhoneField() {
		return driver.findElement(By.id("phone"));
	}

	public WebElement getMobilePhoneFieled() {
		return driver.findElement(By.id("phone_mobile"));
	}

	public WebElement getAssignAnAddressField() {
		return driver.findElement(By.id("alias"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"submitAddress\"]"));
		// return driver.findElement(By.id("submitAddress"));
		// return driver.findElement(By.className("button-medium"));
		// return driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span/i"));
		// return driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span"));

	}

	public WebElement getBackToYourAddress() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
	}

	public void updateButton() {
		this.getUpdateButton().click();
	}

	public void deleteButton() {
		this.getDeleteButton().click();
	}

	public void addNewAddressButton() {
		this.getAddNewAddressButton().click();
	}

	public void backToYourAccount() {
		this.getBackToYourAccountButton().click();
	}

	public void addressField(String address) {
		this.getAddressField().clear();
		this.getAddressField().sendKeys(address);
	}

	public void selectStateField(String state) {
		this.getSelectStateField().selectByVisibleText("Alabama");
		}
	
	/*
	public void selectState(String state) {
		Select state1 = new Select(driver.findElement(By.id("uniform-id_state")));
		state1.selectByVisibleText(state);
	}
	*/
	
	public void cityField(String city) {
		this.getCityField().clear();
		this.getCityField().sendKeys(city);
	}	

	public void zipPostalCodeField(CharSequence[] zip) {
		this.getZipPostalCodeField().clear();
		this.getZipPostalCodeField().sendKeys(zip);
	}

	public void countryField(String country) {
		this.getCountryField().clear();
		this.getCountryField().sendKeys(country);
	}

	public void homePhoneField(String homePhone) {
		this.getHomePhoneField().clear();
		this.getHomePhoneField().sendKeys(homePhone);
	}

	public void mobilePhoneField(String mobilePhone) {
		this.getMobilePhoneFieled().clear();
		this.getHomePhoneField().sendKeys(mobilePhone);
	}

	public void assignAnAddressField(String assignAnAddress) {
		this.getAssignAnAddressField().clear();
		this.getAssignAnAddressField().sendKeys(assignAnAddress);
	}

	public void saveButton() {
		this.getSaveButton().click();
	}

	public void backToYourAddress() {
		this.getBackToYourAddress().click();
	}

}
