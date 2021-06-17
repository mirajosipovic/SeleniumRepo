package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishListsPage {
	WebDriver driver;

	WebElement nameOfWishList1Field;
	WebElement nameOfWishList2Field;
	WebElement nameOfWishList3Filed;
	WebElement saveButton;
	WebElement deleteWishList1Label;
	WebElement deleteWishList2Label;
	WebElement deleteWishList3Label;
	WebElement backToYourAccount;

	public MyWishListsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getNameOfWishList1Field() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getNameOfWishList2Field() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getNameOfWishList3Field() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"submitWishlist\"]/span"));
	}

	public WebElement getDeleteWishList1Label() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35284\"]/td[6]/a/i"));
	}

	public WebElement getDeleteWishList2Label() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35285\"]/td[6]/a/i"));
	}

	public WebElement getDeleteWishList3Label() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35296\"]/td[6]/a/i"));
	}

	public WebElement getBackToYourAccount() {
		return driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a/span"));
	}

	public void nameOfWishList1(String nameOfWish1) {
		this.getNameOfWishList1Field().clear();
		this.getNameOfWishList1Field().sendKeys(nameOfWish1);
	}

	public void nameOfWishList2(String nameOfWish2) {
		this.getNameOfWishList2Field().clear();
		this.getNameOfWishList2Field().sendKeys(nameOfWish2);
	}

	public void nameOfWishList3(String nameOfWish3) {
		this.getNameOfWishList3Field().clear();
		this.getNameOfWishList3Field().sendKeys(nameOfWish3);
	}

	public void saveButton() {
		this.getSaveButton().click();
	}

	public void deleteWishList1() {
		this.getDeleteWishList1Label().click();
	}

	public void deleteWishList2() {
		this.getDeleteWishList2Label().click();
	}

	public void deleteWishList3() {
		this.getDeleteWishList3Label().click();
	}

	public void backToYourAccount() {
		this.getBackToYourAccount().click();
	}

}
