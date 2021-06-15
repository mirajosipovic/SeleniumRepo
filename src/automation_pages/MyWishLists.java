package automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishLists {
	WebDriver driver;

	WebElement nameOfWishList;
	WebElement saveButton;
	WebElement deleteButton;
	WebElement backToYourAccount;
	//WebElement okPopUpButton; 
	WebElement wishList1;
	WebElement wishList2;
	WebElement wishList3;

	public MyWishLists(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getNameOfWishList() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"submitWishlist\"]/span"));
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34594\"]/td[6]/a/i"));
	}

	public WebElement getBackToYourAccount() {
		return driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a/span"));
	}
	
	public WebElement getWishList1() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34829\"]/td[1]/a"));
	}

	public WebElement getWishList2() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34830\"]/td[1]/a"));
	}

	public WebElement getWishList3() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34831\"]/td[1]/a"));
	}

	public void nameOfWishList(String name) {
		this.getNameOfWishList().clear();
		this.getNameOfWishList().sendKeys(name);
	}

	public void saveButton() {
		this.getSaveButton().click();
	}

	public void deleteButton() {
		this.getDeleteButton().click();
	}
	public void backToYourAccount() {
		this.getBackToYourAccount().click();
	}
	
	public void wishList1() {
		this.getWishList1().click();
	}
	public void wishList2() {
		this.getWishList1().click();
	}
	public void wishList3() {
		this.getWishList1().click();
	}
}
