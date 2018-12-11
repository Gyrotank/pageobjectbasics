package com.w2a.pages;

import com.w2a.base.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.AbstractPage;

public class LoginPage extends AbstractPage{

	
	
	public ZohoAppPage doLogin(String username,String password){
		
		type("email_CSS",username);
		type("password_CSS",password);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
