package com.hcl.Testcase;

import com.hcl.Businesslogic.Base;
import com.hcl.Businesslogic.BL_Login;
import com.hcl.Businesslogic.BL_Product;
import com.hcl.Businesslogic.BL_RegisterAccount;

public class TC_A0001_ProductOrder extends Base {

	
	 public static BL_RegisterAccount RegisterPage=new BL_RegisterAccount();
	 public static BL_Login LoginPage=new BL_Login();
	 public static BL_Product Product=new BL_Product();

    // public static CORE_MyToolBox MT = new CORE_MyToolBox();
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {

              

              InitiateDriver();

              RegisterPage.Registration();
              
              Product.AddToCart();
              
              //LoginPage.Login();

              // MT.goToMytoolBox();

              //MT.register_Product();

             

              TeardownDriver(driver);

                             

              } catch (Exception e)

              {

                              // TODO Auto-generated catch block

                              e.printStackTrace();

              }

}









}

