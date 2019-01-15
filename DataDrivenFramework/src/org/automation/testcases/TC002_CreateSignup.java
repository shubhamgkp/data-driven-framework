package org.automation.testcases;

import java.io.IOException;

import org.automation.base.DriverInstance;
import org.automation.dataProvider.DataGenerator;
import org.automation.pages.SignUpPage;
import org.testng.annotations.Test;

public class TC002_CreateSignup extends DriverInstance {

	@Test(dataProvider = "XL2", dataProviderClass=DataGenerator.class)
	public void signUpsubmit(String fstname, String surname, String mob, String pd, String d, String m, String y) throws IOException, InterruptedException
	{
		SignUpPage sign = new SignUpPage(driver);
		sign.fstnm(fstname);
		sign.lstnm(surname);
		sign.mobile(mob);
		sign.psd(pd);
		sign.dd(d);
		sign.mm(m);
		sign.yy(y);
		sign.gender();
		sign.signUp();
		
	}
}
