package com.w2a.pages.crm.accounts;

import com.w2a.base.AbstractPage;

public class AccountsPage extends AbstractPage {
	
	
	
	
	public CreateAccountPage gotoCreateAccounts(){
		
		click("createaccountbtn_CSS");
		
		return new CreateAccountPage();
	}
	
	
	public void gotoImportAccounts(){
		
		
	}

}
