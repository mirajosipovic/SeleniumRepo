package automation_tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishListsTests extends BaseTests {

	private String nameOfWish;

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	  @Test(priority = 0) public void myWishList() throws InterruptedException {
	 
	 logInPage.signInTabClick(); Thread.sleep(2000); String emailAddress =
	 citacIzExcela.getStringData("LOG IN", 6, 3); String password =
	 citacIzExcela.getStringData("LOG IN", 7, 3);
	 
	 logInPage.emailAddress(emailAddress); Thread.sleep(2000);
	 logInPage.passwordField(password); Thread.sleep(2000); logInPage.signIn();
	 Thread.sleep(2000);
	 
	 myAccountPage.myWishLists(); Thread.sleep(2000);
	 
	String nameOfWish1 = citacIzExcela.getStringData("MY WISHLIST", 7, 3);
	myWishLists.nameOfWishList1(nameOfWish1); Thread.sleep(2000);
	 
	myWishLists.saveButton();
	 
	  String textForAssertion = citacIzExcela.getStringData("MY WISHLIST", 10, 3);
	  String actualText = myWishLists.getNameOfWishList1Field().getText();
	 Thread.sleep(2000); }
	
	
	 @Test(priority = 5) public void addMultipleWishList() throws
	 InterruptedException { logInPage.signInTabClick(); Thread.sleep(2000); String
	 emailAddress = citacIzExcela.getStringData("LOG IN", 6, 3); String password =
	 citacIzExcela.getStringData("LOG IN", 7, 3);
	 
	 logInPage.emailAddress(emailAddress); Thread.sleep(2000);
	 logInPage.passwordField(password); Thread.sleep(2000); logInPage.signIn();
	  Thread.sleep(2000);
	  
	  myAccountPage.myWishLists(); Thread.sleep(2000);
	  
	 String nameOfWish1 = citacIzExcela.getStringData("MY WISHLIST", 20, 3);
	 myWishLists.nameOfWishList1(nameOfWish1); Thread.sleep(2000);
	  myWishLists.saveButton(); Thread.sleep(2000);
	 
	 String nameOfWish2 = citacIzExcela.getStringData("MY WISHLIST", 22, 3);
	  myWishLists.nameOfWishList2(nameOfWish2); Thread.sleep(2000);
	  myWishLists.saveButton(); Thread.sleep(2000);
	 
	 String nameOfWish3 = citacIzExcela.getStringData("MY WISHLIST", 24, 3);
	 myWishLists.nameOfWishList3(nameOfWish3); Thread.sleep(2000);
	 myWishLists.saveButton(); Thread.sleep(2000);
	 
	 String textForAssertion = citacIzExcela.getStringData("MY WISHLIST", 27, 3);
	 String actualText = myWishLists.getBackToYourAccount().getText();
	 Thread.sleep(2000);  
	 }
	 
	@Test(priority = 10)
	public void removeWishList() throws InterruptedException {
		logInPage.signInTabClick();
		Thread.sleep(2000);
		String emailAddress = citacIzExcela.getStringData("LOG IN", 6, 3);
		String password = citacIzExcela.getStringData("LOG IN", 7, 3);

		logInPage.emailAddress(emailAddress);
		Thread.sleep(2000);
		logInPage.passwordField(password);
		Thread.sleep(2000);
		logInPage.signIn();
		Thread.sleep(2000);

		myAccountPage.myWishLists();
		Thread.sleep(2000);

		myWishLists.deleteWishList1();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		myWishLists.deleteWishList2();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		myWishLists.deleteWishList3();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		String textForAssertion = citacIzExcela.getStringData("MY WISHLIST", 50, 3);
		String actualText = myWishLists.getBackToYourAccount().getText();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
