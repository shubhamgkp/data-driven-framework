package org.automation.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="XL")
	public static Object[][] dataProvider() throws IOException
	{
		FileInputStream file = new FileInputStream("./XLData/TestData.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet sheet = wk.getSheet("Login");
		int numOfRows = sheet.getPhysicalNumberOfRows();
		Object[][] testData = new Object[numOfRows][2];
		
		for(int i=0; i<numOfRows; i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell pass = row.getCell(1);
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = pass.getStringCellValue();
		}
		return testData;		
	}
	
	@DataProvider(name="XL2")
	public static Object[][] dataProvider2() throws IOException
	{
		FileInputStream file = new FileInputStream("./XLData/TestData.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet sheet = wk.getSheet("SignUp");
		int numOfRows = sheet.getPhysicalNumberOfRows();
		Object[][] testDataSignUp = new Object[numOfRows][7];
		
		for(int i=0; i<numOfRows; i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell fname = row.getCell(0);
			XSSFCell sname = row.getCell(1);
			XSSFCell moenter = row.getCell(2);
			XSSFCell pwdenter = row.getCell(3);
			XSSFCell ddenter = row.getCell(4);
			XSSFCell mmenter = row.getCell(5);
			XSSFCell yyenter = row.getCell(6);
			testDataSignUp[i][0] = fname.getStringCellValue();
			testDataSignUp[i][1] = sname.getStringCellValue();
			testDataSignUp[i][2] = moenter.getStringCellValue();
			testDataSignUp[i][3] = pwdenter.getStringCellValue();
			testDataSignUp[i][4] = ddenter.getStringCellValue();
			testDataSignUp[i][5] = mmenter.getStringCellValue();
			testDataSignUp[i][6] = yyenter.getStringCellValue();
		}
		return testDataSignUp;		
	}
}
