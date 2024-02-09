package com.hcl.Businesslogic;

import org.openqa.selenium.By;

import com.hcl.pageobjects.PageObjects_Login;
import com.hcl.pageobjects.PageObjects_Register;

public class BL_Login extends Base{

	               

public void Login()

{
	try {
				driver.navigate().to(GetData("URL"));
				
                //driver.findElement(By.xpath(PageObjects_Register.User_NavMenu)).click();

                driver.findElement(By.xpath(PageObjects_Login.loginname)).sendKeys(Generic_Loginname);
                
                driver.findElement(By.xpath(PageObjects_Login.loginpassword)).sendKeys(GetData("password"));

                driver.findElement(By.xpath(PageObjects_Login.login)).click();

               
                Thread.sleep(2000);

                }catch (Exception e) {

                                e.printStackTrace();

                                // TODO: handle exception

                }

               

}

	               

	                public static void main(String[] args) {

	                                // TODO Auto-generated method stub

	 

	                }

	}

