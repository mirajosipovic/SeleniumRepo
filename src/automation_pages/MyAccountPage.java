package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;

	WebElement orderHistoryButton;
	WebElement myCreditSlipsButton;
	WebElement myAddressesButton;
	WebElement myPersonalInformationButton;
	WebElement myWishListsButton;
	WebElement homeButton;

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getOrderHistoryButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
	}

	public WebElement getMyCreditSlipsButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span"));
	}

	public WebElement getMyAddressesButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}

	public WebElement getMyPersonalInformationButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}

	public WebElement getMyWishListsButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}

	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
	}

	public void orderHistry() {
		this.getOrderHistoryButton().click();
	}

	public void myCreditSlips() {
		this.getMyCreditSlipsButton().click();
	}

	public void myAddress() {
		this.getMyAddressesButton().click();
	}

	public void myPersonalInformation() {
		this.getMyPersonalInformationButton().click();
	}

	public void myWishLists() {
		this.getMyWishListsButton().click();
	}

	public void homeButton() {
		this.getHomeButton().click();;
	}

}
