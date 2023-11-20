package com.ninjademo.qa.TestPages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninjademo.qa.Base.TestBase;
import com.ninjademo.qa.Pages.HomePage;
import com.ninjademo.qa.Pages.RegisterPage;
import com.ninjademo.qa.Utilities.Xls_DataProvider;

public class TestRegisterPage extends TestBase {

	HomePage hp;
	RegisterPage rp;

	@BeforeMethod
	public void openApplication() {

		openBrowser("Chrome");

		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
	}

	@Test(priority = '1', dataProvider = "testdata")
	public void RegisterUser(String firstname1, String lastname1, String emailid1, String phone1, String password1,
			String confirmpassword1) {

		hp.clickOnMyAccount();
		hp.clickOnRegister();
		rp.RegisterUser(firstname1, lastname1, emailid1, phone1, password1, confirmpassword1);

	}

	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = Xls_DataProvider.getTestData("Sheet1");
		return input;
	}

}