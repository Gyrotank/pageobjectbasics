package com.w2a.testcases;

import com.w2a.base.AbstractPage;

import org.testng.annotations.AfterSuite;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		AbstractPage.quit();
		
	}

}
