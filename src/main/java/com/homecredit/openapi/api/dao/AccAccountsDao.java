package com.homecredit.openapi.api.dao;

import com.homecredit.openapi.api.model.AccAccounts;

public interface AccAccountsDao {
	
	public void save(AccAccounts accAccounts)throws Exception;
	
	public void saveOrUpdate(AccAccounts accAccounts)throws Exception;

}
