package org.automation.pages;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fstnm(String fname) throws IOException
	{		
		driver.findElement(By.xpath(Utility.fetchElementsValue("f_name"))).sendKeys(fname);
	}
	
	public void lstnm(String lname) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("l_name"))).sendKeys(lname);;
	}
	
	public void mobile(String mob) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("mo_number"))).sendKeys(mob);;
	}
	
	public void psd(String psd) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchElementsValue("pass_enter"))).sendKeys(psd);;
	}
	
	public void dd(String dobdd) throws IOException, InterruptedException
	{		
		//Thread.sleep(5000);
		Select date = new Select(driver.findElement(By.xpath(Utility.fetchElementsValue("dd_enter"))));
		date.selectByVisibleText(dobdd);
	}
	
	public void mm(String dobmm) throws IOException, InterruptedException
	{		
		//Thread.sleep(5000);
		Select month = new Select(driver.findElement(By.xpath(Utility.fetchElementsValue("mm_enter"))));
		month.selectByVisibleText(dobmm);
	}
	
	public void yy(String dobyy) throws IOException, InterruptedException
	{		
		//Thread.sleep(5000);
		Select year = new Select(driver.findElement(By.xpath(Utility.fetchElementsValue("yy_enter"))));
		year.selectByVisibleText(dobyy);
	}
	
	public void gender() throws IOException, InterruptedException
	{
		//Thread.sleep(5000);
		driver.findElement(By.xpath(Utility.fetchElementsValue("gender_enter"))).click();;	
		
	}
	
	public void signUp() throws IOException, InterruptedException
	{
		//Thread.sleep(5000);
		driver.findElement(By.xpath(Utility.fetchElementsValue("signup_click"))).click();;
	}
	
}
