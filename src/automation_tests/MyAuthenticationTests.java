package automation_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation_pages.MyAuthenticationPage;

public class MyAuthenticationTests extends BaseTests {

	private String firstName1;
	private String lastName1;
	private String password1;
	private String day;
	private String month;
	private String year;
	private String address1;
	private String city1;
	private String zip1;
	private String mobile1;
	private String assignAddress;

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void createAnAccount() throws InterruptedException {
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

		String emailAddress1 = citacIzExcela.getStringData("MY AUTHENTICATION", 6, 3);
		myAuthenticationPage.emailAddress1ForAccount(emailAddress1);
		Thread.sleep(2000);

		myAuthenticationPage.accountButton();
		myAuthenticationPage.mrsCheckBox();

		String firstName1 = citacIzExcela.getStringData("MY AUTHENTICATION", 9, 3);
		String lastName1 = citacIzExcela.getStringData("MY AUTHENTICATION", 10, 3);

		String password1 = citacIzExcela.getStringData("MY AUTHENTICATION", 11, 3);
		String day = citacIzExcela.getStringData("MY AUTHENTICATION", 12, 3);
		String month = citacIzExcela.getStringData("MY AUTHENTICATION", 13, 3);
		String year = citacIzExcela.getStringData("MY AUTHENTICATION", 14, 3);
		String address1 = citacIzExcela.getStringData("MY AUTHENTICATION", 15, 3);
		String city1 = citacIzExcela.getStringData("MY AUTHENTICATION", 16, 3);
		String state1 = citacIzExcela.getStringData("MY AUTHENTICATION", 17, 3);
		String zip1 = citacIzExcela.getStringData("MY AUTHENTICATION", 18, 3);
		String mobile1 = citacIzExcela.getStringData("MY AUTHENTICATION", 19, 3);
		String assignAddress = citacIzExcela.getStringData("MY AUTHENTICATION", 20, 3);

		myAuthenticationPage.firstName1(firstName1);
		Thread.sleep(2000);
		myAuthenticationPage.lastName1(lastName1);
		Thread.sleep(2000);
		myAuthenticationPage.password1Field(password1);
		Thread.sleep(2000);
		myAuthenticationPage.selectDayOfBirth(day);
		Thread.sleep(2000);
		myAuthenticationPage.selectMonthOfBirth(month);
		Thread.sleep(2000);
		myAuthenticationPage.selectYearOfBirth(year);
		Thread.sleep(2000);
		myAuthenticationPage.address1Field(address1);
		Thread.sleep(2000);
		myAuthenticationPage.city1Field(city1);
		Thread.sleep(2000);
		myAuthenticationPage.getSelectState1CheckBox();
		Thread.sleep(2000);
		myAuthenticationPage.zip1Field(zip1);
		Thread.sleep(2000);
		myAuthenticationPage.mobilePhone1(mobile1);
		Thread.sleep(2000);
		myAuthenticationPage.assignAddress(assignAddress);
		Thread.sleep(2000);
		myAuthenticationPage.registerButton();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
