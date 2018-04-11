package com.homecredit.openapi.api.service;

import java.util.List;

import com.homecredit.openapi.api.dto.AccAccountsDto;

public interface AccAccountsService {
	
	public List <AccAccountsDto> centralGetDataAccAccounts (List <AccAccountsDto> paramAccAccounts) throws Exception;
	
	public void centralAddData(AccAccountsDto param)throws Exception;
	
	public void centralUpdateData(AccAccountsDto param)throws Exception;

}
