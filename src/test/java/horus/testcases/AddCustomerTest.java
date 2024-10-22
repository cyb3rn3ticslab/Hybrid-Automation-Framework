package horus.testcases;

import horus.base.BaseTest;
import horus.pages.AddCustomerPage;
import horus.pages.CustomerRegisteredPage;
import horus.pages.LoginPage;
import horus.pages.ManagerHomePage;
import horus.testdata.DataProviders;
import horus.utilities.CommonMethods;
import horus.utilities.DataReader;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerTest extends BaseTest {
	
	private LoginPage loginPage;
	private ManagerHomePage managerHomePage;
	private AddCustomerPage addCustomerPage;
	private CustomerRegisteredPage customerRegisteredPage;

	@Test(priority = 1, description = "Test To Verify after clicking on New Customer, page redirects to Add New Customer page.")
	public void testToVerifyAddNewCustomerPage() {
		loginPage = new LoginPage(driver);
		managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));
		addCustomerPage = managerHomePage.clickAddCustomer();
		Assert.assertTrue(addCustomerPage.isPageDisplayed());
	}

	@Test(priority = 2, dataProvider = "AddNewCustomer", dataProviderClass = DataProviders.class, description = "Test To Verify after creating new Customer, page redirects to details of added customer")
	public void testToVerifyCustomerDetailsPage(String name, String gender, String dob, String Address, String City,
			String State, String pincode, String Mobile, String email, String password) {
		loginPage = new LoginPage(driver);
		managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));
		addCustomerPage = managerHomePage.clickAddCustomer();
		customerRegisteredPage = addCustomerPage.createNewCustomer(name, gender, dob, Address, City, State, pincode, Mobile, email, password);
		Assert.assertTrue(customerRegisteredPage.isPageDisplayed());
        CommonMethods.capturePageScreenshot("testToVerifyCustomerDetailsPage");
	}

	@Test(priority = 3, dataProvider = "VerifyCustomer", dataProviderClass = DataProviders.class, description = "Test To Verify after creating new Customer, page redirects to details of added customer")
	public void testToVerifyNewlyCreatedCustomerDetails(String name, String gender, String dob, String Address, String City, String State, String pincode, String Mobile, String email, String password) {
		loginPage = new LoginPage(driver);
		managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));
		addCustomerPage = managerHomePage.clickAddCustomer();
		customerRegisteredPage = addCustomerPage.createNewCustomer(name, gender, dob, Address, City, State, pincode, Mobile, email, password);
		Assert.assertTrue(customerRegisteredPage.isPageDisplayed());
		Assert.assertTrue(name.equalsIgnoreCase(customerRegisteredPage.getCustomerName()));
		Assert.assertTrue(gender.equalsIgnoreCase(customerRegisteredPage.getCustomerGender()));
        Assert.assertTrue(dob.equalsIgnoreCase(customerRegisteredPage.getCustomerDob()));
		Assert.assertTrue(Address.equalsIgnoreCase(customerRegisteredPage.getCustomerAddress()));
		Assert.assertTrue(City.equalsIgnoreCase(customerRegisteredPage.getCustomerCity()));
		Assert.assertTrue(State.equalsIgnoreCase(customerRegisteredPage.getCustomerState()));
		Assert.assertTrue(pincode.equalsIgnoreCase(customerRegisteredPage.getCustomerPin()));
		Assert.assertTrue(Mobile.equalsIgnoreCase(customerRegisteredPage.getCustomerMobileNo()));
        Assert.assertTrue(email.equalsIgnoreCase(customerRegisteredPage.getCustomerEmail()));
        CommonMethods.capturePageScreenshot("testToVerifyNewlyCreatedCustomerDetails");
	}
}
