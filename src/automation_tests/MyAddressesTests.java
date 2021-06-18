package automation_tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation_pages.MyAddressesPage;

public class MyAddressesTests extends BaseTests {

	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void updateAddress() throws InterruptedException {
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
		
		myAccountPage.myAddress();
		Thread.sleep(2000);
		myAddressesPage.updateButton();
		Thread.sleep(2000);
		
		String address = citacIzExcela.getStringData("MY ADDRESS", 8, 3);
		myAddressesPage.addressField(address);              
		Thread.sleep(2000);
	
		String city = citacIzExcela.getStringData("MY ADDRESS", 9, 3);
		myAddressesPage.cityField(city);
		Thread.sleep(2000);

		String state = citacIzExcela.getStringData("MY ADDRESS", 10, 3);
		myAddressesPage.selectStateField(state);
		Thread.sleep(5200);
				
		String zip = citacIzExcela.getStringData("MY ADDRESS", 11, 3);  //ovde pada test
		myAddressesPage.zipPostalCodeField(zip);
		Thread.sleep(2000);
			 
		String homePhone = citacIzExcela.getStringData("MY ADDRESS", 12, 3);
		myAddressesPage.homePhoneField(homePhone);
		Thread.sleep(2000);
		
		String assignAddress = citacIzExcela.getStringData("MY ADDRESS", 13, 3);
		myAddressesPage.assignAnAddressField(assignAddress);
		Thread.sleep(2000);
		
		myAddressesPage.saveButton();
		Thread.sleep(2000);	 	
	}

	@Test(priority = 5)
	public void addAddress() throws InterruptedException {
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
		
		myAccountPage.myAddress();
		Thread.sleep(2000);
		
		myAddressesPage.addNewAddressButton();
		Thread.sleep(2000);	
		
		String address = citacIzExcela.getStringData("MY ADDRESS", 28, 3);
		myAddressesPage.addressField(address);
		Thread.sleep(2000);
		
		String city = citacIzExcela.getStringData("MY ADDRESS", 29, 3);
		myAddressesPage.cityField(city);
		Thread.sleep(2000);		
	
		String state = citacIzExcela.getStringData("MY ADDRESS", 30, 3);
		myAddressesPage.selectStateField(state);
		Thread.sleep(2000);
	
		String zip = citacIzExcela.getStringData("MY ADDRESS", 11, 3);  //ovde pada test
		myAddressesPage.zipPostalCodeField(zip);
		Thread.sleep(2000);
		
		String homePhone = citacIzExcela.getStringData("MY ADDRESS", 32, 3);
		myAddressesPage.homePhoneField(homePhone);
		Thread.sleep(2000);
		
		String mobilePhone = citacIzExcela.getStringData("MY ADDRESS", 33, 3);
		myAddressesPage.mobilePhoneField(mobilePhone);
		Thread.sleep(2000);
		
		String assignAnAddress = citacIzExcela.getStringData("MY ADDRESS", 34, 3);
		myAddressesPage.assignAnAddressField(assignAnAddress);
		Thread.sleep(2000);
		
		myAddressesPage.saveButton();
		Thread.sleep(2000);		 
	}

	@Test(priority = 10)
	public void removeAddress() throws InterruptedException {
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
		myAccountPage.myAddress();
		Thread.sleep(2000);
		myAddressesPage.deleteButton();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
