package org.automation.pages;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void username(String uname) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("user_id"))).sendKeys(uname);;
	}
	
	public void pass(String pwd) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("user_pass"))).sendKeys(pwd);;
	}
	
	public void signin() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("user_login"))).click();;
	}
}
