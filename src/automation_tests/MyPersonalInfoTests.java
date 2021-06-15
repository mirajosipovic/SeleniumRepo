package automation_tests;

import java.sql.Driver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTests extends BaseTests{
	
	@BeforeMethod
	public void preSvakogtesta() {
		driver.navigate().to(homeUrl);
	}
		
		@Test(priority = 0)
		public void editPersonalInformation() throws InterruptedException {
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
	
		myAccountPage.myPersonalInformation();
		Thread.sleep(2000);
		
		String currentPassword = citacIzExcela.getStringData("MY PERSONAL INFO", 8, 3);
		String newPassword = citacIzExcela.getStringData("MY PERSONAL INFO", 9, 3);
		String confirmationPassword = citacIzExcela.getStringData("MY PERSONAL INFO", 10, 3);
		myPersonalInfo.curentPassword(currentPassword);
		Thread.sleep(2000);
		myPersonalInfo.newPassword(newPassword);
		Thread.sleep(2000);
		myPersonalInfo.confirmationPassword(confirmationPassword);
		Thread.sleep(2000);
		String textForAssertation = citacIzExcela.getStringData("MY PERSONAL INFO", 13, 3);
		String actualText = myPersonalInfo.getSuccesfullUpdate().getText();
	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
