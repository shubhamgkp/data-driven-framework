package org.automation.assertions;

import org.openqa.selenium.WebDriver;

public class CompareData {

	public boolean checkURL(WebDriver driver, String expURL)
	{
		boolean flag = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			flag = true;
		}
		return flag;
	}
	
	public static boolean checkTitle(WebDriver driver, String expTitle)
	{
		boolean flag = false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag = true;			
		}
		return flag;		
	}
}
