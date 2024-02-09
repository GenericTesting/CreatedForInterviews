package com.hcl.Businesslogic;

import org.openqa.selenium.By;

import com.hcl.pageobjects.PageObjects_Product;
import com.hcl.pageobjects.PageObjects_Register;

public class BL_Product extends Base{

	
	public void AddToCart()

	{
		try {
			 driver.findElement(By.xpath(PageObjects_Product.fragrance)).click();
			 Extent_Reporting_Log_Pass(className_Report, "product page", ExtentReportFolder);
			driver.findElement(By.xpath("(//a[contains(text(),'Men')])[4]")).click();

			String prodname = driver.findElement(By.xpath("(//a[@class='prdocutname'])[1]")).getText();
			String s2 = prodname.toLowerCase(); 
			System.out.println(s2);
			driver.findElement(By.xpath("(//div[@class='pricetag jumbotron']/a[1])[1]")).click();
			
			 Extent_Reporting_Log_Pass(className_Report, "cart", ExtentReportFolder);
			 driver.findElement(By.xpath(PageObjects_Product.cart)).click();
			
			driver.findElement(By.xpath("(//a[@id='cart_checkout1'])[1]")).click();
			 Extent_Reporting_Log_Pass(className_Report, "checkout page", ExtentReportFolder);
			//driver.findElement(By.xpath("(//a[text()='"+s2+"'])[2]")).click();
			
			
		}catch(Exception e )
		{
		e.printStackTrace();	
		}
	}
	
	
}
