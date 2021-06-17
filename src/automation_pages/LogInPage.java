package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;

	WebElement signInTabClick;
	WebElement emailAddressField;
	WebElement passwordField;
	WebElement signInButton;
	WebElement signOutButton;
	WebElement alertDanger;

	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInTabClick() {
		return driver.findElement(By.className("login"));
	}

	public WebElement getEmailAddressField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}

	public WebElement getSignOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}

	public WebElement getAlertDanger() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]"));
	}

	public void signInTabClick() {
		this.getSignInTabClick().click();
	}

	public void emailAddress(String email) {
		this.getEmailAddressField().clear();
		this.getEmailAddressField().sendKeys(email);
	}

	public void passwordField(String password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}

	public void signIn() {
		this.getSignInButton().click();
	}

	// public void signOut() {
	// this.getSignOutButton().click();
	// }
	public String textFromSignOut() {
		return this.getSignOutButton().getText();
	}

	public void alertDanger() {
		this.getAlertDanger().getText();
	}

}
