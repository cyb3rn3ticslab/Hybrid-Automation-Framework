package horus.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import horus.base.BaseTest;
import horus.pages.LoginPage;
import horus.pages.ManagerHomePage;
import horus.utilities.DataReader;

public class LogoutTest extends BaseTest {
	
	private LoginPage loginPage;
	private ManagerHomePage managerHomePage;

	@Test(priority = 1, description = "Test To Verify Log out from the application.")
	public void testToVerifyLogoutFromApplication() {
		loginPage = new LoginPage(driver);
		managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));
		loginPage = managerHomePage.clickLogout();
		Assert.assertTrue(loginPage.isAlertPresent());
		Assert.assertEquals(loginPage.getAlertText(), DataReader.getPropertyFromKey("SuccessLogoutAlertMessage"));
		loginPage.acceptAlert();
		Assert.assertTrue(loginPage.isPageDisplayed());
	}
}
