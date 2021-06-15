package automation_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation_pages.MyAccountPage;
import automation_pages.MyAddressesPage;
import automation_pages.MyAuthenticationPage;
import automation_pages.MyPersonalInfoPage;
import automation_pages.MyWishListsPage;
import automation_pages.LogInPage;

public class BaseTests {
	WebDriver driver;

	LogInPage logInPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	MyAuthenticationPage myAuthenticationPage;
	MyPersonalInfoPage myPersonalInfo;
	MyWishListsPage myWishLists;

	ExcelReader citacIzExcela;
	String homeUrl;

	@BeforeClass
	public void preSvihTestova() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		logInPage = new LogInPage(driver);
		myAccountPage = new MyAccountPage(driver);
		myAddressesPage = new MyAddressesPage(driver);
		myAuthenticationPage = new MyAuthenticationPage(driver);
		myPersonalInfo = new MyPersonalInfoPage(driver);
		myWishLists = new MyWishListsPage(driver);

		citacIzExcela = new ExcelReader("data/Test_plan.xlsx");
		homeUrl = "http://automationpractice.com/index.php/";
	}

	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}

}
