package com.hcl.Businesslogic;



import org.openqa.selenium.By;

import com.hcl.pageobjects.PageObjects_Register;

public class BL_RegisterAccount extends Base{

	
	public void Registration()

	{
		try {
			
			driver.findElement(By.xpath(PageObjects_Register.User_NavMenu)).click();
			
			driver.findElement(By.xpath(PageObjects_Register.RegAccRdoButton)).click();
			
			 Extent_Reporting_Log_Pass(className_Report, "register page", ExtentReportFolder);
			
			driver.findElement(By.xpath(PageObjects_Register.continueButton)).click();
			 
			driver.findElement(By.xpath(PageObjects_Register.FirstName)).sendKeys(GetData("FirstName"));

			driver.findElement(By.xpath(PageObjects_Register.LastName)).sendKeys(GetData("LastName"));
			
			 Extent_Reporting_Log_Pass(className_Report, "register page", ExtentReportFolder);
			 
			driver.findElement(By.xpath(PageObjects_Register.emailreg)).sendKeys(Generic_Loginname+"@allfreemail.com"); 
			
			driver.findElement(By.xpath(PageObjects_Register.telephone)).sendKeys(GetData("telephone"));
			
			driver.findElement(By.xpath(PageObjects_Register.company)).sendKeys(GetData("company"));
			
			driver.findElement(By.xpath(PageObjects_Register.address1)).sendKeys(GetData("address one"));
			
			driver.findElement(By.xpath(PageObjects_Register.address2)).sendKeys(GetData("address two"));
			
			driver.findElement(By.xpath(PageObjects_Register.city)).sendKeys(GetData("city"));
			
			DropdownSelect(PageObjects_Register.country, GetData("country"));
			
			Extent_Reporting_Log_Pass(className_Report, "register page", ExtentReportFolder);
			Thread.sleep(3000);;
			driver.findElement(By.xpath(PageObjects_Register.postcode)).sendKeys("4500");
			
			
			DropdownSelect(PageObjects_Register.state, GetData("state"));
			
			System.out.println(Generic_Loginname);
            driver.findElement(By.xpath(PageObjects_Register.loginname)).sendKeys(Generic_Loginname);

            driver.findElement(By.xpath(PageObjects_Register.password1)).sendKeys(GetData("password"));
            
            driver.findElement(By.xpath(PageObjects_Register.password2)).sendKeys(GetData("Confirm password"));
            
            Extent_Reporting_Log_Pass(className_Report, "register page", ExtentReportFolder);
            
            driver.findElement(By.xpath(PageObjects_Register.newsletter)).click();
            
            driver.findElement(By.xpath(PageObjects_Register.privacy)).click();
            
            driver.findElement(By.xpath(PageObjects_Register.Continue)).click();
            
            Thread.sleep(2000);
      		driver.findElement(By.xpath("//div[text()='Welcome back Umapathy']")).click();
			
      		 Extent_Reporting_Log_Pass(className_Report, "register page", ExtentReportFolder);
		}catch(Exception e )
		{
		e.printStackTrace();	
		}
	}
	
	
}
