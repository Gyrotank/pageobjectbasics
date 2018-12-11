package com.w2a.pages.crm.accounts;

import com.w2a.base.AbstractPage;

public class CreateAccountPage  extends AbstractPage {
	
	
	public void createAccount(String accountName){
		
		type("accountname_CSS",accountName);
		
	}

}
