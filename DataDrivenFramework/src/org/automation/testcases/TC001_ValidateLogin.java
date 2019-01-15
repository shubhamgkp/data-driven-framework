package org.automation.testcases;

import java.io.IOException;

import org.automation.dataProvider.DataGenerator;
import org.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class TC001_ValidateLogin extends org.automation.base.DriverInstance {

	@Test(dataProvider="XL", dataProviderClass=DataGenerator.class)
	public void validateLogin(String uname, String passwd) throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.username(uname);
		login.pass(passwd);
		login.signin();		
	}	
	
	/*@DataProvider(name="Static")
	public Object[][] testDataGenerator()
	{
		Object[][] data = {{"Uname","Pass"},{"Uname2","Pass2"},{"Uname3","Pass3"}};
		return data;		
	}*/
}
