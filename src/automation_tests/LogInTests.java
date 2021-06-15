package automation_tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation_pages.LogInPage;
import automation_pages.MyAccountPage;

public class LogInTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
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

		String textForAssertion = citacIzExcela.getStringData("LOG IN", 10, 3);
		String actualText = logInPage.getSignOutButton().getText();
		Thread.sleep(2000);

	}


		
	@Test(priority = 5)
	public void logInInvalidEmailValidPassword() throws InterruptedException {
		logInPage.signInTabClick();
		Thread.sleep(2000);
		String emailAddress = citacIzExcela.getStringData("LOG IN", 21, 3);
		String password = citacIzExcela.getStringData("LOG IN", 22, 3);

		logInPage.emailAddress(emailAddress);
		Thread.sleep(3000);
		logInPage.passwordField(password);
		Thread.sleep(3000);
		logInPage.signIn();
		Thread.sleep(2000);

		String textForAsssertion = citacIzExcela.getStringData("LOG IN", 26, 3);
		String actualText = logInPage.getAlertDanger().getText();

	}

	@Test(priority = 10)
	public void logInValidEmailInvalidPassword() throws InterruptedException {
		logInPage.signInTabClick();
		Thread.sleep(2000);
		String emailAddress = citacIzExcela.getStringData("LOG IN", 36, 3);
		String password = citacIzExcela.getStringData("LOG IN", 37, 3);

		logInPage.emailAddress(emailAddress);
		Thread.sleep(3000);
		logInPage.passwordField(password);
		Thread.sleep(3000);
		logInPage.signIn();
		Thread.sleep(2000);

		String textForAsssertion = citacIzExcela.getStringData("LOG IN", 41, 3);
		String actualText = logInPage.getAlertDanger().getText();

	}

	@Test(priority = 15)
	public void logInWithEmptyCredentials() throws InterruptedException {
		logInPage.signInTabClick();
		Thread.sleep(2000);
		logInPage.signIn();
		Thread.sleep(2000);

		String textForAsssertion = citacIzExcela.getStringData("LOG IN", 56, 3);
		String actualText = logInPage.getAlertDanger().getText();

	}

	@Test(priority = 20)
	public void logOut() throws InterruptedException {
		logInPage.signInTabClick();
		String emailAddress = citacIzExcela.getStringData("LOG OUT", 6, 3);
		String password = citacIzExcela.getStringData("LOG OUT", 7, 3);

		logInPage.emailAddress(emailAddress);
		Thread.sleep(3000);
		logInPage.passwordField(password);
		Thread.sleep(3000);
		logInPage.signIn();
		Thread.sleep(2000);
		logInPage.signOut();
		Thread.sleep(2000);

		String textForAsssertion = citacIzExcela.getStringData("LOG OUT", 11, 3);
		String actualText = logInPage.getSignOutButton().getText();

	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
